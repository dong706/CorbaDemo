package org.omg.hw.emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EMSMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getEMS(org.omg.hw.emsMgr.EMS_THolder emsInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworks(int how_many, org.omg.hw.multiLayerSubnetwork.SubnetworkList_THolder sList, org.omg.hw.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinks(int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTopLevelTopologicalLink(org.omg.hw.globaldefs.NameAndStringValue_T[] topoLinkName, org.omg.hw.topologicalLink.TopologicalLink_THolder topoLink) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllEMSSystemActiveAlarms(org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getObjectRootAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getObjectClockSourceStatus(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.hw.emsMgr.ClockSourceStatusList_THolder clockSourceStatusList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void acknowledgeAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void unacknowledgeAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getInventory(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.emsMgr.InventoryType_T[] typeList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getEMSHeartbeatInterval(org.omg.hw.globaldefs.NameAndStringValue_T[] ems, org.omg.CORBA.IntHolder interval) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setEMSHeartbeatInterval(org.omg.hw.globaldefs.NameAndStringValue_T[] ems, int interval) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllHistoryAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getEMSTime(org.omg.hw.globaldefs.NVSList_THolder emsName, org.omg.CORBA.StringHolder emsTime) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setEMSTime(org.omg.hw.globaldefs.NameAndStringValue_T[] emsName, java.lang.String settedTime) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTPFaultStatus(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.emsMgr.EndTPFaultStatusList_THolder tpFaultStatusList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void clearAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAlarmCount(org.omg.hw.notifications.PerceivedSeverity_T[] severityList, org.omg.CORBA.IntHolder count) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSecondlyAlarms(java.lang.String[] alarmList, org.omg.hw.notifications.EventList_THolder eventList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAlarmAffectedServiceNames(java.lang.String serialNumber, org.omg.hw.emsMgr.ServiceNameList_THolder serviceNameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setAlarmReportingOff(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setAlarmReportingOn(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void redefineAlarmData(java.lang.String actionType, org.omg.hw.emsMgr.RedefineAlarmData_T[] redefineAlarmDataList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder successRedefineDataList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder failedRedefineDataList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllRedefineAlarmDatas(org.omg.hw.emsMgr.QueryRedefineAlarmData_T[] queryConditionList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder redefineAlarmDataList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllAlarmStaticInfo(int how_many, org.omg.hw.emsMgr.AlarmStaticInfoList_THolder alarmInfoList, org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHolder alarmInfoIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllHistoryAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getHistoryAlarmDataByPull(org.omg.hw.globaldefs.NameAndStringValue_T[][] nameList, java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
