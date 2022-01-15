package org.omg.zx.multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MultiLayerSubnetworkMgr_IPOATie
	extends MultiLayerSubnetworkMgr_IPOA
{
	private MultiLayerSubnetworkMgr_IOperations _delegate;

	private POA _poa;
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
	}
	public MultiLayerSubnetworkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MultiLayerSubnetworkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void removeConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.globaldefs.NameAndStringValue_T[][] connectionNamesList, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.removeConnections(callName,connectionNamesList,tpsToModify,sNCsNotDeleted,errorReason);
	}

	public void getMultiLayerSubnetwork(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getMultiLayerSubnetwork(subnetName,subnetwork);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllTPPools(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList, org.omg.zx.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
	}

	public void setIntendedRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setIntendedRoute(sncName,routeId,additionalInfo);
	}

	public void getCallAndTopLevelConnectionsAndSNCs(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCallAndTopLevelConnectionsAndSNCs(callName,callAndTopLevelConnectionsAndSNCs);
	}

	public void getIntendedRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.omg.zx.globaldefs.NVSList_THolder additionalInfo, org.omg.zx.subnetworkConnection.Route_THolder route) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getIntendedRoute(sncName,includeHigherOrderCCs,additionalInfo,route);
	}

	public void releaseCall(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.releaseCall(callName,tpsToModify,remainingSNCs,errorReason);
	}

	public void deactivateSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deactivateSNC(sncName,tolerableImpact,theSNC,errorReason);
	}

	public void addConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder connectionList, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.addConnections(callName,connectionsToAdd,connectionRouteReArrangementAllowed,tpsToModify,connectionList,partialSNCs,errorReason);
	}

	public void modifyCall(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.callSNC.CallModifyData_T callModifyData, org.omg.zx.callSNC.Call_THolder modifiedCall) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.modifyCall(callName,callModifyData,modifiedCall);
	}

	public void getMLSNPPLink(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, boolean sNPListRequested, org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THolder theMLSNPPLink) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getMLSNPPLink(mLSNPPLinkName,sNPListRequested,theMLSNPPLink);
	}

	public void createAndActivateSNC(org.omg.zx.subnetworkConnection.SNCCreateData_T createData, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateSNC(createData,tolerableImpact,theSNC,errorReason);
	}

	public void getAllSubnetworkConnectionsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.zx.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCsWithTP(subnetName,tPName,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void setRoutesAdminState(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, org.omg.zx.subnetworkConnection.SNCState_THolder sncState) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setRoutesAdminState(sncName,routeNameAndAdminStateList,sncState);
	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllSubnetworkConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.zx.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void deleteSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deleteSNC(sncName);
	}

	public void getAllInternalMLSNPPLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllMLSNPPLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.omg.zx.subnetworkConnection.Route_THolder route) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getRoute(sncName,includeHigherOrderCCs,route);
	}

	public void switchRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.globaldefs.NVSList_THolder additionalInfo, org.omg.zx.subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
	}

	public void getAllSubordinateMLSNs(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubordinateMLSNs(subnetName,how_many,subordinateMLSNsList,subnetIt);
	}

	public void getAllTopologicalLinksByIterator(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinksByIterator(subnetName,how_many,topoList,topoIt);
	}

	public void getAllEdgeMLSNPPLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgeMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getRouteAndTopologicalLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.Route_THolder route, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getRouteAndTopologicalLinks(sncName,route,topologicalLinkList);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithME(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void getAllCallIdsWithSNPPOrTNAName(org.omg.zx.globaldefs.NameAndStringValue_T SNPPOrTNAName, org.omg.zx.callSNC.CallIdList_THolder callIdList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallIdsWithSNPPOrTNAName(SNPPOrTNAName,callIdList);
	}

	public void addRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.RouteCreateData_T createRoute, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.zx.subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.addRoute(sncName,createRoute,tolerableImpact,emsFreedomLevel,theRoute,errorReason);
	}

	public void getSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder snc) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getSNC(sncName,snc);
	}

	public void getAllCallsAndTopLevelConnectionsWithME(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
	}

	public void activateSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.activateSNC(sncName,tolerableImpact,theSNC,errorReason);
	}

	public void getAllCallIdsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, org.omg.zx.callSNC.CallIdList_THolder callIdList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallIdsWithTP(tPName,callIdList);
	}

	public void setSRG(java.lang.String srgId, int setOrRelase, org.omg.zx.globaldefs.NameAndStringValue_T[][] objectNames) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setSRG(srgId,setOrRelase,objectNames);
	}

	public void createSNC(org.omg.zx.subnetworkConnection.SNCCreateData_T createData, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.createSNC(createData,tolerableImpact,theSNC,errorReason);
	}

	public void modifyDiversityAndCorouting(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.callSNC.Diversity_T callDiversity, org.omg.zx.callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, java.lang.String routeGroupsNumber, org.omg.zx.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.modifyDiversityAndCorouting(callName,callDiversity,routeGroupInfoList,connectionRouteReArrangementAllowed,routeGroupsNumber,callAndTopLevelConnections);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void modifySNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.zx.subnetworkConnection.SNCModifyData_T SNCModifyData, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,tpsToModify,newSNC,errorReason);
	}

	public void getAllTopologicalLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinks(subnetName,topoList);
	}

	public void establishCall(org.omg.zx.callSNC.CallCreateData_T callCreateData, org.omg.zx.subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, java.lang.String routeGroupsNumber, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections, org.omg.zx.subnetworkConnection.SNCCreateDataList_THolder connectionsNotCreated, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.establishCall(callCreateData,connectionCreateDataList,routeGroupsNumber,tpsToModify,callAndTopLevelConnections,connectionsNotCreated,partialSNCs,callErrorReason);
	}

	public void getAllCallsAndTopLevelConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnections(subnetName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
	}

	public void deactivateAndDeleteSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteSNC(sncName,tolerableImpact,theSNC,errorReason);
	}

	public void getCallAndTopLevelConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, java.lang.String callId, org.omg.zx.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCallAndTopLevelConnections(callName,callId,callAndTopLevelConnections);
	}

	public void getAllSubordinateRAidsWithConnection(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.globaldefs.NameAndStringValue_T[] connection, java.lang.String routeType, org.omg.zx.multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubordinateRAidsWithConnection(subnetName,connection,routeType,routePerRouteType);
	}

	public void getConnectionsAndRouteDetails(java.lang.String callID, org.omg.zx.globaldefs.NameAndStringValue_T[] mLRAName, java.lang.String sNPOrSNPPID, boolean mLSNPPLinkRequested, java.lang.String routeType, org.omg.zx.callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getConnectionsAndRouteDetails(callID,mLRAName,sNPOrSNPPID,mLSNPPLinkRequested,routeType,connectionAndRouteList);
	}

	public void getCall(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.callSNC.Call_THolder theCall) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCall(callName,theCall);
	}

	public void getSNCsByUserLabel(java.lang.String userLabel, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByUserLabel(userLabel,sncList);
	}

	public void getBackupRoutes(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, boolean includeHigherOrderCCs, org.omg.zx.globaldefs.NVSList_THolder additionalInfo, org.omg.zx.subnetworkConnection.RouteList_THolder routeList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getBackupRoutes(sncName,routeId,includeHigherOrderCCs,additionalInfo,routeList);
	}

	public void getAllMLSNPPs(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPs(subnetName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCs(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCs(subnetName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void removeRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.removeRoute(sncName,routeId,emsFreedomLevel,additionalInfo);
	}

	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

}
