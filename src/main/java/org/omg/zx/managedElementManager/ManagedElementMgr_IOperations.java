package org.omg.zx.managedElementManager;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ManagedElementMgr_IOperations
	extends org.omg.zx.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllManagedElements(org.omg.zx.managedElement.ManagedElementList_THolder meList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllManagedElementsByIterator(int how_many, org.omg.zx.managedElement.ManagedElementList_THolder meList, org.omg.zx.managedElement.ManagedElementIterator_IHolder meIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllManagedElementNames(org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllManagedElementNamesByIterator(int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllPTPs(org.omg.zx.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getManagedElement(org.omg.zx.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.zx.managedElement.ManagedElement_THolder me) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(org.omg.zx.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllPSEs(org.omg.zx.globaldefs.NameAndStringValue_T[] meName, org.omg.zx.notifications.EventList_THolder activePSEList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllCrossConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.zx.subnetworkConnection.CrossConnectList_THolder crossConnections, org.omg.zx.subnetworkConnection.CCIterator_IHolder ccIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setCrossConnections(org.omg.zx.subnetworkConnection.CrossConnect_T[] add, org.omg.zx.subnetworkConnection.CrossConnect_T[] remove, org.omg.zx.subnetworkConnection.CrossConnectList_THolder addSuccess, org.omg.zx.subnetworkConnection.CrossConnectList_THolder removeSuccess) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void activateCrossConnections(org.omg.zx.subnetworkConnection.CrossConnect_T[] ccList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder successedList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder failedList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void deactivateCrossConnections(org.omg.zx.subnetworkConnection.CrossConnect_T[] ccList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder successedList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder failedList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void createCrossConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] meName, org.omg.zx.subnetworkConnection.CrossConnect_T[] add, org.omg.zx.subnetworkConnection.CrossConnectList_THolder addSuccess) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void deleteCrossConnections(org.omg.zx.subnetworkConnection.CrossConnect_T[] ccList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder successedList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder failedList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getCrossConnection(org.omg.zx.globaldefs.NameAndStringValue_T[] ccName, org.omg.zx.subnetworkConnection.CrossConnect_THolder crossConnection) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllEquipmentInnerConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.zx.subnetworkConnection.CrossConnectList_THolder crossConnections, org.omg.zx.subnetworkConnection.CCIterator_IHolder ccIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getMEconfigData(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String[] configDataTypes, org.omg.zx.managedElementManager.MEConfigData_THolder meConfigDatas) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setTPData(org.omg.zx.subnetworkConnection.TPData_T tpInfo, org.omg.zx.terminationPoint.TerminationPoint_THolder modifiedTP) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getContainedCurrentTPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList, org.omg.zx.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getContainedCurrentTPNames(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, org.omg.zx.terminationPoint.TerminationPoint_THolder tp) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getContainedPotentialTPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList, org.omg.zx.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getContainedPotentialTPNames(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getContainedInUseTPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList, org.omg.zx.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getContainedInUseTPNames(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllUnacknowledgedActiveAlarms(org.omg.zx.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getMECoordinates(org.omg.zx.globaldefs.NameAndStringValue_T[][] meNameList, org.omg.zx.managedElement.MECoordinateList_THolder meCoordList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getMEClockCoordinates(org.omg.zx.globaldefs.NameAndStringValue_T[][] meNameList, org.omg.zx.managedElement.MECoordinateList_THolder meCoordList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getSFPInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] brdPortName, org.omg.zx.terminationPoint.BrdPortSFPInfoList_THolder brdPortInfoList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getModifiedManagedElementNames(java.lang.String fromTime, int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
