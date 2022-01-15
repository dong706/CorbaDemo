package org.omg.hw.subnetworkConnection;

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
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public org.omg.hw.subnetworkConnection.ProtectionEffort_T protectionEffort;
	public org.omg.hw.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.omg.hw.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.omg.hw.subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public org.omg.hw.subnetworkConnection.CrossConnect_T[] ccInclusions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] aEnd;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] zEnd;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, org.omg.hw.subnetworkConnection.ProtectionEffort_T protectionEffort, org.omg.hw.subnetworkConnection.Reroute_T rerouteAllowed, org.omg.hw.subnetworkConnection.NetworkRouted_T networkRouted, org.omg.hw.subnetworkConnection.SNCType_T sncType, short layerRate, org.omg.hw.subnetworkConnection.CrossConnect_T[] ccInclusions, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.omg.hw.globaldefs.NameAndStringValue_T[][] aEnd, org.omg.hw.globaldefs.NameAndStringValue_T[][] zEnd, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
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
