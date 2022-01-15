package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.zx.globaldefs.ConnectionDirection_T direction;
	public org.omg.zx.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public org.omg.zx.subnetworkConnection.ProtectionEffort_T protectionEffort;
	public org.omg.zx.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.omg.zx.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.omg.zx.subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public org.omg.zx.subnetworkConnection.CrossConnect_T[] ccInclusions;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] aEnd;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] zEnd;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.zx.globaldefs.ConnectionDirection_T direction, org.omg.zx.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, org.omg.zx.subnetworkConnection.ProtectionEffort_T protectionEffort, org.omg.zx.subnetworkConnection.Reroute_T rerouteAllowed, org.omg.zx.subnetworkConnection.NetworkRouted_T networkRouted, org.omg.zx.subnetworkConnection.SNCType_T sncType, short layerRate, org.omg.zx.subnetworkConnection.CrossConnect_T[] ccInclusions, org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.omg.zx.globaldefs.NameAndStringValue_T[][] aEnd, org.omg.zx.globaldefs.NameAndStringValue_T[][] zEnd, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.staticProtectionLevel = staticProtectionLevel;
		this.protectionEffort = protectionEffort;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.sncType = sncType;
		this.layerRate = layerRate;
		this.ccInclusions = ccInclusions;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
