package org.omg.hw.protection;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class ProtectionMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.protection.ProtectionMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "retrieveWDMSwitchData", new java.lang.Integer(0));
		m_opsHash.put ( "getAllProtectionGroups", new java.lang.Integer(1));
		m_opsHash.put ( "retrieveSwitchData", new java.lang.Integer(2));
		m_opsHash.put ( "HW_getAllERPSProtectionGroups", new java.lang.Integer(3));
		m_opsHash.put ( "getWDMProtectionGroup", new java.lang.Integer(4));
		m_opsHash.put ( "HW_getIFProtectionGroup", new java.lang.Integer(5));
		m_opsHash.put ( "retrieveESwitchData", new java.lang.Integer(6));
		m_opsHash.put ( "retrieveIFSwitchData", new java.lang.Integer(7));
		m_opsHash.put ( "getEProtectionGroup", new java.lang.Integer(8));
		m_opsHash.put ( "getAllNUTTPNames", new java.lang.Integer(9));
		m_opsHash.put ( "performProtectionCommand", new java.lang.Integer(10));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(11));
		m_opsHash.put ( "getIPProtectionGroup", new java.lang.Integer(12));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(13));
		m_opsHash.put ( "HW_getAllXPICGroups", new java.lang.Integer(14));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(15));
		m_opsHash.put ( "getAllPreemptibleTPNames", new java.lang.Integer(16));
		m_opsHash.put ( "modifyProtectionGroup", new java.lang.Integer(17));
		m_opsHash.put ( "getAllProtectedTPNames", new java.lang.Integer(18));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(19));
		m_opsHash.put ( "getAllEProtectionGroups", new java.lang.Integer(20));
		m_opsHash.put ( "HW_getERPSProtectionGroup", new java.lang.Integer(21));
		m_opsHash.put ( "setOwner", new java.lang.Integer(22));
		m_opsHash.put ( "setProtectionGroup", new java.lang.Integer(23));
		m_opsHash.put ( "getAllWDMProtectionGroups", new java.lang.Integer(24));
		m_opsHash.put ( "performWDMProtectionCommand", new java.lang.Integer(25));
		m_opsHash.put ( "createProtectionGroup", new java.lang.Integer(26));
		m_opsHash.put ( "HW_getXPICGroup", new java.lang.Integer(27));
		m_opsHash.put ( "deleteProtectionGroup", new java.lang.Integer(28));
		m_opsHash.put ( "HW_getAllIFProtectionGroups", new java.lang.Integer(29));
		m_opsHash.put ( "retrieveIPSwitchData", new java.lang.Integer(30));
		m_opsHash.put ( "getAdjacentTPs", new java.lang.Integer(31));
		m_opsHash.put ( "getAllProtectionSubnetworks", new java.lang.Integer(32));
		m_opsHash.put ( "getProtectionGroup", new java.lang.Integer(33));
		m_opsHash.put ( "getAllIPProtectionGroups", new java.lang.Integer(34));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.protection.ProtectionMgr_I _this()
	{
		return org.omg.hw.protection.ProtectionMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.protection.ProtectionMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // retrieveWDMSwitchData
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.WDMSwitchDataList_THolder _arg1= new org.omg.hw.protection.WDMSwitchDataList_THolder();
				_out = handler.createReply();
				retrieveWDMSwitchData(_arg0,_arg1);
				org.omg.hw.protection.WDMSwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllProtectionGroups
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.protection.ProtectionGroupList_THolder _arg2= new org.omg.hw.protection.ProtectionGroupList_THolder();
				org.omg.hw.protection.ProtectionGroupIterator_IHolder _arg3= new org.omg.hw.protection.ProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.protection.ProtectionGroupList_THelper.write(_out,_arg2.value);
				org.omg.hw.protection.ProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // retrieveSwitchData
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.SwitchDataList_THolder _arg1= new org.omg.hw.protection.SwitchDataList_THolder();
				_out = handler.createReply();
				retrieveSwitchData(_arg0,_arg1);
				org.omg.hw.protection.SwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // HW_getAllERPSProtectionGroups
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.HW_ERPSProtectionGroupList_THolder _arg1= new org.omg.hw.protection.HW_ERPSProtectionGroupList_THolder();
				_out = handler.createReply();
				HW_getAllERPSProtectionGroups(_arg0,_arg1);
				org.omg.hw.protection.HW_ERPSProtectionGroupList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getWDMProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.WDMProtectionGroup_THolder _arg1= new org.omg.hw.protection.WDMProtectionGroup_THolder();
				_out = handler.createReply();
				getWDMProtectionGroup(_arg0,_arg1);
				org.omg.hw.protection.WDMProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // HW_getIFProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.HW_IFProtectionGroup_THolder _arg1= new org.omg.hw.protection.HW_IFProtectionGroup_THolder();
				_out = handler.createReply();
				HW_getIFProtectionGroup(_arg0,_arg1);
				org.omg.hw.protection.HW_IFProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // retrieveESwitchData
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.ESwitchDataList_THolder _arg1= new org.omg.hw.protection.ESwitchDataList_THolder();
				_out = handler.createReply();
				retrieveESwitchData(_arg0,_arg1);
				org.omg.hw.protection.ESwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // retrieveIFSwitchData
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.IFSwitchDataList_THolder _arg1= new org.omg.hw.protection.IFSwitchDataList_THolder();
				_out = handler.createReply();
				retrieveIFSwitchData(_arg0,_arg1);
				org.omg.hw.protection.IFSwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getEProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.EProtectionGroup_THolder _arg1= new org.omg.hw.protection.EProtectionGroup_THolder();
				_out = handler.createReply();
				getEProtectionGroup(_arg0,_arg1);
				org.omg.hw.protection.EProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllNUTTPNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllNUTTPNames(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // performProtectionCommand
			{
			try
			{
				org.omg.hw.protection.ProtectionCommand_T _arg0=org.omg.hw.protection.ProtectionCommand_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg1=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg2=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg3=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.SwitchData_THolder _arg4= new org.omg.hw.protection.SwitchData_THolder();
				_out = handler.createReply();
				performProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.protection.SwitchData_THelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getCapabilities
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
			case 12: // getIPProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.IPProtectionGroup_THolder _arg1= new org.omg.hw.protection.IPProtectionGroup_THolder();
				_out = handler.createReply();
				getIPProtectionGroup(_arg0,_arg1);
				org.omg.hw.protection.IPProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setUserLabel
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
			case 14: // HW_getAllXPICGroups
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.protection.HW_XPICGroupList_THolder _arg2= new org.omg.hw.protection.HW_XPICGroupList_THolder();
				org.omg.hw.protection.HW_XPICGroupIterator_IHolder _arg3= new org.omg.hw.protection.HW_XPICGroupIterator_IHolder();
				_out = handler.createReply();
				HW_getAllXPICGroups(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.protection.HW_XPICGroupList_THelper.write(_out,_arg2.value);
				org.omg.hw.protection.HW_XPICGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setNativeEMSName
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
			case 16: // getAllPreemptibleTPNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPreemptibleTPNames(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // modifyProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.PGPModifyData_T _arg1=org.omg.hw.protection.PGPModifyData_THelper.read(_input);
				org.omg.hw.protection.ProtectionGroup_THolder _arg2= new org.omg.hw.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				modifyProtectionGroup(_arg0,_arg1,_arg2);
				org.omg.hw.protection.ProtectionGroup_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getAllProtectedTPNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllProtectedTPNames(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setAdditionalInfo
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
			case 20: // getAllEProtectionGroups
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.protection.EProtectionGroupList_THolder _arg2= new org.omg.hw.protection.EProtectionGroupList_THolder();
				org.omg.hw.protection.EProtectionGroupIterator_IHolder _arg3= new org.omg.hw.protection.EProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllEProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.protection.EProtectionGroupList_THelper.write(_out,_arg2.value);
				org.omg.hw.protection.EProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // HW_getERPSProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.HW_ERPSProtectionGroup_THolder _arg1= new org.omg.hw.protection.HW_ERPSProtectionGroup_THolder();
				_out = handler.createReply();
				HW_getERPSProtectionGroup(_arg0,_arg1);
				org.omg.hw.protection.HW_ERPSProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // setOwner
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
			case 23: // setProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg1=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.ProtectionGroup_THolder _arg2= new org.omg.hw.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				setProtectionGroup(_arg0,_arg1,_arg2);
				org.omg.hw.protection.ProtectionGroup_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllWDMProtectionGroups
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.protection.WDMProtectionGroupList_THolder _arg2= new org.omg.hw.protection.WDMProtectionGroupList_THolder();
				org.omg.hw.protection.WDMProtectionGroupIterator_IHolder _arg3= new org.omg.hw.protection.WDMProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllWDMProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.protection.WDMProtectionGroupList_THelper.write(_out,_arg2.value);
				org.omg.hw.protection.WDMProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // performWDMProtectionCommand
			{
			try
			{
				org.omg.hw.protection.ProtectionCommand_T _arg0=org.omg.hw.protection.ProtectionCommand_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg1=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg2=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg3=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.WDMSwitchData_THolder _arg4= new org.omg.hw.protection.WDMSwitchData_THolder();
				_out = handler.createReply();
				performWDMProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.protection.WDMSwitchData_THelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // createProtectionGroup
			{
			try
			{
				org.omg.hw.protection.PGPCreateData_T _arg0=org.omg.hw.protection.PGPCreateData_THelper.read(_input);
				org.omg.hw.protection.ProtectionGroup_THolder _arg1= new org.omg.hw.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				createProtectionGroup(_arg0,_arg1);
				org.omg.hw.protection.ProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // HW_getXPICGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.HW_XPICGroup_THolder _arg1= new org.omg.hw.protection.HW_XPICGroup_THolder();
				_out = handler.createReply();
				HW_getXPICGroup(_arg0,_arg1);
				org.omg.hw.protection.HW_XPICGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // deleteProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg1=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.ProtectionGroup_THolder _arg2= new org.omg.hw.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				deleteProtectionGroup(_arg0,_arg1,_arg2);
				org.omg.hw.protection.ProtectionGroup_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // HW_getAllIFProtectionGroups
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.HW_IFProtectionGroupList_THolder _arg1= new org.omg.hw.protection.HW_IFProtectionGroupList_THolder();
				_out = handler.createReply();
				HW_getAllIFProtectionGroups(_arg0,_arg1);
				org.omg.hw.protection.HW_IFProtectionGroupList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // retrieveIPSwitchData
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.IPSwitchDataList_THolder _arg1= new org.omg.hw.protection.IPSwitchDataList_THolder();
				_out = handler.createReply();
				retrieveIPSwitchData(_arg0,_arg1);
				org.omg.hw.protection.IPSwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAdjacentTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAdjacentTPs(_arg0,_arg1);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getAllProtectionSubnetworks
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.protection.ProtectionSubnetworkList_THolder _arg1= new org.omg.hw.protection.ProtectionSubnetworkList_THolder();
				org.omg.hw.protection.ProtectionSubnetworkIterator_IHolder _arg2= new org.omg.hw.protection.ProtectionSubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllProtectionSubnetworks(_arg0,_arg1,_arg2);
				org.omg.hw.protection.ProtectionSubnetworkList_THelper.write(_out,_arg1.value);
				org.omg.hw.protection.ProtectionSubnetworkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getProtectionGroup
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.protection.ProtectionGroup_THolder _arg1= new org.omg.hw.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				getProtectionGroup(_arg0,_arg1);
				org.omg.hw.protection.ProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllIPProtectionGroups
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.protection.IPProtectionGroupList_THolder _arg2= new org.omg.hw.protection.IPProtectionGroupList_THolder();
				org.omg.hw.protection.IPProtectionGroupIterator_IHolder _arg3= new org.omg.hw.protection.IPProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllIPProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.protection.IPProtectionGroupList_THelper.write(_out,_arg2.value);
				org.omg.hw.protection.IPProtectionGroupIterator_IHelper.write(_out,_arg3.value);
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
