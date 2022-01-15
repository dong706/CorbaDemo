package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "SwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SwitchData_T(){}
	public org.omg.hw.protection.ProtectionType_T protectionType;
	public org.omg.hw.protection.SwitchReason_T switchReason;
	public short layerRate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] groupName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] protectedTP;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] switchToTP;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SwitchData_T(org.omg.hw.protection.ProtectionType_T protectionType, org.omg.hw.protection.SwitchReason_T switchReason, short layerRate, org.omg.hw.globaldefs.NameAndStringValue_T[] groupName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectedTP, org.omg.hw.globaldefs.NameAndStringValue_T[] switchToTP, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedTP = protectedTP;
		this.switchToTP = switchToTP;
		this.additionalInfo = additionalInfo;
	}
}
