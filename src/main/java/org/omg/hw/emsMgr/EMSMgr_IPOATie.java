package org.omg.hw.emsMgr;

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
	public org.omg.hw.emsMgr.EMSMgr_I _this()
	{
		return org.omg.hw.emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
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
	public void getObjectRootAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getObjectRootAlarms(objectName,startTime,endTime,how_many,eventList,eventIt);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setEMSHeartbeatInterval(org.omg.hw.globaldefs.NameAndStringValue_T[] ems, int interval) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setEMSHeartbeatInterval(ems,interval);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllActiveAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime,how_many,eventList,eventIt);
	}

	public void getAllTopLevelTopologicalLinks(int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinks(how_many,topoList,topoIt);
	}

	public void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllTopLevelSubnetworks(int how_many, org.omg.hw.multiLayerSubnetwork.SubnetworkList_THolder sList, org.omg.hw.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworks(how_many,sList,sIt);
	}

	public void clearAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.clearAlarms(alarmList,failedAlarmList);
	}

	public void getAllAlarmStaticInfo(int how_many, org.omg.hw.emsMgr.AlarmStaticInfoList_THolder alarmInfoList, org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHolder alarmInfoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllAlarmStaticInfo(how_many,alarmInfoList,alarmInfoIt);
	}

	public void getAllTopLevelSubnetworkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworkNames(how_many,nameList,nameIt);
	}

	public void getAllTopLevelTopologicalLinkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinkNames(how_many,nameList,nameIt);
	}

	public void getAllHistoryAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllHistoryAlarms(meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime,how_many,eventList,eventIt);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllEMSSystemActiveAlarms(org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSSystemActiveAlarms(excludeSeverityList,how_many,eventList,eventIt);
	}

	public void setEMSTime(org.omg.hw.globaldefs.NameAndStringValue_T[] emsName, java.lang.String settedTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setEMSTime(emsName,settedTime);
	}

	public void getEMS(org.omg.hw.emsMgr.EMS_THolder emsInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getEMS(emsInfo);
	}

	public void setAlarmReportingOn(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOn(resourceName);
	}

	public void getEMSHeartbeatInterval(org.omg.hw.globaldefs.NameAndStringValue_T[] ems, org.omg.CORBA.IntHolder interval) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getEMSHeartbeatInterval(ems,interval);
	}

	public void getTPFaultStatus(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.emsMgr.EndTPFaultStatusList_THolder tpFaultStatusList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTPFaultStatus(tpNameList,tpFaultStatusList);
	}

	public void getTopLevelTopologicalLink(org.omg.hw.globaldefs.NameAndStringValue_T[] topoLinkName, org.omg.hw.topologicalLink.TopologicalLink_THolder topoLink) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTopLevelTopologicalLink(topoLinkName,topoLink);
	}

	public void getInventory(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.emsMgr.InventoryType_T[] typeList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getInventory(destination,userName,password,typeList);
	}

	public void getAllHistoryAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllHistoryAlarmsByFTP(destination,userName,password,meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void redefineAlarmData(java.lang.String actionType, org.omg.hw.emsMgr.RedefineAlarmData_T[] redefineAlarmDataList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder successRedefineDataList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder failedRedefineDataList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.redefineAlarmData(actionType,redefineAlarmDataList,successRedefineDataList,failedRedefineDataList,errorReason);
	}

	public void getAlarmCount(org.omg.hw.notifications.PerceivedSeverity_T[] severityList, org.omg.CORBA.IntHolder count) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAlarmCount(severityList,count);
	}

	public void acknowledgeAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.acknowledgeAlarms(alarmList,failedAlarmList);
	}

	public void getHistoryAlarmDataByPull(org.omg.hw.globaldefs.NameAndStringValue_T[][] nameList, java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getHistoryAlarmDataByPull(nameList,taskName,compressType,packingType,excludeProbCauseList,excludeSeverityList,startTime,endTime);
	}

	public void getObjectClockSourceStatus(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.hw.emsMgr.ClockSourceStatusList_THolder clockSourceStatusList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getObjectClockSourceStatus(managedElementName,clockSourceStatusList);
	}

	public void getAlarmAffectedServiceNames(java.lang.String serialNumber, org.omg.hw.emsMgr.ServiceNameList_THolder serviceNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAlarmAffectedServiceNames(serialNumber,serviceNameList);
	}

	public void unacknowledgeAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.unacknowledgeAlarms(alarmList,failedAlarmList);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getEMSTime(org.omg.hw.globaldefs.NVSList_THolder emsName, org.omg.CORBA.StringHolder emsTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getEMSTime(emsName,emsTime);
	}

	public void getAllRedefineAlarmDatas(org.omg.hw.emsMgr.QueryRedefineAlarmData_T[] queryConditionList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder redefineAlarmDataList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllRedefineAlarmDatas(queryConditionList,redefineAlarmDataList);
	}

	public void getAllSecondlyAlarms(java.lang.String[] alarmList, org.omg.hw.notifications.EventList_THolder eventList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSecondlyAlarms(alarmList,eventList);
	}

	public void setAlarmReportingOff(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOff(resourceName);
	}

}
