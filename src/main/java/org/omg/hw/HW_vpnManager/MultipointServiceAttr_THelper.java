package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "MultipointServiceAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class MultipointServiceAttr_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.MultipointServiceAttr_THelper.id(),"MultipointServiceAttr_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("paraList", org.omg.hw.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("staticMacList", org.omg.hw.HW_vpnManager.StaticMacAddressList_THelper.type(), null),new org.omg.CORBA.StructMember("shgList", org.omg.hw.HW_vpnManager.SplitHorizonGroupAttrList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.MultipointServiceAttr_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.MultipointServiceAttr_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/MultipointServiceAttr_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.MultipointServiceAttr_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.MultipointServiceAttr_T result = new org.omg.hw.HW_vpnManager.MultipointServiceAttr_T();
		result.paraList = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.staticMacList = org.omg.hw.HW_vpnManager.StaticMacAddressList_THelper.read(in);
		result.shgList = org.omg.hw.HW_vpnManager.SplitHorizonGroupAttrList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.MultipointServiceAttr_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.paraList);
		org.omg.hw.HW_vpnManager.StaticMacAddressList_THelper.write(out,s.staticMacList);
		org.omg.hw.HW_vpnManager.SplitHorizonGroupAttrList_THelper.write(out,s.shgList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
