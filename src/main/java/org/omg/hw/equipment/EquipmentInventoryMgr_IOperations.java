package org.omg.hw.equipment;

/**
 *	Generated from IDL interface "EquipmentInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EquipmentInventoryMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void provisionEquipment(org.omg.hw.equipment.EQTCreateData_T equipmentCreateData, org.omg.hw.equipment.Equipment_THolder createdEquipment) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void unprovisionEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setAlarmReportingOn(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setAlarmReportingOff(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getContainedEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentHolderName, org.omg.hw.equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, org.omg.hw.equipment.EquipmentOrHolder_THolder equip) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, org.omg.hw.equipment.EquipmentOrHolderList_THolder eqList, org.omg.hw.equipment.EquipmentOrHolderIterator_IHolder eqIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllEquipmentNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSupportedPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSupportedPTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSupportingEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] ptpName, org.omg.hw.equipment.EquipmentOrHolderList_THolder eqList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSupportingEquipmentNames(org.omg.hw.globaldefs.NameAndStringValue_T[] ptpName, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getEquipmentStaticInfo(java.lang.String[] typeList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder staticInfoList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getPhysicalLocationInfo(org.omg.hw.equipment.PhysicalLocationInfoList_THolder phyLocationInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllEquipmentAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrHolderName, org.omg.hw.equipment.ObjectAdditionalInfoList_THolder additionalInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAlarmSeverityList(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, org.omg.hw.equipment.SeverityList_THolder severityList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setAlarmSeverityList(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, org.omg.hw.equipment.Severity_T[] severityList) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
