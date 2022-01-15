package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of struct "EQTCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class EQTCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EQTCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String expectedEquipmentObjectType;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentHolderName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EQTCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String expectedEquipmentObjectType, org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentHolderName, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.expectedEquipmentObjectType = expectedEquipmentObjectType;
		this.equipmentHolderName = equipmentHolderName;
		this.additionalInfo = additionalInfo;
	}
}
