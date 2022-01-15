package org.omg.hw.trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrailNtwProtection_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.protection.ProtectionGroupType_T protectionGroupType;
	public org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState;
	public org.omg.hw.protection.ReversionMode_T reversionMode;
	public short rate;
	public java.lang.String trailNtwProtectionType = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupAName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupZName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] pgATPList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] pgZTPList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][][] workerTrailList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] protectionTrail;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] tnpParameters;
	public java.lang.String apsFunction = "";
	public java.lang.String networkAccessDomain = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrailNtwProtection_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.protection.ProtectionGroupType_T protectionGroupType, org.omg.hw.protection.ProtectionSchemeState_T protectionSchemeState, org.omg.hw.protection.ReversionMode_T reversionMode, short rate, java.lang.String trailNtwProtectionType, org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupAName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupZName, org.omg.hw.globaldefs.NameAndStringValue_T[][] pgATPList, org.omg.hw.globaldefs.NameAndStringValue_T[][] pgZTPList, org.omg.hw.globaldefs.NameAndStringValue_T[][][] workerTrailList, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectionTrail, org.omg.hw.globaldefs.NameAndStringValue_T[] tnpParameters, java.lang.String apsFunction, java.lang.String networkAccessDomain, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.trailNtwProtectionType = trailNtwProtectionType;
		this.protectionGroupAName = protectionGroupAName;
		this.protectionGroupZName = protectionGroupZName;
		this.pgATPList = pgATPList;
		this.pgZTPList = pgZTPList;
		this.workerTrailList = workerTrailList;
		this.protectionTrail = protectionTrail;
		this.tnpParameters = tnpParameters;
		this.apsFunction = apsFunction;
		this.networkAccessDomain = networkAccessDomain;
		this.additionalInfo = additionalInfo;
	}
}
