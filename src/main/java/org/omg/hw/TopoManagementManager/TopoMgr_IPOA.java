package org.omg.hw.TopoManagementManager;

/**
 *	Generated from IDL interface "TopoMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class TopoMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.TopoManagementManager.TopoMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getViewInfoByTopoSubnetwork", new java.lang.Integer(0));
		m_opsHash.put ( "getAllClockSourceViewlTopologicalLinks", new java.lang.Integer(1));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(2));
		m_opsHash.put ( "getClockSourceSubnetworkViewInfo", new java.lang.Integer(3));
		m_opsHash.put ( "setOwner", new java.lang.Integer(4));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(5));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(6));
		m_opsHash.put ( "getProtectSubnetworkViewInfo", new java.lang.Integer(7));
		m_opsHash.put ( "getTopoSubnetworkViewInfo", new java.lang.Integer(8));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(9));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/TopoManagementManager/TopoMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.TopoManagementManager.TopoMgr_I _this()
	{
		return org.omg.hw.TopoManagementManager.TopoMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.TopoManagementManager.TopoMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.TopoManagementManager.TopoMgr_IHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // getViewInfoByTopoSubnetwork
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.TopoManagementManager.NodeList_THolder _arg2= new org.omg.hw.TopoManagementManager.NodeList_THolder();
				org.omg.hw.TopoManagementManager.NodeIterator_IHolder _arg3= new org.omg.hw.TopoManagementManager.NodeIterator_IHolder();
				_out = handler.createReply();
				getViewInfoByTopoSubnetwork(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.TopoManagementManager.NodeList_THelper.write(_out,_arg2.value);
				org.omg.hw.TopoManagementManager.NodeIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllClockSourceViewlTopologicalLinks
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.topologicalLink.TopologicalLinkList_THolder _arg1= new org.omg.hw.topologicalLink.TopologicalLinkList_THolder();
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder _arg2= new org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllClockSourceViewlTopologicalLinks(_arg0,_arg1,_arg2);
				org.omg.hw.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg1.value);
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getCapabilities
			{
			try
			{
				org.omg.hw.common.CapabilityList_THolder _arg0= new org.omg.hw.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				org.omg.hw.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getClockSourceSubnetworkViewInfo
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.TopoManagementManager.NodeList_THolder _arg1= new org.omg.hw.TopoManagementManager.NodeList_THolder();
				org.omg.hw.TopoManagementManager.NodeIterator_IHolder _arg2= new org.omg.hw.TopoManagementManager.NodeIterator_IHolder();
				_out = handler.createReply();
				getClockSourceSubnetworkViewInfo(_arg0,_arg1,_arg2);
				org.omg.hw.TopoManagementManager.NodeList_THelper.write(_out,_arg1.value);
				org.omg.hw.TopoManagementManager.NodeIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setOwner
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setAdditionalInfo
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NVSList_THolder _arg1= new org.omg.hw.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setUserLabel
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getProtectSubnetworkViewInfo
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.TopoManagementManager.NodeList_THolder _arg1= new org.omg.hw.TopoManagementManager.NodeList_THolder();
				org.omg.hw.TopoManagementManager.NodeIterator_IHolder _arg2= new org.omg.hw.TopoManagementManager.NodeIterator_IHolder();
				_out = handler.createReply();
				getProtectSubnetworkViewInfo(_arg0,_arg1,_arg2);
				org.omg.hw.TopoManagementManager.NodeList_THelper.write(_out,_arg1.value);
				org.omg.hw.TopoManagementManager.NodeIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getTopoSubnetworkViewInfo
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.TopoManagementManager.NodeList_THolder _arg1= new org.omg.hw.TopoManagementManager.NodeList_THolder();
				org.omg.hw.TopoManagementManager.NodeIterator_IHolder _arg2= new org.omg.hw.TopoManagementManager.NodeIterator_IHolder();
				_out = handler.createReply();
				getTopoSubnetworkViewInfo(_arg0,_arg1,_arg2);
				org.omg.hw.TopoManagementManager.NodeList_THelper.write(_out,_arg1.value);
				org.omg.hw.TopoManagementManager.NodeIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setNativeEMSName
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
