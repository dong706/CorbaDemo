package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "WDMSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public WDMSwitchData_T(){}
	public java.lang.String protectionType;
	public org.omg.hw.protection.SwitchReason_T switchReason;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] wPGPName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] protectedTP;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] switchToTP;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public WDMSwitchData_T(java.lang.String protectionType, org.omg.hw.protection.SwitchReason_T switchReason, org.omg.hw.globaldefs.NameAndStringValue_T[] wPGPName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectedTP, org.omg.hw.globaldefs.NameAndStringValue_T[] switchToTP, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.wPGPName = wPGPName;
		this.protectedTP = protectedTP;
		this.switchToTP = switchToTP;
		this.additionalInfo = additionalInfo;
	}
}
