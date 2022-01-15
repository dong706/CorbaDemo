package org.omg.hw.performance;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface PerformanceManagementMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMEPMcapabilities(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, short layerRate, org.omg.hw.performance.PMParameterList_THolder pmParameterList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void disablePMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void enablePMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void clearPMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getHoldingTime(org.omg.hw.performance.HoldingTime_THolder holdingTime) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTCATPParameter(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.omg.hw.performance.TCAParameters_THolder tcaParameter) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTPHistoryPMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.performance.PMDataList_THolder pmDataList, org.omg.hw.performance.PMDataIterator_IHolder pmIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllCurrentPMData(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.omg.hw.performance.PMDataList_THolder pmDataList, org.omg.hw.performance.PMDataIterator_IHolder pmIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getPMState(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.omg.hw.performance.PMStateList_THolder pmStateList, org.omg.hw.performance.PMStateIterator_IHolder pmStateIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setTCATPParameter(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.performance.TCAParameters_THolder tcaParameters) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void enableTCA(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void disableTCA(org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createPMCollectionTask(java.lang.String taskName, java.lang.String destination, java.lang.String userName, java.lang.String password, java.lang.String emsUserName, org.omg.hw.globaldefs.NameAndStringValue_T[][] pmTPSelectList, java.lang.String period, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deletePMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void selectPMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName, org.omg.hw.performance.CollectTaskInfoList_THolder taskInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void SuspendPMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void ResumePMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void ModifyPMCollectionTask(java.lang.String oldTaskName, java.lang.String newTaskName, java.lang.String emsUserName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setTCANotifySwitch(boolean tcaNotifySwitch) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getHistoryPMDataByPull(java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, org.omg.hw.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createPerformanceMonitoringData(org.omg.hw.performance.PerformanceCreateInstance_T createInstance, org.omg.hw.performance.PerformanceCreateInstanceList_THolder failedInstanceList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deletePerformanceMonitoringData(org.omg.hw.performance.PMTPSelect_T[] pmTpSelectList, org.omg.hw.performance.PMTPSelectList_THolder failedTpSelectList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getPfmInstanceByResource(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceRef, short[] layerRateList, org.omg.hw.performance.PerformanceMonitoringInstanceList_THolder instanceList) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
