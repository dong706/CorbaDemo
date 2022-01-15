package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MaintenanceMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void performMaintenanceOperation(org.omg.hw.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, org.omg.hw.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void performMaintenanceOperationEx(org.omg.hw.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, org.omg.hw.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, org.omg.hw.globaldefs.NamingAttributesList_THolder resultOfMaintenanceData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getActiveMaintenanceOperations(org.omg.hw.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.omg.hw.maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, org.omg.hw.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void enablePRBSTest(org.omg.hw.maintenanceOps.PRBSTestParameter_T[] testParaList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void disablePRBSTest(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getPRBSTestResult(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.maintenanceOps.PRBSTestResultList_THolder resultList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createMaintenanceDomain(org.omg.hw.maintenanceOps.HW_MaintenanceDomain_T md, org.omg.hw.maintenanceOps.HW_MaintenanceDomain_THolder theMD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllMaintenanceDomains(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenanceDomainList_THolder mdList, org.omg.hw.maintenanceOps.HW_MaintenanceDomainIterator_IHolder mdIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createMaintenanceAssociation(org.omg.hw.maintenanceOps.HW_MaintenanceAssociation_T ma, org.omg.hw.maintenanceOps.HW_MaintenanceAssociation_THolder theMA, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllMaintenanceAssociations(org.omg.hw.globaldefs.NameAndStringValue_T[] mdName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenanceAssociationList_THolder maList, org.omg.hw.maintenanceOps.HW_MaintenanceAssociationIterator_IHolder maIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createMaintenancePoints(org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_T mpCreateData, org.omg.hw.maintenanceOps.HW_MaintenancePoint_THolder theMP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllMaintenancePoints(org.omg.hw.globaldefs.NameAndStringValue_T[] mdOrMaName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenancePointList_THolder mpList, org.omg.hw.maintenanceOps.HW_MaintenancePointIterator_IHolder mpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteMaintenanceDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] mdName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteMaintenanceAssociation(org.omg.hw.globaldefs.NameAndStringValue_T[] maName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteMaintenancePoint(org.omg.hw.globaldefs.NameAndStringValue_T[] mpName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createATMMaintenanceEntity(org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_T maintenanceEntityAttr, org.omg.hw.globaldefs.NVSList_THolder maintenanceEntityName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setOAMParameters(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String oamParamType, org.omg.hw.transmissionParameters.LayeredParameters_T[] ParamList, org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder oamParameters) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getOAMParameters(org.omg.hw.globaldefs.NameAndStringValue_T[] name, org.omg.hw.transmissionParameters.LayeredParameterList_THolder ParamList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setServiceAlarmReportingOn(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setServiceAlarmReportingOff(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
