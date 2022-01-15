package org.omg.hw.managedElementManager;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ManagedElementMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllManagedElements(int how_many, org.omg.hw.managedElement.ManagedElementList_THolder meList, org.omg.hw.managedElement.ManagedElementIterator_IHolder meIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllManagedElementNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainingSubnetworkNames(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.hw.globaldefs.NamingAttributesList_THolder subnetNames) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllPTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.terminationPoint.TerminationPoint_THolder tp) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getManagedElement(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.hw.managedElement.ManagedElement_THolder me) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainedPotentialTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainedPotentialTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainedInUseTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainedInUseTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainedCurrentTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainedCurrentTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainingTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainingTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setTPData(org.omg.hw.subnetworkConnection.TPData_T tpInfo, org.omg.hw.terminationPoint.TerminationPoint_THolder modifiedTP) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.subnetworkConnection.CrossConnectList_THolder ccList, org.omg.hw.subnetworkConnection.CCIterator_IHolder ccIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getActiveAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void checkActiveAlarms(org.omg.hw.CosNotification.StructuredEvent[] activeEventList, org.omg.hw.notifications.EventList_THolder clearedEventList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, org.omg.hw.globaldefs.NamingAttributesList_THolder failedMeNameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getNEStaticInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder staticInfoList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createCrossConnections(org.omg.hw.subnetworkConnection.CrossConnect_T[] ccList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder successedCCList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder failedCCList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void activateCrossConnections(org.omg.hw.subnetworkConnection.CrossConnect_T[] ccList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder successedCCList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder failedCCList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deactivateCrossConnections(org.omg.hw.subnetworkConnection.CrossConnect_T[] ccList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder successedCCList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder failedCCList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteCrossConnections(org.omg.hw.subnetworkConnection.CrossConnect_T[] ccList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder successedCCList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder failedCCList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createFTP(org.omg.hw.flowDomain.FTPCreateData_T createData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.terminationPoint.TerminationPoint_THolder theFTP) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteFTP(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyFTPMembers(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName, java.lang.String modifyType, org.omg.hw.subnetworkConnection.TPData_T[] tpList, org.omg.hw.subnetworkConnection.TPDataList_THolder successedTPList, org.omg.hw.subnetworkConnection.TPDataList_THolder failedTPList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFTPMembers(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getADCInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objName, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder adcInfoLst) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setADCInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T adcInfo, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedadcInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAPRInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objName, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder aprInfoLst) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setAPRInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T aprInfo, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedaprInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setAPEInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T apeInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setwdmALCInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T wdmalcInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setotnALCInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T otnalcInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyCrossConnection(org.omg.hw.subnetworkConnection.CrossConnect_T ccToModify, org.omg.hw.subnetworkConnection.CrossConnect_T newCc, org.omg.hw.subnetworkConnection.CrossConnect_THolder modifiedCc) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
