package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "HW_IFProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_IFProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_IFProtectionGroup_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.protection.ProtectionGroupType_T protectionGroupType;
	public org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState;
	public org.omg.hw.protection.ReversionMode_T reversionMode;
	public short rate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] pgpTPList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] pgpParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_IFProtectionGroup_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.protection.ProtectionGroupType_T protectionGroupType, org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState, org.omg.hw.protection.ReversionMode_T reversionMode, short rate, org.omg.hw.globaldefs.NameAndStringValue_T[][] pgpTPList, org.omg.hw.globaldefs.NameAndStringValue_T[] pgpParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
