package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "IPSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class IPSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IPSwitchData_T(){}
	public java.lang.String protectionType = "";
	public org.omg.hw.protection.SwitchReason_T switchReason;
	public short layerRate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] groupName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] protectedList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] switchToList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public IPSwitchData_T(java.lang.String protectionType, org.omg.hw.protection.SwitchReason_T switchReason, short layerRate, org.omg.hw.globaldefs.NameAndStringValue_T[] groupName, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectedList, org.omg.hw.globaldefs.NameAndStringValue_T[][] switchToList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedList = protectedList;
		this.switchToList = switchToList;
		this.additionalInfo = additionalInfo;
	}
}
