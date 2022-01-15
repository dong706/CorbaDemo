package org.omg.zx.emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EMSMgr_IOperations
	extends org.omg.zx.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getEMS(org.omg.zx.emsMgr.EMS_THolder emsInfo) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworks(org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder sList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworkNames(org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinks(org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinksByIterator(int how_many, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinkNames(org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getTopLevelTopologicalLink(org.omg.zx.globaldefs.NameAndStringValue_T[] name, org.omg.zx.topologicalLink.TopologicalLink_THolder topoLink) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllActiveAlarmsByCond(org.omg.zx.globaldefs.Duration_T raiseTimeDuration, org.omg.zx.globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] inludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] includeSeverityList, org.omg.zx.alarmMgr.AlarmType_T[] includeAlarmTypeList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void createVLAN(java.lang.String vlanID, java.lang.String userLabel, org.omg.zx.emsMgr.LogicalPort_T[] logicalPortList, org.omg.zx.emsMgr.VLAN_THolder vlan) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void deleteVLAN(org.omg.zx.globaldefs.NameAndStringValue_T[] vlanName) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getVLANs(org.omg.zx.globaldefs.NameAndStringValue_T[][] vlanNameList, org.omg.zx.emsMgr.VLANList_THolder vlanList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void createEthernetService(org.omg.zx.emsMgr.EthernetServiceCreateData_T createData, org.omg.zx.emsMgr.EthernetService_THolder ethernetService) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void deleteEthernetService(org.omg.zx.globaldefs.NameAndStringValue_T[] ethernetServiceName) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getEthernetServices(org.omg.zx.globaldefs.NameAndStringValue_T[][] serviceNameList, org.omg.zx.emsMgr.EthernetServiceList_THolder serviceList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getRPRNodesStatus(org.omg.zx.globaldefs.NameAndStringValue_T[][] nodeNameList, org.omg.zx.emsMgr.RPRNodeStatusList_THolder rprnodeStatusList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void createVB(java.lang.String userLabel, java.lang.String vbID, java.lang.String cID, org.omg.zx.emsMgr.LogicalPort_T[] logicalPortList, org.omg.zx.emsMgr.VB_THolder vb) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void deleteVB(org.omg.zx.globaldefs.NameAndStringValue_T[] vbName) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getVBs(org.omg.zx.globaldefs.NameAndStringValue_T[][] vbNameList, org.omg.zx.emsMgr.VBList_THolder vbList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void clearAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] clearedAlarmIDList, java.lang.String clearState, java.lang.String clearUser, java.lang.String clearTime, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedClearAlarmIDList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void acknowledgeAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void unacknowledgeAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllEMSAndMEUnacknowledgedActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllMLRAs(int how_many, org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder mLRAList, org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllMLSNPPLinksWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllMLSNPPLinksWithMLSNs(org.omg.zx.globaldefs.NameAndStringValue_T[][] mLRANames, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllMLSNPPLinksWithTNAs(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllMLSNPPs(boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllMLSNPPsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllMLSNPPsWithTNA(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllMLSNPPLinks(boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllTopologicalSubnetworks(org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder topoSubnetworkList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void createASAP(org.omg.zx.aSAP.ASAPCreateModifyData_T newASAPCreateData, org.omg.zx.aSAP.ASAP_THolder newASAP, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void deleteASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void assignASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void deassignASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void modifyASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.aSAP.ASAPCreateModifyData_T aSAPModifyData, org.omg.zx.aSAP.ASAP_THolder newASAP, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllASAPs(int how_many, org.omg.zx.aSAP.ASAPList_THolder aSAPList, org.omg.zx.aSAP.ASAPIterator_IHolder asapIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllASAPNames(int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.aSAP.ASAP_THolder anASAP) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getASAPbyResource(org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, org.omg.zx.aSAP.ASAPList_THolder aSAPList, org.omg.zx.aSAP.ASAPIterator_IHolder asapIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getASAPAssociatedResourceNames(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getTopologicalSubnetworksByLayer(int nLayer, org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder topoSubnetworkList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getTopologicalSubnetwork(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THolder topoSubnetwork) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
