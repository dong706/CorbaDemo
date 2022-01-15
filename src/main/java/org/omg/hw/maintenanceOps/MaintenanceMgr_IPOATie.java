package org.omg.hw.maintenanceOps;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MaintenanceMgr_IPOATie
	extends MaintenanceMgr_IPOA
{
	private MaintenanceMgr_IOperations _delegate;

	private POA _poa;
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.maintenanceOps.MaintenanceMgr_I _this()
	{
		return org.omg.hw.maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object(orb));
	}
	public MaintenanceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MaintenanceMgr_IOperations delegate)
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
	public void deleteMaintenanceAssociation(org.omg.hw.globaldefs.NameAndStringValue_T[] maName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenanceAssociation(maName);
	}

	public void performMaintenanceOperation(org.omg.hw.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, org.omg.hw.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperation(maintenanceOperation,maintenanceOperationMode);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllMaintenanceDomains(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenanceDomainList_THolder mdList, org.omg.hw.maintenanceOps.HW_MaintenanceDomainIterator_IHolder mdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenanceDomains(meName,how_many,mdList,mdIt);
	}

	public void deleteMaintenanceDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] mdName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenanceDomain(mdName);
	}

	public void getOAMParameters(org.omg.hw.globaldefs.NameAndStringValue_T[] name, org.omg.hw.transmissionParameters.LayeredParameterList_THolder ParamList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getOAMParameters(name,ParamList);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setServiceAlarmReportingOn(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setServiceAlarmReportingOn(serviceName,alarmEventList);
	}

	public void getPRBSTestResult(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.maintenanceOps.PRBSTestResultList_THolder resultList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getPRBSTestResult(tpNameList,resultList);
	}

	public void getAllMaintenanceAssociations(org.omg.hw.globaldefs.NameAndStringValue_T[] mdName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenanceAssociationList_THolder maList, org.omg.hw.maintenanceOps.HW_MaintenanceAssociationIterator_IHolder maIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenanceAssociations(mdName,how_many,maList,maIt);
	}

	public void deleteMaintenancePoint(org.omg.hw.globaldefs.NameAndStringValue_T[] mpName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenancePoint(mpName);
	}

	public void performMaintenanceOperationEx(org.omg.hw.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, org.omg.hw.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, org.omg.hw.globaldefs.NamingAttributesList_THolder resultOfMaintenanceData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperationEx(maintenanceOperation,maintenanceOperationMode,resultOfMaintenanceData);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void disablePRBSTest(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.disablePRBSTest(tpNameList,failedTPList);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void createATMMaintenanceEntity(org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_T maintenanceEntityAttr, org.omg.hw.globaldefs.NVSList_THolder maintenanceEntityName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createATMMaintenanceEntity(maintenanceEntityAttr,maintenanceEntityName);
	}

	public void getAllMaintenancePoints(org.omg.hw.globaldefs.NameAndStringValue_T[] mdOrMaName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenancePointList_THolder mpList, org.omg.hw.maintenanceOps.HW_MaintenancePointIterator_IHolder mpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenancePoints(mdOrMaName,how_many,mpList,mpIt);
	}

	public void createMaintenanceAssociation(org.omg.hw.maintenanceOps.HW_MaintenanceAssociation_T ma, org.omg.hw.maintenanceOps.HW_MaintenanceAssociation_THolder theMA, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createMaintenanceAssociation(ma,theMA,errorReason);
	}

	public void getActiveMaintenanceOperations(org.omg.hw.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.omg.hw.maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, org.omg.hw.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getActiveMaintenanceOperations(tpOrMeName,how_many,currentMaintenanceOpeationList,cmoIt);
	}

	public void createMaintenanceDomain(org.omg.hw.maintenanceOps.HW_MaintenanceDomain_T md, org.omg.hw.maintenanceOps.HW_MaintenanceDomain_THolder theMD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createMaintenanceDomain(md,theMD,errorReason);
	}

	public void setOAMParameters(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String oamParamType, org.omg.hw.transmissionParameters.LayeredParameters_T[] ParamList, org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder oamParameters) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOAMParameters(name,oamParamType,ParamList,oamParameters);
	}

	public void setServiceAlarmReportingOff(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setServiceAlarmReportingOff(serviceName,alarmEventList);
	}

	public void createMaintenancePoints(org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_T mpCreateData, org.omg.hw.maintenanceOps.HW_MaintenancePoint_THolder theMP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createMaintenancePoints(mpCreateData,theMP,errorReason);
	}

	public void enablePRBSTest(org.omg.hw.maintenanceOps.PRBSTestParameter_T[] testParaList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.enablePRBSTest(testParaList,failedTPList);
	}

}
