package org.omg.hw.managedElementManager;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class ManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.managedElementManager.ManagedElementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(0));
		m_opsHash.put ( "setADCInfo", new java.lang.Integer(1));
		m_opsHash.put ( "getContainingSubnetworkNames", new java.lang.Integer(2));
		m_opsHash.put ( "getContainedPotentialTPs", new java.lang.Integer(3));
		m_opsHash.put ( "getContainedCurrentTPs", new java.lang.Integer(4));
		m_opsHash.put ( "setTPData", new java.lang.Integer(5));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(6));
		m_opsHash.put ( "createFTP", new java.lang.Integer(7));
		m_opsHash.put ( "getManagedElement", new java.lang.Integer(8));
		m_opsHash.put ( "getContainedInUseTPs", new java.lang.Integer(9));
		m_opsHash.put ( "getADCInfo", new java.lang.Integer(10));
		m_opsHash.put ( "getTP", new java.lang.Integer(11));
		m_opsHash.put ( "getAllAlarmsByFTP", new java.lang.Integer(12));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(13));
		m_opsHash.put ( "checkActiveAlarms", new java.lang.Integer(14));
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(15));
		m_opsHash.put ( "getContainedPotentialTPNames", new java.lang.Integer(16));
		m_opsHash.put ( "getContainingTPs", new java.lang.Integer(17));
		m_opsHash.put ( "getAPRInfo", new java.lang.Integer(18));
		m_opsHash.put ( "setwdmALCInfo", new java.lang.Integer(19));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(20));
		m_opsHash.put ( "setAPEInfo", new java.lang.Integer(21));
		m_opsHash.put ( "getNEStaticInfo", new java.lang.Integer(22));
		m_opsHash.put ( "deleteCrossConnections", new java.lang.Integer(23));
		m_opsHash.put ( "getFTPMembers", new java.lang.Integer(24));
		m_opsHash.put ( "setOwner", new java.lang.Integer(25));
		m_opsHash.put ( "getAllPTPs", new java.lang.Integer(26));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(27));
		m_opsHash.put ( "modifyCrossConnection", new java.lang.Integer(28));
		m_opsHash.put ( "setAPRInfo", new java.lang.Integer(29));
		m_opsHash.put ( "modifyFTPMembers", new java.lang.Integer(30));
		m_opsHash.put ( "getAllCrossConnections", new java.lang.Integer(31));
		m_opsHash.put ( "getActiveAlarms", new java.lang.Integer(32));
		m_opsHash.put ( "getContainedCurrentTPNames", new java.lang.Integer(33));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(34));
		m_opsHash.put ( "setotnALCInfo", new java.lang.Integer(35));
		m_opsHash.put ( "getContainingTPNames", new java.lang.Integer(36));
		m_opsHash.put ( "deactivateCrossConnections", new java.lang.Integer(37));
		m_opsHash.put ( "getAllPTPNames", new java.lang.Integer(38));
		m_opsHash.put ( "activateCrossConnections", new java.lang.Integer(39));
		m_opsHash.put ( "deleteFTP", new java.lang.Integer(40));
		m_opsHash.put ( "getContainedInUseTPNames", new java.lang.Integer(41));
		m_opsHash.put ( "createCrossConnections", new java.lang.Integer(42));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.managedElementManager.ManagedElementMgr_I _this()
	{
		return org.omg.hw.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getCapabilities
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
			case 1: // setADCInfo
			{
			try
			{
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder _arg1= new org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder();
				_out = handler.createReply();
				setADCInfo(_arg0,_arg1);
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getContainingSubnetworkNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingSubnetworkNames(_arg0,_arg1);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getContainedPotentialTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg3= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getContainedCurrentTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg3= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setTPData
			{
			try
			{
				org.omg.hw.subnetworkConnection.TPData_T _arg0=org.omg.hw.subnetworkConnection.TPData_THelper.read(_input);
				org.omg.hw.terminationPoint.TerminationPoint_THolder _arg1= new org.omg.hw.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				setTPData(_arg0,_arg1);
				org.omg.hw.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setAdditionalInfo
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
			case 7: // createFTP
			{
			try
			{
				org.omg.hw.flowDomain.FTPCreateData_T _arg0=org.omg.hw.flowDomain.FTPCreateData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.hw.terminationPoint.TerminationPoint_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.omg.hw.terminationPoint.TerminationPoint_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getManagedElement
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.managedElement.ManagedElement_THolder _arg1= new org.omg.hw.managedElement.ManagedElement_THolder();
				_out = handler.createReply();
				getManagedElement(_arg0,_arg1);
				org.omg.hw.managedElement.ManagedElement_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getContainedInUseTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg3= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getADCInfo
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder _arg1= new org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder();
				_out = handler.createReply();
				getADCInfo(_arg0,_arg1);
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.terminationPoint.TerminationPoint_THolder _arg1= new org.omg.hw.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				getTP(_arg0,_arg1);
				org.omg.hw.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllAlarmsByFTP
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg3=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg4=org.omg.hw.notifications.ProbableCauseList_THelper.read(_input);
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg5=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg8= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllAlarmsByFTP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg8.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllManagedElementNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // checkActiveAlarms
			{
			try
			{
				org.omg.hw.CosNotification.StructuredEvent[] _arg0=org.omg.hw.notifications.EventList_THelper.read(_input);
				org.omg.hw.notifications.EventList_THolder _arg1= new org.omg.hw.notifications.EventList_THolder();
				_out = handler.createReply();
				checkActiveAlarms(_arg0,_arg1);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAllActiveAlarms
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.notifications.ProbableCauseList_THelper.read(_input);
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg2=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.omg.hw.notifications.EventList_THolder _arg4= new org.omg.hw.notifications.EventList_THolder();
				org.omg.hw.notifications.EventIterator_IHolder _arg5= new org.omg.hw.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg4.value);
				org.omg.hw.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getContainedPotentialTPNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getContainingTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg1= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getContainingTPs(_arg0,_arg1);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getAPRInfo
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder _arg1= new org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder();
				_out = handler.createReply();
				getAPRInfo(_arg0,_arg1);
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setwdmALCInfo
			{
			try
			{
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setwdmALCInfo(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // setUserLabel
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
			case 21: // setAPEInfo
			{
			try
			{
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setAPEInfo(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getNEStaticInfo
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getNEStaticInfo(_arg0,_arg1,_arg2,_arg3);
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
			case 23: // deleteCrossConnections
			{
			try
			{
				org.omg.hw.subnetworkConnection.CrossConnect_T[] _arg0=org.omg.hw.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg1= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deleteCrossConnections(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getFTPMembers
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_out = handler.createReply();
				getFTPMembers(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // setOwner
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
			case 26: // getAllPTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg4= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg5= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllPTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg4.value);
				org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAllManagedElements
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.managedElement.ManagedElementList_THolder _arg1= new org.omg.hw.managedElement.ManagedElementList_THolder();
				org.omg.hw.managedElement.ManagedElementIterator_IHolder _arg2= new org.omg.hw.managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2);
				org.omg.hw.managedElement.ManagedElementList_THelper.write(_out,_arg1.value);
				org.omg.hw.managedElement.ManagedElementIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // modifyCrossConnection
			{
			try
			{
				org.omg.hw.subnetworkConnection.CrossConnect_T _arg0=org.omg.hw.subnetworkConnection.CrossConnect_THelper.read(_input);
				org.omg.hw.subnetworkConnection.CrossConnect_T _arg1=org.omg.hw.subnetworkConnection.CrossConnect_THelper.read(_input);
				org.omg.hw.subnetworkConnection.CrossConnect_THolder _arg2= new org.omg.hw.subnetworkConnection.CrossConnect_THolder();
				_out = handler.createReply();
				modifyCrossConnection(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.CrossConnect_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // setAPRInfo
			{
			try
			{
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder _arg1= new org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder();
				_out = handler.createReply();
				setAPRInfo(_arg0,_arg1);
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // modifyFTPMembers
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.hw.subnetworkConnection.TPData_T[] _arg2=org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg4= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_out = handler.createReply();
				modifyFTPMembers(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAllCrossConnections
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg3= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				org.omg.hw.subnetworkConnection.CCIterator_IHolder _arg4= new org.omg.hw.subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getActiveAlarms
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.notifications.ProbableCauseList_THelper.read(_input);
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg2=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.omg.hw.notifications.EventList_THolder _arg4= new org.omg.hw.notifications.EventList_THolder();
				org.omg.hw.notifications.EventIterator_IHolder _arg5= new org.omg.hw.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg4.value);
				org.omg.hw.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getContainedCurrentTPNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // setNativeEMSName
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
			case 35: // setotnALCInfo
			{
			try
			{
				org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setotnALCInfo(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getContainingTPNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingTPNames(_arg0,_arg1);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // deactivateCrossConnections
			{
			try
			{
				org.omg.hw.subnetworkConnection.CrossConnect_T[] _arg0=org.omg.hw.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg1= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deactivateCrossConnections(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getAllPTPNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg4= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg5= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPTPNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // activateCrossConnections
			{
			try
			{
				org.omg.hw.subnetworkConnection.CrossConnect_T[] _arg0=org.omg.hw.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg1= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				activateCrossConnections(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // deleteFTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFTP(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getContainedInUseTPNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // createCrossConnections
			{
			try
			{
				org.omg.hw.subnetworkConnection.CrossConnect_T[] _arg0=org.omg.hw.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg1= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				org.omg.hw.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.hw.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				createCrossConnections(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				org.omg.hw.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
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
