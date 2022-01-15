package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "EProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class EProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EProtectionGroup_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String eProtectionGroupType;
	public org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState;
	public org.omg.hw.protection.ReversionMode_T reversionMode;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] protectedList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] protectingList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] ePgpParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EProtectionGroup_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String eProtectionGroupType, org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState, org.omg.hw.protection.ReversionMode_T reversionMode, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectedList, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectingList, org.omg.hw.globaldefs.NameAndStringValue_T[] ePgpParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.eProtectionGroupType = eProtectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.protectedList = protectedList;
		this.protectingList = protectingList;
		this.ePgpParameters = ePgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
