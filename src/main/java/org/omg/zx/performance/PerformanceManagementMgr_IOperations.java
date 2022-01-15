package org.omg.zx.performance;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface PerformanceManagementMgr_IOperations
	extends org.omg.zx.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void setPMCollectionPlan(org.omg.zx.performance.PMCollectionPlan_T[] pmCollectionPlan, org.omg.CORBA.IntHolder pmCollectionPlanID) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void changePMCollectionPlan(int pmCollectionPlanID, org.omg.zx.performance.PMCollectionPlan_T[] pmCollectionPlan) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void queryPMCollectionPlan(int pmCollectionPlanID, org.omg.zx.performance.PMCollectionPlanList_THolder pmCollectionPlan) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllPMCollectionPlan(org.omg.zx.performance.PMTaskList_THolder pmTaskList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void clearPMCollectionPlan(int pmCollectionPlanID) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getTCATPParameter(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.omg.zx.performance.TCAParameters_THolder tcaParameter) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setTCATPParameter(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, org.omg.zx.performance.TCAParameters_THolder tcaParameters) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllCurrentPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.omg.zx.performance.PMDataList_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void disablePMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void enablePMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void clearPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllPMPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.omg.zx.performance.PMPList_THolder pmpList, org.omg.zx.performance.PMPIterator_IHolder pmpIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getTPHistoryPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.zx.performance.PMDataList_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void clearSpecificPMData(org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, org.omg.zx.performance.PMTPParamSelectList_THolder failedTPParamSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getAllCurrentPMDataByCond(org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, int how_many, org.omg.zx.performance.PMData_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
