package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "ESwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ESwitchData_T(){}
	public java.lang.String eProtectionGroupType;
	public java.lang.String eSwitchReason;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] ePGPName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] protectedE;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] switchToE;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ESwitchData_T(java.lang.String eProtectionGroupType, java.lang.String eSwitchReason, org.omg.hw.globaldefs.NameAndStringValue_T[] ePGPName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectedE, org.omg.hw.globaldefs.NameAndStringValue_T[] switchToE, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.eProtectionGroupType = eProtectionGroupType;
		this.eSwitchReason = eSwitchReason;
		this.ePGPName = ePGPName;
		this.protectedE = protectedE;
		this.switchToE = switchToE;
		this.additionalInfo = additionalInfo;
	}
}
