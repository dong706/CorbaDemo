package org.omg.hw.multiLayerSubnetwork;

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
	public org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
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
	public void deleteSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteSNC(sncName,emsFreedomLevel);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllManagedElements(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.hw.managedElement.ManagedElementList_THolder meList, org.omg.hw.managedElement.ManagedElementIterator_IHolder meIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(subnetName,how_many,meList,meIt);
	}

	public void getSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder snc) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSNC(sncName,snc);
	}

	public void switchRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.globaldefs.NVSList_THolder additionalInfo, org.omg.hw.subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
	}

	public void getAllSubnetworkConnectionNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllMicrowaveLinksReport(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.notifications.NameAndAnyValue_T[] filter) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMicrowaveLinksReport(destination,userName,password,filter);
	}

	public void deactivateAndDeleteSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getSNCsByNativeEmsName(java.lang.String nativeEmsName, int how_many, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByNativeEmsName(nativeEmsName,how_many,sncList,sncIt);
	}

	public void deletePresetRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deletePresetRoute(sncName,presetRouteID);
	}

	public void getSNCsByEndObjectName(org.omg.hw.globaldefs.NameAndStringValue_T[] aEndObjectName, org.omg.hw.globaldefs.NameAndStringValue_T[] zEndObjectName, short[] connectionRateList, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByEndObjectName(aEndObjectName,zEndObjectName,connectionRateList,sncList);
	}

	public void getAllEdgePointNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePointNames(subnetName,layerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void getAllEdgePoints(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePoints(subnetName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void getSharedRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int sharedRouteID, org.omg.hw.subnetworkConnection.SharedRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSharedRoute(sncName,sharedRouteID,route);
	}

	public void setConjunctionSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName1, org.omg.hw.globaldefs.NameAndStringValue_T[] sncName2, boolean operate) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setConjunctionSNC(sncName1,sncName2,operate);
	}

	public void getWaveLengthStatusByEndObject(org.omg.hw.globaldefs.NameAndStringValue_T[] aEndName, org.omg.hw.globaldefs.NameAndStringValue_T[][] inclusionNameList, org.omg.hw.globaldefs.NameAndStringValue_T[][] exclusionNameList, org.omg.hw.globaldefs.NameAndStringValue_T[] zEndName, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.subnetworkConnection.WaveLengthStatusList_THolder waveLengthStatusList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getWaveLengthStatusByEndObject(aEndName,inclusionNameList,exclusionNameList,zEndName,direction,waveLengthStatusList);
	}

	public void createAndActivateSNC(org.omg.hw.subnetworkConnection.SNCCreateData_T createData, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateSNC(createData,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getRouteAndTopologicalLinksBySNCs(org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNameList, int how_many, org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder routeAndTlList, org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHolder routeAndTlIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getRouteAndTopologicalLinksBySNCs(sncNameList,how_many,routeAndTlList,routeAndTlIt);
	}

	public void getOrginalRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.omg.hw.subnetworkConnection.Route_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getOrginalRoute(sncName,includeHigherOrderCCs,route);
	}

	public void getOrginalPresetRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, org.omg.hw.subnetworkConnection.PresetRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getOrginalPresetRoute(sncName,presetRouteID,route);
	}

	public void getAssociatedTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTP(tpName,tpList);
	}

	public void deactivateSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getAllConjunctionSNCs(int how_many, org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder conjunctionSNCList, org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHolder conjunctionSNCIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllConjunctionSNCs(how_many,conjunctionSNCList,conjunctionSNCIt);
	}

	public void checkValidSNC(org.omg.hw.subnetworkConnection.SNCCreateData_T createData, org.omg.hw.subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.checkValidSNC(createData,tpsToModify,considerResources,valid);
	}

	public void createPresetRoute(org.omg.hw.subnetworkConnection.CreatePresetRouteData_T createData, org.omg.hw.subnetworkConnection.PresetRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createPresetRoute(createData,route);
	}

	public void createSNC(org.omg.hw.subnetworkConnection.SNCCreateData_T createData, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createSNC(createData,tolerableImpact,emsFreedomLevel,theSNC,errorReason);
	}

	public void getAllTPPools(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getRoutes(org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNameList, boolean includeHigherOrderCCs, org.omg.hw.subnetworkConnection.RouteInfoList_THolder routeInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getRoutes(sncNameList,includeHigherOrderCCs,routeInfoList);
	}

	public void getConjunctionSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName1, org.omg.hw.globaldefs.NVSList_THolder sncName2, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getConjunctionSNC(sncName1,sncName2,additionalInfo);
	}

	public void getSNCNamesByRouteModificationTime(java.lang.String utcBeginTime, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSNCNamesByRouteModificationTime(utcBeginTime,how_many,nameList,nameIt);
	}

	public void getAllSubnetworkConnectionsWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
	}

	public void createSharedRoute(org.omg.hw.subnetworkConnection.CreateSharedRouteData_T createData, org.omg.hw.subnetworkConnection.SharedRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createSharedRoute(createData,route);
	}

	public void getAllSubnetworkConnections(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getMultiLayerSubnetwork(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getMultiLayerSubnetwork(subnetName,subnetwork);
	}

	public void setConjunctionSNCEx(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName1, org.omg.hw.globaldefs.NameAndStringValue_T[] sncName2, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo, boolean operate) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setConjunctionSNCEx(sncName1,sncName2,additionalInfo,operate);
	}

	public void getServerConnections(org.omg.hw.globaldefs.NameAndStringValue_T[] clientName, org.omg.hw.subnetworkConnection.ServerTrailList_THolder serverInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getServerConnections(clientName,serverInfoList);
	}

	public void getTopologicalLink(org.omg.hw.globaldefs.NameAndStringValue_T[] topoLinkName, org.omg.hw.topologicalLink.TopologicalLink_THolder topoLink) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalLink(topoLinkName,topoLink);
	}

	public void getAllTopologicalLinks(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinks(subnetName,how_many,topoList,topoIt);
	}

	public void getSNCsByUserLabel(java.lang.String userLabel, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByUserLabel(userLabel,sncList);
	}

	public void getAllTopologicalLinkNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinkNames(subnetName,how_many,nameList,nameIt);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void deleteSharedRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int sharedRouteID) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteSharedRoute(sncName,sharedRouteID);
	}

	public void getAllInternalTopologicalLinks(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalTopologicalLinks(meName,how_many,topoList,topoIt);
	}

	public void activateSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.omg.hw.subnetworkConnection.Route_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getRoute(sncName,includeHigherOrderCCs,route);
	}

	public void getRouteAndTopologicalLinks(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.Route_THolder route, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getRouteAndTopologicalLinks(sncName,route,topologicalLinkList);
	}

	public void getAllSubnetworkConnectionNamesWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getAllInternalTopologicalLinkNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalTopologicalLinkNames(meName,how_many,nameList,nameIt);
	}

	public void getPresetRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, org.omg.hw.subnetworkConnection.PresetRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getPresetRoute(sncName,presetRouteID,route);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllSNCNamesWithHigherOrderSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] name, short[] connectivityRateList, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSNCNamesWithHigherOrderSNC(name,connectivityRateList,nameList);
	}

	public void modifySNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.hw.subnetworkConnection.SNCModifyData_T SNCModifyData, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
	}

	public void getTPGroupingRelationships(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTPGroupingRelationships(tpName,how_many,nameList,nameIt);
	}

	public void swapSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, org.omg.hw.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.swapSNC(nameOfSNCtoBeDeactivated,nameOfSNCtoBeActivated,emsFreedomLevel,tolerableImpact,tpsToModify,stateOfActivatedSNC,errorReason);
	}

	public void getSNCs(org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNameList, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSNCs(sncNameList,sncList);
	}

	public void getAllManagedElementNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(subnetName,how_many,nameList,nameIt);
	}

	public void getAllTPPoolNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPoolNames(subnetworkName,how_many,nameList,nameIt);
	}

}
