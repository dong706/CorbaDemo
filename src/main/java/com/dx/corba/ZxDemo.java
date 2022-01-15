package com.dx.corba;

import java.io.UnsupportedEncodingException;

import org.omg.CORBA.ORB;
import org.omg.CORBA.SystemException;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.zx.common.Common_IHolder;
import org.omg.zx.emsMgr.EMSMgr_I;
import org.omg.zx.emsMgr.EMSMgr_IHelper;
import org.omg.zx.emsSession.EmsSession_I;
import org.omg.zx.emsSession.EmsSession_IHolder;
import org.omg.zx.emsSessionFactory.EmsSessionFactory_I;
import org.omg.zx.emsSessionFactory.EmsSessionFactory_IHelper;
import org.omg.zx.globaldefs.NameAndStringValue_T;
import org.omg.zx.globaldefs.ProcessingFailureException;
import org.omg.zx.managedElement.ManagedElementList_THolder;
import org.omg.zx.managedElementManager.ManagedElementMgr_I;
import org.omg.zx.nmsSession.NmsSession_I;
import org.omg.zx.nmsSession.NmsSession_IPOATie;
import org.omg.zx.subscription.EMSSubscriptionMgr_I;
import org.omg.zx.topologicalLink.TopologicalLinkList_THolder;
import org.omg.zx.topologicalLink.TopologicalLink_T;

public class ZxDemo {

	static ORB orb;
	static EMSMgr_I emsMgr = null;
	static EmsSession_I emsSession = null;
	static ManagedElementMgr_I meMgr = null;
	static EMSSubscriptionMgr_I emsSpMgr = null;

	public boolean invoke() {
		// 建立连接登录、建立消息通道
		try {
			String[] args = new String[2];
			args[0] = "-ORBInitRef";
			args[1] = "NameService=corbaloc::" + "CORBA服务器IP" + ":"
					+ "CORBA服务器端口" + "/NameService";
			for (int i = 0; i < args.length; i++) {
				System.out.println("初始化ORB对象的启动参数为： arg[" + i + "] = "
						+ args[i]);
			}
			orb = org.omg.CORBA.ORB.init(args, null);
			System.out.println("成功初始化ORB对象!－－－－Initialize Orb");
		} catch (SystemException ex) {
			System.out.println("初始化ORB对象异常！");
			System.out.println(ex.getMessage());
		}
		if (orb == null) {
			System.out.println("orb == null");
			return false;
		}
		// Get Nameservice reference
		NamingContext nsRootContext = null;
		try {
			org.omg.CORBA.Object objRef = orb
					.resolve_initial_references("NameService");
			nsRootContext = NamingContextHelper.narrow(objRef);
			System.out.println("成功获取取名字服务!－－－－Get Nameservice reference");
		} catch (org.omg.CORBA.ORBPackage.InvalidName ex) {
			System.out.println("取名字服务索引异常!");
			System.out.println(ex.getMessage());
		}
		// 3.1 Get Reference to EMSSessionFactory
		NameComponent[] name = new NameComponent[1];
		name[0] = new NameComponent("ZTE/T3", "EMSFactory");
		System.out.println("NameComponent: '" + "ZTE/T3 " + "','EMSFactory'");
		org.omg.CORBA.Object obj = null;
		try {
			obj = nsRootContext.resolve(name);
			System.out
					.println("成功获取EMSSession工厂!   Get Reference to EMSSessionFactory");
		} catch (NotFound ex) {
			System.out.println("取EMSSession工厂异常!---NotFound---");
			ex.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName ex) {
			System.out.println("取EMSSession工厂异常!---InvalidName---");
			ex.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.CannotProceed ex) {
			System.out.println("取EMSSession工厂异常!---CannotProceed---");
			ex.printStackTrace();
		}

		// 开始准备登陆并且获取EmsSession!
		EmsSessionFactory_I m_emsFactory = EmsSessionFactory_IHelper
				.narrow(obj);
		NmsSession_I csession = null;
		POA rootpoa = null;
		try {
			// get reference to rootpoa & activate the POAManager
			System.out.println("取得rootpoa并激活POAManager!");
			rootpoa = POAHelper.narrow(orb
					.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();
			// create servant and register it with the ORB
			System.out.println("注册NmsSession到ORB!");
			NmsSessionImpl nmsSessionImpl = new NmsSessionImpl();
			// nmsSessionImpl.setORB(orb);
			byte[] objectID = rootpoa.activate_object(nmsSessionImpl);
			// create a tie, with servant being the delegate.
			System.out.println("创建NmsSession并且托管给POA!");
			NmsSession_IPOATie tie = new NmsSession_IPOATie(nmsSessionImpl,rootpoa);
			// obtain the objectRef for the tie
			// this step also implicitly activates the the object
			System.out.println("在orb上激活NmsSession对象!");
			csession = tie._this(orb);
		} catch (Exception ex) {
			System.out.println("创建NmsSession对象过程,执行异常!");
			System.out.println(ex.getMessage());
		}
		EmsSession_IHolder sessionHolder = new EmsSession_IHolder();
		try {
			System.out.println("获取EmsSession引用对象");
			m_emsFactory.getEmsSession("CORBA服务用户名", "CORBA服务密码", csession,
					sessionHolder);
			System.out.println("NMSsession ---" + csession.toString());
		} catch (org.omg.zx.globaldefs.ProcessingFailureException ex) {
			System.out
					.println("获取EmsSession引用对象，异常！---ProcessingFailureException---");
			System.out.println("可能是用户名或者密码错误，或者权限不够，或者已登陆的用户还未退出！");
			System.out.println(ex.toString());
		}
		emsSession = sessionHolder.value;
		System.out.println("EMSsession ---" + emsSession.toString());
		emsSession.ping();
		// 初始化 EMS 管理器
		try {
			System.out.println("初始化 EMS 管理器!");
			Common_IHolder mgrHolder = new Common_IHolder();
			emsSession.getManager("EMS", mgrHolder);
			emsMgr = EMSMgr_IHelper.narrow(mgrHolder.value);
			System.out.println("EMS_Manager To String ---" + emsMgr.toString());
		} catch (ProcessingFailureException pfe) {
			System.out
					.println("初始化 EMS 管理器异常!---ProcessingFailureException---");
			System.out.println(pfe.toString());
		}

		try {
			initEvent(emsMgr, rootpoa);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	private static void initEvent(EMSMgr_I emsMgr, POA rootpoa) {
		// 通过远程对象获取网元信息
		ManagedElementList_THolder meList = null;
		try {
			meList = new ManagedElementList_THolder();
			meMgr.getAllManagedElements(meList);

			for (int i = 0, size = meList.value.length; i < size; i++) {

				System.out.print(Stringformat(meList.value[i].meType) + "\t"
						+ Stringformat(meList.value[i].userLabel) + "\t"
						+ Stringformat(meList.value[i].nativeEMSName) + "\t"
						+ meList.value[i].hardwareVersion + "\t"
						+ meList.value[i].productName + "\t");
				NameAndStringValue_T[] arr = meList.value[i].name;
				for (int j = 0; j < arr.length; j++) {
					System.out.print(meList.value[i].name[j].name + ":"
							+ meList.value[i].name[j].value + "\t");
				}
				System.out.println();

			}
			TopologicalLinkList_THolder topoList = new TopologicalLinkList_THolder();
			emsMgr.getAllTopLevelTopologicalLinks(topoList);
			TopologicalLink_T[] a = topoList.value;
			for (int i = 0, size = a.length; i < size; i++) {
				System.out.println(Stringformat(a[i].userLabel));

				NameAndStringValue_T[] aa = a[i].name;
				for (NameAndStringValue_T nameAndStringValue_T : aa) {
					System.out.println("aa:" + nameAndStringValue_T.name + "~"
							+ nameAndStringValue_T.value);
				}

				NameAndStringValue_T[] b = a[i].aEndTP;
				for (NameAndStringValue_T nameAndStringValue_T : b) {
					System.out.println("a:" + nameAndStringValue_T.name + "~"
							+ nameAndStringValue_T.value);
				}

				NameAndStringValue_T[] c = a[i].zEndTP;
				for (NameAndStringValue_T nameAndStringValue_T : c) {
					System.out.println("z:" + nameAndStringValue_T.name + "~"
							+ nameAndStringValue_T.value);
				}
			}
		} catch (ProcessingFailureException ex) {
			System.out.println(ex.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 字符集转换
	 * @param value
	 * @return
	 */
	private static String Stringformat(String value) {
		try {
			return new String(value.getBytes("ISO8859_1"), "GB2312");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String args[]) {
		try {
			ZxDemo zxDemo = new ZxDemo();
			zxDemo.invoke();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
