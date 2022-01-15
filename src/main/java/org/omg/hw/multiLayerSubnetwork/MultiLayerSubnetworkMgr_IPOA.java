package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class MultiLayerSubnetworkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "deleteSNC", new java.lang.Integer(0));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(1));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(2));
		m_opsHash.put ( "getSNC", new java.lang.Integer(3));
		m_opsHash.put ( "switchRoute", new java.lang.Integer(4));
		m_opsHash.put ( "getAllSubnetworkConnectionNames", new java.lang.Integer(5));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(6));
		m_opsHash.put ( "getAllMicrowaveLinksReport", new java.lang.Integer(7));
		m_opsHash.put ( "deactivateAndDeleteSNC", new java.lang.Integer(8));
		m_opsHash.put ( "getSNCsByNativeEmsName", new java.lang.Integer(9));
		m_opsHash.put ( "deletePresetRoute", new java.lang.Integer(10));
		m_opsHash.put ( "getSNCsByEndObjectName", new java.lang.Integer(11));
		m_opsHash.put ( "getAllEdgePointNames", new java.lang.Integer(12));
		m_opsHash.put ( "getAllEdgePoints", new java.lang.Integer(13));
		m_opsHash.put ( "getSharedRoute", new java.lang.Integer(14));
		m_opsHash.put ( "setConjunctionSNC", new java.lang.Integer(15));
		m_opsHash.put ( "getWaveLengthStatusByEndObject", new java.lang.Integer(16));
		m_opsHash.put ( "createAndActivateSNC", new java.lang.Integer(17));
		m_opsHash.put ( "getRouteAndTopologicalLinksBySNCs", new java.lang.Integer(18));
		m_opsHash.put ( "getOrginalRoute", new java.lang.Integer(19));
		m_opsHash.put ( "getOrginalPresetRoute", new java.lang.Integer(20));
		m_opsHash.put ( "getAssociatedTP", new java.lang.Integer(21));
		m_opsHash.put ( "deactivateSNC", new java.lang.Integer(22));
		m_opsHash.put ( "getAllConjunctionSNCs", new java.lang.Integer(23));
		m_opsHash.put ( "checkValidSNC", new java.lang.Integer(24));
		m_opsHash.put ( "createPresetRoute", new java.lang.Integer(25));
		m_opsHash.put ( "createSNC", new java.lang.Integer(26));
		m_opsHash.put ( "getAllTPPools", new java.lang.Integer(27));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(28));
		m_opsHash.put ( "getRoutes", new java.lang.Integer(29));
		m_opsHash.put ( "getConjunctionSNC", new java.lang.Integer(30));
		m_opsHash.put ( "getSNCNamesByRouteModificationTime", new java.lang.Integer(31));
		m_opsHash.put ( "getAllSubnetworkConnectionsWithTP", new java.lang.Integer(32));
		m_opsHash.put ( "createSharedRoute", new java.lang.Integer(33));
		m_opsHash.put ( "getAllSubnetworkConnections", new java.lang.Integer(34));
		m_opsHash.put ( "getMultiLayerSubnetwork", new java.lang.Integer(35));
		m_opsHash.put ( "setConjunctionSNCEx", new java.lang.Integer(36));
		m_opsHash.put ( "getServerConnections", new java.lang.Integer(37));
		m_opsHash.put ( "getTopologicalLink", new java.lang.Integer(38));
		m_opsHash.put ( "getAllTopologicalLinks", new java.lang.Integer(39));
		m_opsHash.put ( "getSNCsByUserLabel", new java.lang.Integer(40));
		m_opsHash.put ( "getAllTopologicalLinkNames", new java.lang.Integer(41));
		m_opsHash.put ( "setOwner", new java.lang.Integer(42));
		m_opsHash.put ( "deleteSharedRoute", new java.lang.Integer(43));
		m_opsHash.put ( "getAllInternalTopologicalLinks", new java.lang.Integer(44));
		m_opsHash.put ( "activateSNC", new java.lang.Integer(45));
		m_opsHash.put ( "getRoute", new java.lang.Integer(46));
		m_opsHash.put ( "getRouteAndTopologicalLinks", new java.lang.Integer(47));
		m_opsHash.put ( "getAllSubnetworkConnectionNamesWithTP", new java.lang.Integer(48));
		m_opsHash.put ( "getAllInternalTopologicalLinkNames", new java.lang.Integer(49));
		m_opsHash.put ( "getPresetRoute", new java.lang.Integer(50));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(51));
		m_opsHash.put ( "getAllSNCNamesWithHigherOrderSNC", new java.lang.Integer(52));
		m_opsHash.put ( "modifySNC", new java.lang.Integer(53));
		m_opsHash.put ( "getTPGroupingRelationships", new java.lang.Integer(54));
		m_opsHash.put ( "swapSNC", new java.lang.Integer(55));
		m_opsHash.put ( "getSNCs", new java.lang.Integer(56));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(57));
		m_opsHash.put ( "getAllTPPoolNames", new java.lang.Integer(58));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // deleteSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg1=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				_out = handler.createReply();
				deleteSNC(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getCapabilities
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
			case 2: // getAllManagedElements
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.managedElement.ManagedElementList_THolder _arg2= new org.omg.hw.managedElement.ManagedElementList_THolder();
				org.omg.hw.managedElement.ManagedElementIterator_IHolder _arg3= new org.omg.hw.managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.managedElement.ManagedElementList_THelper.write(_out,_arg2.value);
				org.omg.hw.managedElement.ManagedElementIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder _arg1= new org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder();
				_out = handler.createReply();
				getSNC(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // switchRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg2=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg3=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg4= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				org.omg.hw.globaldefs.NVSList_THolder _arg5= new org.omg.hw.globaldefs.NVSList_THolder();
				_arg5._read (_input);
				org.omg.hw.subnetworkConnection.SNCState_THolder _arg6= new org.omg.hw.subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				switchRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg5.value);
				org.omg.hw.subnetworkConnection.SNCState_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllSubnetworkConnectionNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 7: // getAllMicrowaveLinksReport
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.hw.notifications.NameAndAnyValue_T[] _arg3=org.omg.hw.notifications.NVList_THelper.read(_input);
				_out = handler.createReply();
				getAllMicrowaveLinksReport(_arg0,_arg1,_arg2,_arg3);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // deactivateAndDeleteSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder _arg4= new org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getSNCsByNativeEmsName
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_ulong();
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder _arg2= new org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.hw.subnetworkConnection.SNCIterator_IHolder _arg3= new org.omg.hw.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getSNCsByNativeEmsName(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg2.value);
				org.omg.hw.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // deletePresetRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				deletePresetRoute(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getSNCsByEndObjectName
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg1=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg2=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByEndObjectName(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllEdgePointNames
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
				getAllEdgePointNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 13: // getAllEdgePoints
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
				getAllEdgePoints(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 14: // getSharedRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.subnetworkConnection.SharedRoute_THolder _arg2= new org.omg.hw.subnetworkConnection.SharedRoute_THolder();
				_out = handler.createReply();
				getSharedRoute(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.SharedRoute_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setConjunctionSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg1=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setConjunctionSNC(_arg0,_arg1,_arg2);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getWaveLengthStatusByEndObject
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg2=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg3=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.ConnectionDirection_T _arg4=org.omg.hw.globaldefs.ConnectionDirection_THelper.read(_input);
				org.omg.hw.subnetworkConnection.WaveLengthStatusList_THolder _arg5= new org.omg.hw.subnetworkConnection.WaveLengthStatusList_THolder();
				_out = handler.createReply();
				getWaveLengthStatusByEndObject(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.subnetworkConnection.WaveLengthStatusList_THelper.write(_out,_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // createAndActivateSNC
			{
			try
			{
				org.omg.hw.subnetworkConnection.SNCCreateData_T _arg0=org.omg.hw.subnetworkConnection.SNCCreateData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder _arg4= new org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getRouteAndTopologicalLinksBySNCs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder _arg2= new org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder();
				org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHolder _arg3= new org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getRouteAndTopologicalLinksBySNCs(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkList_THelper.write(_out,_arg2.value);
				org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getOrginalRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.omg.hw.subnetworkConnection.Route_THolder _arg2= new org.omg.hw.subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getOrginalRoute(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.Route_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getOrginalPresetRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.subnetworkConnection.PresetRoute_THolder _arg2= new org.omg.hw.subnetworkConnection.PresetRoute_THolder();
				_out = handler.createReply();
				getOrginalPresetRoute(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.PresetRoute_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAssociatedTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg1= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getAssociatedTP(_arg0,_arg1);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // deactivateSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder _arg4= new org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllConjunctionSNCs
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder _arg1= new org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder();
				org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHolder _arg2= new org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHolder();
				_out = handler.createReply();
				getAllConjunctionSNCs(_arg0,_arg1,_arg2);
				org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCList_THelper.write(_out,_arg1.value);
				org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // checkValidSNC
			{
			try
			{
				org.omg.hw.subnetworkConnection.SNCCreateData_T _arg0=org.omg.hw.subnetworkConnection.SNCCreateData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPData_T[] _arg1=org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				org.omg.CORBA.BooleanHolder _arg3= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				checkValidSNC(_arg0,_arg1,_arg2,_arg3);
				_out.write_boolean(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // createPresetRoute
			{
			try
			{
				org.omg.hw.subnetworkConnection.CreatePresetRouteData_T _arg0=org.omg.hw.subnetworkConnection.CreatePresetRouteData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.PresetRoute_THolder _arg1= new org.omg.hw.subnetworkConnection.PresetRoute_THolder();
				_out = handler.createReply();
				createPresetRoute(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.PresetRoute_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // createSNC
			{
			try
			{
				org.omg.hw.subnetworkConnection.SNCCreateData_T _arg0=org.omg.hw.subnetworkConnection.SNCCreateData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder _arg3= new org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createSNC(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAllTPPools
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllTPPools(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg2.value);
				org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // setUserLabel
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
			case 29: // getRoutes
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.omg.hw.subnetworkConnection.RouteInfoList_THolder _arg2= new org.omg.hw.subnetworkConnection.RouteInfoList_THolder();
				_out = handler.createReply();
				getRoutes(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.RouteInfoList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getConjunctionSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NVSList_THolder _arg1= new org.omg.hw.globaldefs.NVSList_THolder();
				org.omg.hw.globaldefs.NVSList_THolder _arg2= new org.omg.hw.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				getConjunctionSNC(_arg0,_arg1,_arg2);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg1.value);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getSNCNamesByRouteModificationTime
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getSNCNamesByRouteModificationTime(_arg0,_arg1,_arg2,_arg3);
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
			case 32: // getAllSubnetworkConnectionsWithTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.hw.subnetworkConnection.SNCIterator_IHolder _arg4= new org.omg.hw.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // createSharedRoute
			{
			try
			{
				org.omg.hw.subnetworkConnection.CreateSharedRouteData_T _arg0=org.omg.hw.subnetworkConnection.CreateSharedRouteData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.SharedRoute_THolder _arg1= new org.omg.hw.subnetworkConnection.SharedRoute_THolder();
				_out = handler.createReply();
				createSharedRoute(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.SharedRoute_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllSubnetworkConnections
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.hw.subnetworkConnection.SNCIterator_IHolder _arg4= new org.omg.hw.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getMultiLayerSubnetwork
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetwork_THolder _arg1= new org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetwork_THolder();
				_out = handler.createReply();
				getMultiLayerSubnetwork(_arg0,_arg1);
				org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // setConjunctionSNCEx
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg1=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg2=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				boolean _arg3=_input.read_boolean();
				_out = handler.createReply();
				setConjunctionSNCEx(_arg0,_arg1,_arg2,_arg3);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getServerConnections
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.ServerTrailList_THolder _arg1= new org.omg.hw.subnetworkConnection.ServerTrailList_THolder();
				_out = handler.createReply();
				getServerConnections(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.ServerTrailList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getTopologicalLink
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.topologicalLink.TopologicalLink_THolder _arg1= new org.omg.hw.topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopologicalLink(_arg0,_arg1);
				org.omg.hw.topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // getAllTopologicalLinks
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.topologicalLink.TopologicalLinkList_THolder _arg2= new org.omg.hw.topologicalLink.TopologicalLinkList_THolder();
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder _arg3= new org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinks(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // getSNCsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByUserLabel(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getAllTopologicalLinkNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinkNames(_arg0,_arg1,_arg2,_arg3);
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
			case 42: // setOwner
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
			case 43: // deleteSharedRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				deleteSharedRoute(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getAllInternalTopologicalLinks
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.topologicalLink.TopologicalLinkList_THolder _arg2= new org.omg.hw.topologicalLink.TopologicalLinkList_THolder();
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder _arg3= new org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllInternalTopologicalLinks(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // activateSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg1=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder _arg4= new org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // getRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.omg.hw.subnetworkConnection.Route_THolder _arg2= new org.omg.hw.subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getRoute(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.Route_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // getRouteAndTopologicalLinks
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.Route_THolder _arg1= new org.omg.hw.subnetworkConnection.Route_THolder();
				org.omg.hw.topologicalLink.TopologicalLinkList_THolder _arg2= new org.omg.hw.topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getRouteAndTopologicalLinks(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.Route_THelper.write(_out,_arg1.value);
				org.omg.hw.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // getAllSubnetworkConnectionNamesWithTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNamesWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 49: // getAllInternalTopologicalLinkNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllInternalTopologicalLinkNames(_arg0,_arg1,_arg2,_arg3);
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
			case 50: // getPresetRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.subnetworkConnection.PresetRoute_THolder _arg2= new org.omg.hw.subnetworkConnection.PresetRoute_THolder();
				_out = handler.createReply();
				getPresetRoute(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.PresetRoute_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 51: // setNativeEMSName
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
			case 52: // getAllSNCNamesWithHigherOrderSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllSNCNamesWithHigherOrderSNC(_arg0,_arg1,_arg2);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 53: // modifySNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.hw.subnetworkConnection.SNCModifyData_T _arg2=org.omg.hw.subnetworkConnection.SNCModifyData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg3=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.subnetworkConnection.ProtectionEffort_T _arg4=org.omg.hw.subnetworkConnection.ProtectionEffort_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg5=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg6= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder _arg7= new org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifySNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg7.value);
				_out.write_string(_arg8.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 54: // getTPGroupingRelationships
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getTPGroupingRelationships(_arg0,_arg1,_arg2,_arg3);
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
			case 55: // swapSNC
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg1=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg3=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg4= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				org.omg.hw.subnetworkConnection.SNCState_THolder _arg5= new org.omg.hw.subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				swapSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				org.omg.hw.subnetworkConnection.SNCState_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 56: // getSNCs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCs(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 57: // getAllManagedElementNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2,_arg3);
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
			case 58: // getAllTPPoolNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTPPoolNames(_arg0,_arg1,_arg2,_arg3);
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
