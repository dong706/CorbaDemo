package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "IPProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class IPProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IPProtectionGroup_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionGroupType = "";
	public org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState;
	public org.omg.hw.protection.ReversionMode_T reversionMode;
	public short rate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] protectedList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] protectingList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] pgpParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public IPProtectionGroup_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionGroupType, org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState, org.omg.hw.protection.ReversionMode_T reversionMode, short rate, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectedList, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectingList, org.omg.hw.globaldefs.NameAndStringValue_T[] pgpParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.protectedList = protectedList;
		this.protectingList = protectingList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
