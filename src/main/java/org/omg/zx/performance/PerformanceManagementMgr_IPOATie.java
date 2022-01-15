package org.omg.zx.performance;

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
	public org.omg.zx.performance.PerformanceManagementMgr_I _this()
	{
		return org.omg.zx.performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
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
	public void clearPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.clearPMData(pmTPSelectList,failedTPSelectList);
	}

	public void disablePMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.disablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void getAllCurrentPMDataByCond(org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, int how_many, org.omg.zx.performance.PMData_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMDataByCond(pmTPParamSelectList,how_many,pmDataList,pmIt);
	}

	public void queryPMCollectionPlan(int pmCollectionPlanID, org.omg.zx.performance.PMCollectionPlanList_THolder pmCollectionPlan) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.queryPMCollectionPlan(pmCollectionPlanID,pmCollectionPlan);
	}

	public void setTCATPParameter(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, org.omg.zx.performance.TCAParameters_THolder tcaParameters) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setTCATPParameter(tpName,tcaParameters);
	}

	public void changePMCollectionPlan(int pmCollectionPlanID, org.omg.zx.performance.PMCollectionPlan_T[] pmCollectionPlan) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.changePMCollectionPlan(pmCollectionPlanID,pmCollectionPlan);
	}

	public void getAllPMPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.omg.zx.performance.PMPList_THolder pmpList, org.omg.zx.performance.PMPIterator_IHolder pmpIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllPMPs(tpOrMeName,how_many,pmpList,pmpIt);
	}

	public void getTCATPParameter(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.omg.zx.performance.TCAParameters_THolder tcaParameter) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMData(destination,userName,password,pmTPParamSelectList,startTime,endTime,forceUpload);
	}

	public void getTPHistoryPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.zx.performance.PMDataList_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void clearPMCollectionPlan(int pmCollectionPlanID) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.clearPMCollectionPlan(pmCollectionPlanID);
	}

	public void getAllCurrentPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.omg.zx.performance.PMDataList_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void enablePMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.enablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllPMCollectionPlan(org.omg.zx.performance.PMTaskList_THolder pmTaskList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllPMCollectionPlan(pmTaskList);
	}

	public void setPMCollectionPlan(org.omg.zx.performance.PMCollectionPlan_T[] pmCollectionPlan, org.omg.CORBA.IntHolder pmCollectionPlanID) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setPMCollectionPlan(pmCollectionPlan,pmCollectionPlanID);
	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void clearSpecificPMData(org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, org.omg.zx.performance.PMTPParamSelectList_THolder failedTPParamSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.clearSpecificPMData(pmTPParamSelectList,failedTPParamSelectList);
	}

	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

}
