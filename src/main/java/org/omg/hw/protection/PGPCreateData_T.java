package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "PGPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class PGPCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PGPCreateData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public org.omg.hw.protection.ProtectionGroupType_T protectionGroupType;
	public short rate;
	public org.omg.hw.protection.PGPModifyData_T modifiableAttributes;
	public PGPCreateData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, org.omg.hw.protection.ProtectionGroupType_T protectionGroupType, short rate, org.omg.hw.protection.PGPModifyData_T modifiableAttributes)
	{
		this.name = name;
		this.protectionGroupType = protectionGroupType;
		this.rate = rate;
		this.modifiableAttributes = modifiableAttributes;
	}
}
