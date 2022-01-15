package org.omg.zx.managedElementManager;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class ManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.managedElementManager.ManagedElementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(0));
		m_opsHash.put ( "getAllPTPs", new java.lang.Integer(1));
		m_opsHash.put ( "getContainedPotentialTPs", new java.lang.Integer(2));
		m_opsHash.put ( "getMEClockCoordinates", new java.lang.Integer(3));
		m_opsHash.put ( "activateCrossConnections", new java.lang.Integer(4));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(5));
		m_opsHash.put ( "deactivateCrossConnections", new java.lang.Integer(6));
		m_opsHash.put ( "getContainedPotentialTPNames", new java.lang.Integer(7));
		m_opsHash.put ( "createCrossConnections", new java.lang.Integer(8));
		m_opsHash.put ( "getAllPSEs", new java.lang.Integer(9));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(10));
		m_opsHash.put ( "getManagedElement", new java.lang.Integer(11));
		m_opsHash.put ( "deleteCrossConnections", new java.lang.Integer(12));
		m_opsHash.put ( "getAllCrossConnections", new java.lang.Integer(13));
		m_opsHash.put ( "getContainedCurrentTPNames", new java.lang.Integer(14));
		m_opsHash.put ( "getContainedCurrentTPs", new java.lang.Integer(15));
		m_opsHash.put ( "getSFPInfo", new java.lang.Integer(16));
		m_opsHash.put ( "getContainedInUseTPNames", new java.lang.Integer(17));
		m_opsHash.put ( "getCrossConnection", new java.lang.Integer(18));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(19));
		m_opsHash.put ( "getMEconfigData", new java.lang.Integer(20));
		m_opsHash.put ( "getContainedInUseTPs", new java.lang.Integer(21));
		m_opsHash.put ( "setTPData", new java.lang.Integer(22));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(23));
		m_opsHash.put ( "getAllManagedElementNamesByIterator", new java.lang.Integer(24));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(25));
		m_opsHash.put ( "getAllUnacknowledgedActiveAlarms", new java.lang.Integer(26));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(27));
		m_opsHash.put ( "getModifiedManagedElementNames", new java.lang.Integer(28));
		m_opsHash.put ( "setCrossConnections", new java.lang.Integer(29));
		m_opsHash.put ( "getAllEquipmentInnerConnections", new java.lang.Integer(30));
		m_opsHash.put ( "getAllManagedElementsByIterator", new java.lang.Integer(31));
		m_opsHash.put ( "setLocation", new java.lang.Integer(32));
		m_opsHash.put ( "getMECoordinates", new java.lang.Integer(33));
		m_opsHash.put ( "getTP", new java.lang.Integer(34));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.zx.managedElementManager.ManagedElementMgr_I _this()
	{
		return org.omg.zx.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllActiveAlarms
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.zx.alarmMgr.ProbableCauseList_THelper.read(_input);
				org.omg.zx.alarmMgr.PerceivedSeverity_T[] _arg2=org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.omg.zx.notifications.EventList_THolder _arg4= new org.omg.zx.notifications.EventList_THolder();
				org.omg.zx.notifications.EventIterator_IHolder _arg5= new org.omg.zx.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.zx.notifications.EventList_THelper.write(_out,_arg4.value);
				org.omg.zx.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllPTPs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.zx.terminationPoint.TerminationPointList_THolder _arg3= new org.omg.zx.terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getAllPTPs(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getContainedPotentialTPs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.terminationPoint.TerminationPointList_THolder _arg3= new org.omg.zx.terminationPoint.TerminationPointList_THolder();
				org.omg.zx.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.omg.zx.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.omg.zx.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getMEClockCoordinates
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.zx.managedElement.MECoordinateList_THolder _arg1= new org.omg.zx.managedElement.MECoordinateList_THolder();
				_out = handler.createReply();
				getMEClockCoordinates(_arg0,_arg1);
				org.omg.zx.managedElement.MECoordinateList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // activateCrossConnections
			{
			try
			{
				org.omg.zx.subnetworkConnection.CrossConnect_T[] _arg0=org.omg.zx.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg1= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				activateCrossConnections(_arg0,_arg1,_arg2);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllManagedElementNames
			{
			try
			{
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg0= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // deactivateCrossConnections
			{
			try
			{
				org.omg.zx.subnetworkConnection.CrossConnect_T[] _arg0=org.omg.zx.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg1= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deactivateCrossConnections(_arg0,_arg1,_arg2);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getContainedPotentialTPNames
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainedPotentialTPNames(_arg0,_arg1,_arg2);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // createCrossConnections
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.CrossConnect_T[] _arg1=org.omg.zx.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				createCrossConnections(_arg0,_arg1,_arg2);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllPSEs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.notifications.EventList_THolder _arg1= new org.omg.zx.notifications.EventList_THolder();
				_out = handler.createReply();
				getAllPSEs(_arg0,_arg1);
				org.omg.zx.notifications.EventList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllManagedElements
			{
			try
			{
				org.omg.zx.managedElement.ManagedElementList_THolder _arg0= new org.omg.zx.managedElement.ManagedElementList_THolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0);
				org.omg.zx.managedElement.ManagedElementList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getManagedElement
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.managedElement.ManagedElement_THolder _arg1= new org.omg.zx.managedElement.ManagedElement_THolder();
				_out = handler.createReply();
				getManagedElement(_arg0,_arg1);
				org.omg.zx.managedElement.ManagedElement_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // deleteCrossConnections
			{
			try
			{
				org.omg.zx.subnetworkConnection.CrossConnect_T[] _arg0=org.omg.zx.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg1= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deleteCrossConnections(_arg0,_arg1,_arg2);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllCrossConnections
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg3= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				org.omg.zx.subnetworkConnection.CCIterator_IHolder _arg4= new org.omg.zx.subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				org.omg.zx.subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getContainedCurrentTPNames
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainedCurrentTPNames(_arg0,_arg1,_arg2);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getContainedCurrentTPs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.terminationPoint.TerminationPointList_THolder _arg3= new org.omg.zx.terminationPoint.TerminationPointList_THolder();
				org.omg.zx.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.omg.zx.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.omg.zx.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getSFPInfo
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.terminationPoint.BrdPortSFPInfoList_THolder _arg1= new org.omg.zx.terminationPoint.BrdPortSFPInfoList_THolder();
				_out = handler.createReply();
				getSFPInfo(_arg0,_arg1);
				org.omg.zx.terminationPoint.BrdPortSFPInfoList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getContainedInUseTPNames
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainedInUseTPNames(_arg0,_arg1,_arg2);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getCrossConnection
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.CrossConnect_THolder _arg1= new org.omg.zx.subnetworkConnection.CrossConnect_THolder();
				_out = handler.createReply();
				getCrossConnection(_arg0,_arg1);
				org.omg.zx.subnetworkConnection.CrossConnect_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setAdditionalInfo
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NVSList_THolder _arg1= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getMEconfigData
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.zx.globaldefs.StringList_THelper.read(_input);
				org.omg.zx.managedElementManager.MEConfigData_THolder _arg2= new org.omg.zx.managedElementManager.MEConfigData_THolder();
				_out = handler.createReply();
				getMEconfigData(_arg0,_arg1,_arg2);
				org.omg.zx.managedElementManager.MEConfigData_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getContainedInUseTPs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.terminationPoint.TerminationPointList_THolder _arg3= new org.omg.zx.terminationPoint.TerminationPointList_THolder();
				org.omg.zx.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.omg.zx.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.omg.zx.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // setTPData
			{
			try
			{
				org.omg.zx.subnetworkConnection.TPData_T _arg0=org.omg.zx.subnetworkConnection.TPData_THelper.read(_input);
				org.omg.zx.terminationPoint.TerminationPoint_THolder _arg1= new org.omg.zx.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				setTPData(_arg0,_arg1);
				org.omg.zx.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getCapabilities
			{
			try
			{
				org.omg.zx.common.CapabilityList_THolder _arg0= new org.omg.zx.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				org.omg.zx.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllManagedElementNamesByIterator
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				org.omg.zx.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.zx.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNamesByIterator(_arg0,_arg1,_arg2);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.zx.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // setUserLabel
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getAllUnacknowledgedActiveAlarms
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.zx.alarmMgr.ProbableCauseList_THelper.read(_input);
				org.omg.zx.alarmMgr.PerceivedSeverity_T[] _arg2=org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.omg.zx.notifications.EventList_THolder _arg4= new org.omg.zx.notifications.EventList_THolder();
				org.omg.zx.notifications.EventIterator_IHolder _arg5= new org.omg.zx.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllUnacknowledgedActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.zx.notifications.EventList_THelper.write(_out,_arg4.value);
				org.omg.zx.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // setNativeEMSName
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getModifiedManagedElementNames
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_ulong();
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				org.omg.zx.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.zx.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getModifiedManagedElementNames(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.omg.zx.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // setCrossConnections
			{
			try
			{
				org.omg.zx.subnetworkConnection.CrossConnect_T[] _arg0=org.omg.zx.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.CrossConnect_T[] _arg1=org.omg.zx.subnetworkConnection.CrossConnectList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg2= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg3= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				setCrossConnections(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllEquipmentInnerConnections
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.subnetworkConnection.CrossConnectList_THolder _arg3= new org.omg.zx.subnetworkConnection.CrossConnectList_THolder();
				org.omg.zx.subnetworkConnection.CCIterator_IHolder _arg4= new org.omg.zx.subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllEquipmentInnerConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				org.omg.zx.subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAllManagedElementsByIterator
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.zx.managedElement.ManagedElementList_THolder _arg1= new org.omg.zx.managedElement.ManagedElementList_THolder();
				org.omg.zx.managedElement.ManagedElementIterator_IHolder _arg2= new org.omg.zx.managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementsByIterator(_arg0,_arg1,_arg2);
				org.omg.zx.managedElement.ManagedElementList_THelper.write(_out,_arg1.value);
				org.omg.zx.managedElement.ManagedElementIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // setLocation
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setLocation(_arg0,_arg1);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getMECoordinates
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.zx.managedElement.MECoordinateList_THolder _arg1= new org.omg.zx.managedElement.MECoordinateList_THolder();
				_out = handler.createReply();
				getMECoordinates(_arg0,_arg1);
				org.omg.zx.managedElement.MECoordinateList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getTP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.terminationPoint.TerminationPoint_THolder _arg1= new org.omg.zx.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				getTP(_arg0,_arg1);
				org.omg.zx.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
