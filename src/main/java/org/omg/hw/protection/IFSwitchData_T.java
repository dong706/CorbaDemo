package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "IFSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class IFSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IFSwitchData_T(){}
	public org.omg.hw.protection.ProtectionGroupType_T protectionGroupType;
	public org.omg.hw.protection.SwitchReason_T switchReason;
	public short layerRate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] groupName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] protectedTPList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] switchToTPList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public IFSwitchData_T(org.omg.hw.protection.ProtectionGroupType_T protectionGroupType, org.omg.hw.protection.SwitchReason_T switchReason, short layerRate, org.omg.hw.globaldefs.NameAndStringValue_T[] groupName, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectedTPList, org.omg.hw.globaldefs.NameAndStringValue_T[][] switchToTPList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionGroupType = protectionGroupType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedTPList = protectedTPList;
		this.switchToTPList = switchToTPList;
		this.additionalInfo = additionalInfo;
	}
}
