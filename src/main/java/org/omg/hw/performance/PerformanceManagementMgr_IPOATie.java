package org.omg.hw.performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PerformanceManagementMgr_IPOATie
	extends PerformanceManagementMgr_IPOA
{
	private PerformanceManagementMgr_IOperations _delegate;

	private POA _poa;
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.performance.PerformanceManagementMgr_I _this()
	{
		return org.omg.hw.performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
	}
	public PerformanceManagementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PerformanceManagementMgr_IOperations delegate)
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
	public void selectPMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName, org.omg.hw.performance.CollectTaskInfoList_THolder taskInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.selectPMCollectionTask(taskNameList,emsUserName,taskInfoList);
	}

	public void clearPMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.clearPMData(pmTPSelectList,failedTPSelectList);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getPMState(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.omg.hw.performance.PMStateList_THolder pmStateList, org.omg.hw.performance.PMStateIterator_IHolder pmStateIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getPMState(pmTPSelectList,pmParameters,how_many,pmStateList,pmStateIt);
	}

	public void createPMCollectionTask(java.lang.String taskName, java.lang.String destination, java.lang.String userName, java.lang.String password, java.lang.String emsUserName, org.omg.hw.globaldefs.NameAndStringValue_T[][] pmTPSelectList, java.lang.String period, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createPMCollectionTask(taskName,destination,userName,password,emsUserName,pmTPSelectList,period,startTime,endTime,forceUpload);
	}

	public void createPerformanceMonitoringData(org.omg.hw.performance.PerformanceCreateInstance_T createInstance, org.omg.hw.performance.PerformanceCreateInstanceList_THolder failedInstanceList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createPerformanceMonitoringData(createInstance,failedInstanceList);
	}

	public void disablePMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.disablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getTPHistoryPMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.performance.PMDataList_THolder pmDataList, org.omg.hw.performance.PMDataIterator_IHolder pmIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
	}

	public void setTCATPParameter(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.performance.TCAParameters_THolder tcaParameters) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setTCATPParameter(tpName,tcaParameters);
	}

	public void ModifyPMCollectionTask(java.lang.String oldTaskName, java.lang.String newTaskName, java.lang.String emsUserName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.ModifyPMCollectionTask(oldTaskName,newTaskName,emsUserName);
	}

	public void getHoldingTime(org.omg.hw.performance.HoldingTime_THolder holdingTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getHoldingTime(holdingTime);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMData(destination,userName,password,pmTPSelectList,pmParameters,startTime,endTime,forceUpload);
	}

	public void disableTCA(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.disableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getTCATPParameter(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.omg.hw.performance.TCAParameters_THolder tcaParameter) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getPfmInstanceByResource(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceRef, short[] layerRateList, org.omg.hw.performance.PerformanceMonitoringInstanceList_THolder instanceList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getPfmInstanceByResource(resourceRef,layerRateList,instanceList);
	}

	public void setTCANotifySwitch(boolean tcaNotifySwitch) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setTCANotifySwitch(tcaNotifySwitch);
	}

	public void SuspendPMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.SuspendPMCollectionTask(taskName,emsUserName);
	}

	public void getAllCurrentPMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.omg.hw.performance.PMDataList_THolder pmDataList, org.omg.hw.performance.PMDataIterator_IHolder pmIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
	}

	public void enableTCA(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.enableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void enablePMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.enablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void ResumePMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.ResumePMCollectionTask(taskName,emsUserName);
	}

	public void getMEPMcapabilities(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, short layerRate, org.omg.hw.performance.PMParameterList_THolder pmParameterList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getMEPMcapabilities(meName,layerRate,pmParameterList);
	}

	public void deletePerformanceMonitoringData(org.omg.hw.performance.PMTPSelect_T[] pmTpSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTpSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deletePerformanceMonitoringData(pmTpSelectList,failedTpSelectList);
	}

	public void getHistoryPMDataByPull(java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMDataByPull(taskName,compressType,packingType,pmTPSelectList,pmParameters,startTime,endTime);
	}

	public void deletePMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deletePMCollectionTask(taskNameList,emsUserName);
	}

}
