package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class MultiLayerSubnetworkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "removeConnections", new java.lang.Integer(0));
		m_opsHash.put ( "getMultiLayerSubnetwork", new java.lang.Integer(1));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(2));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(3));
		m_opsHash.put ( "getAllTPPools", new java.lang.Integer(4));
		m_opsHash.put ( "setIntendedRoute", new java.lang.Integer(5));
		m_opsHash.put ( "getCallAndTopLevelConnectionsAndSNCs", new java.lang.Integer(6));
		m_opsHash.put ( "getIntendedRoute", new java.lang.Integer(7));
		m_opsHash.put ( "releaseCall", new java.lang.Integer(8));
		m_opsHash.put ( "deactivateSNC", new java.lang.Integer(9));
		m_opsHash.put ( "addConnections", new java.lang.Integer(10));
		m_opsHash.put ( "modifyCall", new java.lang.Integer(11));
		m_opsHash.put ( "getMLSNPPLink", new java.lang.Integer(12));
		m_opsHash.put ( "createAndActivateSNC", new java.lang.Integer(13));
		m_opsHash.put ( "getAllSubnetworkConnectionsWithTP", new java.lang.Integer(14));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", new java.lang.Integer(15));
		m_opsHash.put ( "setRoutesAdminState", new java.lang.Integer(16));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(17));
		m_opsHash.put ( "getAllSubnetworkConnections", new java.lang.Integer(18));
		m_opsHash.put ( "deleteSNC", new java.lang.Integer(19));
		m_opsHash.put ( "getAllInternalMLSNPPLinks", new java.lang.Integer(20));
		m_opsHash.put ( "getAllMLSNPPLinks", new java.lang.Integer(21));
		m_opsHash.put ( "getRoute", new java.lang.Integer(22));
		m_opsHash.put ( "switchRoute", new java.lang.Integer(23));
		m_opsHash.put ( "getAllSubordinateMLSNs", new java.lang.Integer(24));
		m_opsHash.put ( "getAllTopologicalLinksByIterator", new java.lang.Integer(25));
		m_opsHash.put ( "getAllEdgeMLSNPPLinks", new java.lang.Integer(26));
		m_opsHash.put ( "getRouteAndTopologicalLinks", new java.lang.Integer(27));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", new java.lang.Integer(28));
		m_opsHash.put ( "getAllCallIdsWithSNPPOrTNAName", new java.lang.Integer(29));
		m_opsHash.put ( "addRoute", new java.lang.Integer(30));
		m_opsHash.put ( "getSNC", new java.lang.Integer(31));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsWithME", new java.lang.Integer(32));
		m_opsHash.put ( "activateSNC", new java.lang.Integer(33));
		m_opsHash.put ( "getAllCallIdsWithTP", new java.lang.Integer(34));
		m_opsHash.put ( "setSRG", new java.lang.Integer(35));
		m_opsHash.put ( "createSNC", new java.lang.Integer(36));
		m_opsHash.put ( "modifyDiversityAndCorouting", new java.lang.Integer(37));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(38));
		m_opsHash.put ( "modifySNC", new java.lang.Integer(39));
		m_opsHash.put ( "getAllTopologicalLinks", new java.lang.Integer(40));
		m_opsHash.put ( "establishCall", new java.lang.Integer(41));
		m_opsHash.put ( "getAllCallsAndTopLevelConnections", new java.lang.Integer(42));
		m_opsHash.put ( "deactivateAndDeleteSNC", new java.lang.Integer(43));
		m_opsHash.put ( "getCallAndTopLevelConnections", new java.lang.Integer(44));
		m_opsHash.put ( "getAllSubordinateRAidsWithConnection", new java.lang.Integer(45));
		m_opsHash.put ( "getConnectionsAndRouteDetails", new java.lang.Integer(46));
		m_opsHash.put ( "getCall", new java.lang.Integer(47));
		m_opsHash.put ( "getSNCsByUserLabel", new java.lang.Integer(48));
		m_opsHash.put ( "getBackupRoutes", new java.lang.Integer(49));
		m_opsHash.put ( "getAllMLSNPPs", new java.lang.Integer(50));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCs", new java.lang.Integer(51));
		m_opsHash.put ( "removeRoute", new java.lang.Integer(52));
		m_opsHash.put ( "setLocation", new java.lang.Integer(53));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // removeConnections
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.zx.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				removeConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getMultiLayerSubnetwork
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_THolder _arg1= new org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_THolder();
				_out = handler.createReply();
				getMultiLayerSubnetwork(_arg0,_arg1);
				org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setUserLabel
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
			case 3: // getCapabilities
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
			case 4: // getAllTPPools
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.zx.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.zx.terminationPoint.TerminationPointList_THolder();
				org.omg.zx.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.zx.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllTPPools(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.terminationPoint.TerminationPointList_THelper.write(_out,_arg2.value);
				org.omg.zx.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setIntendedRoute
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.zx.globaldefs.NVSList_THolder _arg2= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg2._read (_input);
				_out = handler.createReply();
				setIntendedRoute(_arg0,_arg1,_arg2);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getCallAndTopLevelConnectionsAndSNCs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder _arg1= new org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder();
				_out = handler.createReply();
				getCallAndTopLevelConnectionsAndSNCs(_arg0,_arg1);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getIntendedRoute
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.omg.zx.globaldefs.NVSList_THolder _arg2= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg2._read (_input);
				org.omg.zx.subnetworkConnection.Route_THolder _arg3= new org.omg.zx.subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getIntendedRoute(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg2.value);
				org.omg.zx.subnetworkConnection.Route_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // releaseCall
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.zx.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder _arg2= new org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				releaseCall(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // deactivateSNC
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder _arg2= new org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateSNC(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // addConnections
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.SNCCreateData_T[] _arg1=org.omg.zx.subnetworkConnection.SNCCreateDataList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				org.omg.zx.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.zx.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder _arg4= new org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder _arg5= new org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addConnections(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg4.value);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // modifyCall
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.callSNC.CallModifyData_T _arg1=org.omg.zx.callSNC.CallModifyData_THelper.read(_input);
				org.omg.zx.callSNC.Call_THolder _arg2= new org.omg.zx.callSNC.Call_THolder();
				_out = handler.createReply();
				modifyCall(_arg0,_arg1,_arg2);
				org.omg.zx.callSNC.Call_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getMLSNPPLink
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THolder _arg2= new org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THolder();
				_out = handler.createReply();
				getMLSNPPLink(_arg0,_arg1,_arg2);
				org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // createAndActivateSNC
			{
			try
			{
				org.omg.zx.subnetworkConnection.SNCCreateData_T _arg0=org.omg.zx.subnetworkConnection.SNCCreateData_THelper.read(_input);
				org.omg.zx.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder _arg2= new org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateSNC(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllSubnetworkConnectionsWithTP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.zx.subnetworkConnection.SNCIterator_IHolder _arg4= new org.omg.zx.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				org.omg.zx.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAllCallsAndTopLevelConnectionsAndSNCsWithTP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg1=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg2= new org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg3= new org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCsWithTP(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg2.value);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // setRoutesAdminState
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.RouteNameAndAdminStateList_THolder _arg1= new org.omg.zx.subnetworkConnection.RouteNameAndAdminStateList_THolder();
				_arg1._read (_input);
				org.omg.zx.subnetworkConnection.SNCState_THolder _arg2= new org.omg.zx.subnetworkConnection.SNCState_THolder();
				_out = handler.createReply();
				setRoutesAdminState(_arg0,_arg1,_arg2);
				org.omg.zx.subnetworkConnection.RouteNameAndAdminStateList_THelper.write(_out,_arg1.value);
				org.omg.zx.subnetworkConnection.SNCState_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setNativeEMSName
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
			case 18: // getAllSubnetworkConnections
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.zx.subnetworkConnection.SNCIterator_IHolder _arg4= new org.omg.zx.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				org.omg.zx.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // deleteSNC
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteSNC(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getAllInternalMLSNPPLinks
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder();
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllInternalMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllMLSNPPLinks
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder();
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getRoute
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.omg.zx.subnetworkConnection.Route_THolder _arg2= new org.omg.zx.subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getRoute(_arg0,_arg1,_arg2);
				org.omg.zx.subnetworkConnection.Route_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // switchRoute
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.zx.subnetworkConnection.GradesOfImpact_T _arg2=org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T _arg3=org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.zx.subnetworkConnection.TPDataList_THolder _arg4= new org.omg.zx.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				org.omg.zx.globaldefs.NVSList_THolder _arg5= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg5._read (_input);
				org.omg.zx.subnetworkConnection.SNCState_THolder _arg6= new org.omg.zx.subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				switchRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg5.value);
				org.omg.zx.subnetworkConnection.SNCState_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllSubordinateMLSNs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder _arg2= new org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder();
				org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder _arg3= new org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllSubordinateMLSNs(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg2.value);
				org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAllTopologicalLinksByIterator
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.zx.topologicalLink.TopologicalLinkList_THolder _arg2= new org.omg.zx.topologicalLink.TopologicalLinkList_THolder();
				org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder _arg3= new org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinksByIterator(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				org.omg.zx.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getAllEdgeMLSNPPLinks
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder();
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllEdgeMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getRouteAndTopologicalLinks
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.Route_THolder _arg1= new org.omg.zx.subnetworkConnection.Route_THolder();
				org.omg.zx.topologicalLink.TopologicalLinkList_THolder _arg2= new org.omg.zx.topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getRouteAndTopologicalLinks(_arg0,_arg1,_arg2);
				org.omg.zx.subnetworkConnection.Route_THelper.write(_out,_arg1.value);
				org.omg.zx.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getAllCallsAndTopLevelConnectionsAndSNCsWithME
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg1=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg3= new org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg4= new org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCsWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg3.value);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAllCallIdsWithSNPPOrTNAName
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T _arg0=org.omg.zx.globaldefs.NameAndStringValue_THelper.read(_input);
				org.omg.zx.callSNC.CallIdList_THolder _arg1= new org.omg.zx.callSNC.CallIdList_THolder();
				_out = handler.createReply();
				getAllCallIdsWithSNPPOrTNAName(_arg0,_arg1);
				org.omg.zx.callSNC.CallIdList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // addRoute
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.RouteCreateData_T _arg1=org.omg.zx.subnetworkConnection.RouteCreateData_THelper.read(_input);
				org.omg.zx.subnetworkConnection.GradesOfImpact_T _arg2=org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T _arg3=org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.zx.subnetworkConnection.RouteDescriptor_THolder _arg4= new org.omg.zx.subnetworkConnection.RouteDescriptor_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.zx.subnetworkConnection.RouteDescriptor_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getSNC
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder _arg1= new org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder();
				_out = handler.createReply();
				getSNC(_arg0,_arg1);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getAllCallsAndTopLevelConnectionsWithME
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg1=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder _arg3= new org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHolder _arg4= new org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THelper.write(_out,_arg3.value);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // activateSNC
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder _arg2= new org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateSNC(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllCallIdsWithTP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.callSNC.CallIdList_THolder _arg1= new org.omg.zx.callSNC.CallIdList_THolder();
				_out = handler.createReply();
				getAllCallIdsWithTP(_arg0,_arg1);
				org.omg.zx.callSNC.CallIdList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // setSRG
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_long();
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg2=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				setSRG(_arg0,_arg1,_arg2);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // createSNC
			{
			try
			{
				org.omg.zx.subnetworkConnection.SNCCreateData_T _arg0=org.omg.zx.subnetworkConnection.SNCCreateData_THelper.read(_input);
				org.omg.zx.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder _arg2= new org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createSNC(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // modifyDiversityAndCorouting
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.callSNC.Diversity_T _arg1=org.omg.zx.callSNC.Diversity_THelper.read(_input);
				org.omg.zx.callSNC.RouteGroupInfo_T[] _arg2=org.omg.zx.callSNC.RouteGroupInfoList_THelper.read(_input);
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=_input.read_string();
				org.omg.zx.callSNC.CallAndTopLevelConnections_THolder _arg5= new org.omg.zx.callSNC.CallAndTopLevelConnections_THolder();
				_out = handler.createReply();
				modifyDiversityAndCorouting(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.zx.callSNC.CallAndTopLevelConnections_THelper.write(_out,_arg5.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // setAdditionalInfo
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
			case 39: // modifySNC
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.zx.subnetworkConnection.SNCModifyData_T _arg2=org.omg.zx.subnetworkConnection.SNCModifyData_THelper.read(_input);
				org.omg.zx.subnetworkConnection.GradesOfImpact_T _arg3=org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.zx.subnetworkConnection.ProtectionEffort_T _arg4=org.omg.zx.subnetworkConnection.ProtectionEffort_THelper.read(_input);
				org.omg.zx.subnetworkConnection.TPDataList_THolder _arg5= new org.omg.zx.subnetworkConnection.TPDataList_THolder();
				_arg5._read (_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder _arg6= new org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifySNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_out,_arg5.value);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // getAllTopologicalLinks
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.topologicalLink.TopologicalLinkList_THolder _arg1= new org.omg.zx.topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getAllTopologicalLinks(_arg0,_arg1);
				org.omg.zx.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // establishCall
			{
			try
			{
				org.omg.zx.callSNC.CallCreateData_T _arg0=org.omg.zx.callSNC.CallCreateData_THelper.read(_input);
				org.omg.zx.subnetworkConnection.SNCCreateData_T[] _arg1=org.omg.zx.subnetworkConnection.SNCCreateDataList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				org.omg.zx.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.zx.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.omg.zx.callSNC.CallAndTopLevelConnections_THolder _arg4= new org.omg.zx.callSNC.CallAndTopLevelConnections_THolder();
				org.omg.zx.subnetworkConnection.SNCCreateDataList_THolder _arg5= new org.omg.zx.subnetworkConnection.SNCCreateDataList_THolder();
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder _arg6= new org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				establishCall(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.zx.callSNC.CallAndTopLevelConnections_THelper.write(_out,_arg4.value);
				org.omg.zx.subnetworkConnection.SNCCreateDataList_THelper.write(_out,_arg5.value);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // getAllCallsAndTopLevelConnections
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder _arg2= new org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHolder _arg3= new org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnections(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THelper.write(_out,_arg2.value);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // deactivateAndDeleteSNC
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder _arg2= new org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteSNC(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getCallAndTopLevelConnections
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.zx.callSNC.CallAndTopLevelConnections_THolder _arg2= new org.omg.zx.callSNC.CallAndTopLevelConnections_THolder();
				_out = handler.createReply();
				getCallAndTopLevelConnections(_arg0,_arg1,_arg2);
				org.omg.zx.callSNC.CallAndTopLevelConnections_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // getAllSubordinateRAidsWithConnection
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg1=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				org.omg.zx.multiLayerSubnetwork.RoutePerRouteType_THolder _arg3= new org.omg.zx.multiLayerSubnetwork.RoutePerRouteType_THolder();
				_out = handler.createReply();
				getAllSubordinateRAidsWithConnection(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.multiLayerSubnetwork.RoutePerRouteType_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // getConnectionsAndRouteDetails
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg1=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=_input.read_string();
				org.omg.zx.callSNC.SNCAndRouteList_THolder _arg5= new org.omg.zx.callSNC.SNCAndRouteList_THolder();
				_out = handler.createReply();
				getConnectionsAndRouteDetails(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.zx.callSNC.SNCAndRouteList_THelper.write(_out,_arg5.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // getCall
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.callSNC.Call_THolder _arg1= new org.omg.zx.callSNC.Call_THolder();
				_out = handler.createReply();
				getCall(_arg0,_arg1);
				org.omg.zx.callSNC.Call_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // getSNCsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByUserLabel(_arg0,_arg1);
				org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 49: // getBackupRoutes
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				org.omg.zx.globaldefs.NVSList_THolder _arg3= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg3._read (_input);
				org.omg.zx.subnetworkConnection.RouteList_THolder _arg4= new org.omg.zx.subnetworkConnection.RouteList_THolder();
				_out = handler.createReply();
				getBackupRoutes(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg3.value);
				org.omg.zx.subnetworkConnection.RouteList_THelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 50: // getAllMLSNPPs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPP.MLSNPPList_THolder _arg3= new org.omg.zx.mLSNPP.MLSNPPList_THolder();
				org.omg.zx.mLSNPP.MLSNPPIterator_IHolder _arg4= new org.omg.zx.mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPP.MLSNPPList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 51: // getAllCallsAndTopLevelConnectionsAndSNCs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg2= new org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg3= new org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCs(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg2.value);
				org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 52: // removeRoute
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.zx.globaldefs.NVSList_THolder _arg3= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg3._read (_input);
				_out = handler.createReply();
				removeRoute(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 53: // setLocation
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
