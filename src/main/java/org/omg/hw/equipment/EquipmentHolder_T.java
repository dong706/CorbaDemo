package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of struct "EquipmentHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentHolder_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EquipmentHolder_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean alarmReportingIndicator;
	public java.lang.String holderType;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] expectedOrInstalledEquipment;
	public java.lang.String[] acceptableEquipmentTypeList;
	public org.omg.hw.equipment.HolderState_T holderState;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EquipmentHolder_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean alarmReportingIndicator, java.lang.String holderType, org.omg.hw.globaldefs.NameAndStringValue_T[] expectedOrInstalledEquipment, java.lang.String[] acceptableEquipmentTypeList, org.omg.hw.equipment.HolderState_T holderState, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.alarmReportingIndicator = alarmReportingIndicator;
		this.holderType = holderType;
		this.expectedOrInstalledEquipment = expectedOrInstalledEquipment;
		this.acceptableEquipmentTypeList = acceptableEquipmentTypeList;
		this.holderState = holderState;
		this.additionalInfo = additionalInfo;
	}
}
