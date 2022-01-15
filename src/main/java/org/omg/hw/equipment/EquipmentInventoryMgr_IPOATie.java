package org.omg.hw.equipment;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EquipmentInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EquipmentInventoryMgr_IPOATie
	extends EquipmentInventoryMgr_IPOA
{
	private EquipmentInventoryMgr_IOperations _delegate;

	private POA _poa;
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.equipment.EquipmentInventoryMgr_I _this()
	{
		return org.omg.hw.equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.equipment.EquipmentInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object(orb));
	}
	public EquipmentInventoryMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EquipmentInventoryMgr_IOperations delegate)
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
	public void getEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, org.omg.hw.equipment.EquipmentOrHolder_THolder equip) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getEquipment(equipmentOrHolderName,equip);
	}

	public void getAllEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, org.omg.hw.equipment.EquipmentOrHolderList_THolder eqList, org.omg.hw.equipment.EquipmentOrHolderIterator_IHolder eqIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipment(meOrHolderName,how_many,eqList,eqIt);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getContainedEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentHolderName, org.omg.hw.equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainedEquipment(equipmentHolderName,equipmentOrHolderList);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllSupportedPTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPNames(equipmentName,how_many,nameList,nameIt);
	}

	public void getAllSupportingEquipmentNames(org.omg.hw.globaldefs.NameAndStringValue_T[] ptpName, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportingEquipmentNames(ptpName,nameList);
	}

	public void getAllEquipmentNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentNames(meOrHolderName,how_many,nameList,nameIt);
	}

	public void getPhysicalLocationInfo(org.omg.hw.equipment.PhysicalLocationInfoList_THolder phyLocationInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getPhysicalLocationInfo(phyLocationInfoList);
	}

	public void getAllEquipmentAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrHolderName, org.omg.hw.equipment.ObjectAdditionalInfoList_THolder additionalInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentAdditionalInfo(meOrHolderName,additionalInfoList);
	}

	public void provisionEquipment(org.omg.hw.equipment.EQTCreateData_T equipmentCreateData, org.omg.hw.equipment.Equipment_THolder createdEquipment) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.provisionEquipment(equipmentCreateData,createdEquipment);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setAlarmSeverityList(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, org.omg.hw.equipment.Severity_T[] severityList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmSeverityList(equipmentOrHolderName,severityList);
	}

	public void getAllSupportedPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPs(equipmentName,how_many,tpList,tpIt);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getEquipmentStaticInfo(java.lang.String[] typeList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder staticInfoList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getEquipmentStaticInfo(typeList,how_many,staticInfoList,staticInfoIt);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setAlarmReportingOn(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOn(equipmentOrHolderName);
	}

	public void getAlarmSeverityList(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, org.omg.hw.equipment.SeverityList_THolder severityList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAlarmSeverityList(equipmentOrHolderName,severityList);
	}

	public void getAllSupportingEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] ptpName, org.omg.hw.equipment.EquipmentOrHolderList_THolder eqList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportingEquipment(ptpName,eqList);
	}

	public void unprovisionEquipment(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.unprovisionEquipment(equipmentName);
	}

	public void setAlarmReportingOff(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOff(equipmentOrHolderName);
	}

}
