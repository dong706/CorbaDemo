package org.omg.zx.emsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EMSMgr_IPOATie
	extends EMSMgr_IPOA
{
	private EMSMgr_IOperations _delegate;

	private POA _poa;
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.emsMgr.EMSMgr_I _this()
	{
		return org.omg.zx.emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
	}
	public EMSMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EMSMgr_IOperations delegate)
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
	public void getTopologicalSubnetworksByLayer(int nLayer, org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder topoSubnetworkList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalSubnetworksByLayer(nLayer,topoSubnetworkList);
	}

	public void getAllMLSNPPLinksWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithTP(tPName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllASAPs(int how_many, org.omg.zx.aSAP.ASAPList_THolder aSAPList, org.omg.zx.aSAP.ASAPIterator_IHolder asapIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllASAPs(how_many,aSAPList,asapIt);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void deassignASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deassignASAP(resourceName,layerRate,additionalInfo);
	}

	public void getTopLevelTopologicalLink(org.omg.zx.globaldefs.NameAndStringValue_T[] name, org.omg.zx.topologicalLink.TopologicalLink_THolder topoLink) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getTopLevelTopologicalLink(name,topoLink);
	}

	public void getVBs(org.omg.zx.globaldefs.NameAndStringValue_T[][] vbNameList, org.omg.zx.emsMgr.VBList_THolder vbList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getVBs(vbNameList,vbList);
	}

	public void getASAPAssociatedResourceNames(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getASAPAssociatedResourceNames(aSAPName,how_many,nameList,nameIt);
	}

	public void getEthernetServices(org.omg.zx.globaldefs.NameAndStringValue_T[][] serviceNameList, org.omg.zx.emsMgr.EthernetServiceList_THolder serviceList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getEthernetServices(serviceNameList,serviceList);
	}

	public void createVLAN(java.lang.String vlanID, java.lang.String userLabel, org.omg.zx.emsMgr.LogicalPort_T[] logicalPortList, org.omg.zx.emsMgr.VLAN_THolder vlan) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.createVLAN(vlanID,userLabel,logicalPortList,vlan);
	}

	public void getAllEMSAndMEUnacknowledgedActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEUnacknowledgedActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void modifyASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.aSAP.ASAPCreateModifyData_T aSAPModifyData, org.omg.zx.aSAP.ASAP_THolder newASAP, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.modifyASAP(aSAPName,aSAPModifyData,newASAP,additionalInfo);
	}

	public void getAllMLSNPPsWithTNA(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPsWithTNA(tNAList,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllASAPNames(int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllASAPNames(how_many,nameList,nameIt);
	}

	public void getAllTopLevelSubnetworkNames(org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworkNames(nameList);
	}

	public void getVLANs(org.omg.zx.globaldefs.NameAndStringValue_T[][] vlanNameList, org.omg.zx.emsMgr.VLANList_THolder vlanList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getVLANs(vlanNameList,vlanList);
	}

	public void getEMS(org.omg.zx.emsMgr.EMS_THolder emsInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getEMS(emsInfo);
	}

	public void getAllMLSNPPs(boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPs(sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void createASAP(org.omg.zx.aSAP.ASAPCreateModifyData_T newASAPCreateData, org.omg.zx.aSAP.ASAP_THolder newASAP, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.createASAP(newASAPCreateData,newASAP,additionalInfo);
	}

	public void acknowledgeAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.acknowledgeAlarms(acknowledgeIDList,additionalInfo,failedAcknowledgeIDList);
	}

	public void getAllTopLevelTopologicalLinkNames(org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinkNames(nameList);
	}

	public void getAllTopLevelSubnetworks(org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder sList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworks(sList);
	}

	public void createEthernetService(org.omg.zx.emsMgr.EthernetServiceCreateData_T createData, org.omg.zx.emsMgr.EthernetService_THolder ethernetService) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.createEthernetService(createData,ethernetService);
	}

	public void getAllTopLevelTopologicalLinksByIterator(int how_many, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinksByIterator(how_many,topoList,topoIt);
	}

	public void deleteVLAN(org.omg.zx.globaldefs.NameAndStringValue_T[] vlanName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deleteVLAN(vlanName);
	}

	public void deleteVB(org.omg.zx.globaldefs.NameAndStringValue_T[] vbName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deleteVB(vbName);
	}

	public void getTopologicalSubnetwork(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THolder topoSubnetwork) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalSubnetwork(subnetName,topoSubnetwork);
	}

	public void assignASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.assignASAP(aSAPName,resourceName,layerRate,additionalInfo);
	}

	public void getAllMLSNPPLinks(boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinks(sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getASAPbyResource(org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, org.omg.zx.aSAP.ASAPList_THolder aSAPList, org.omg.zx.aSAP.ASAPIterator_IHolder asapIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getASAPbyResource(resourceName,layerRateList,how_many,aSAPList,asapIt);
	}

	public void createVB(java.lang.String userLabel, java.lang.String vbID, java.lang.String cID, org.omg.zx.emsMgr.LogicalPort_T[] logicalPortList, org.omg.zx.emsMgr.VB_THolder vb) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.createVB(userLabel,vbID,cID,logicalPortList,vb);
	}

	public void getAllMLRAs(int how_many, org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder mLRAList, org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLRAs(how_many,mLRAList,sIt);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllTopLevelTopologicalLinks(org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinks(topoList);
	}

	public void getAllMLSNPPsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPsWithTP(tPName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void deleteASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deleteASAP(aSAPName,additionalInfo);
	}

	public void deleteEthernetService(org.omg.zx.globaldefs.NameAndStringValue_T[] ethernetServiceName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deleteEthernetService(ethernetServiceName);
	}

	public void getAllMLSNPPLinksWithMLSNs(org.omg.zx.globaldefs.NameAndStringValue_T[][] mLRANames, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithMLSNs(mLRANames,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllMLSNPPLinksWithTNAs(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithTNAs(tNAList,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllActiveAlarmsByCond(org.omg.zx.globaldefs.Duration_T raiseTimeDuration, org.omg.zx.globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] inludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] includeSeverityList, org.omg.zx.alarmMgr.AlarmType_T[] includeAlarmTypeList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarmsByCond(raiseTimeDuration,objectNameList,inludeProbCauseList,includeSeverityList,includeAlarmTypeList,how_many,eventList,eventIt);
	}

	public void getASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.aSAP.ASAP_THolder anASAP) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getASAP(aSAPName,anASAP);
	}

	public void clearAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] clearedAlarmIDList, java.lang.String clearState, java.lang.String clearUser, java.lang.String clearTime, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedClearAlarmIDList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.clearAlarms(clearedAlarmIDList,clearState,clearUser,clearTime,failedClearAlarmIDList);
	}

	public void getRPRNodesStatus(org.omg.zx.globaldefs.NameAndStringValue_T[][] nodeNameList, org.omg.zx.emsMgr.RPRNodeStatusList_THolder rprnodeStatusList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getRPRNodesStatus(nodeNameList,rprnodeStatusList);
	}

	public void getAllActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void getAllTopologicalSubnetworks(org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder topoSubnetworkList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalSubnetworks(topoSubnetworkList);
	}

	public void unacknowledgeAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.unacknowledgeAlarms(unacknowledgeIDList,additionalInfo,failedunAcknowledgeIDList);
	}

}
