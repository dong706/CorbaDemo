package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "WDMProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public WDMProtectionGroup_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionGroupType;
	public org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState;
	public org.omg.hw.protection.ReversionMode_T reversionMode;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] pgpTPList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] pgpParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public WDMProtectionGroup_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionGroupType, org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState, org.omg.hw.protection.ReversionMode_T reversionMode, org.omg.hw.globaldefs.NameAndStringValue_T[][] pgpTPList, org.omg.hw.globaldefs.NameAndStringValue_T[] pgpParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
