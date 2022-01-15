package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCModifyData_T(){}
	public java.lang.String userLabel = "";
	public java.lang.String owner = "";
	public org.omg.zx.globaldefs.ConnectionDirection_T direction;
	public java.lang.String modifyType = "";
	public boolean retainOldSNC;
	public boolean modifyServers_allowed;
	public org.omg.zx.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public org.omg.zx.subnetworkConnection.ProtectionEffort_T protectionEffort;
	public org.omg.zx.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.omg.zx.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.omg.zx.subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public org.omg.zx.subnetworkConnection.RouteDescriptor_T[] addedOrNewRoute;
	public org.omg.zx.subnetworkConnection.RouteDescriptor_T[] removedRoute;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] aEnd;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] zEnd;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCModifyData_T(java.lang.String userLabel, java.lang.String owner, org.omg.zx.globaldefs.ConnectionDirection_T direction, java.lang.String modifyType, boolean retainOldSNC, boolean modifyServers_allowed, org.omg.zx.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, org.omg.zx.subnetworkConnection.ProtectionEffort_T protectionEffort, org.omg.zx.subnetworkConnection.Reroute_T rerouteAllowed, org.omg.zx.subnetworkConnection.NetworkRouted_T networkRouted, org.omg.zx.subnetworkConnection.SNCType_T sncType, short layerRate, org.omg.zx.subnetworkConnection.RouteDescriptor_T[] addedOrNewRoute, org.omg.zx.subnetworkConnection.RouteDescriptor_T[] removedRoute, org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.omg.zx.globaldefs.NameAndStringValue_T[][] aEnd, org.omg.zx.globaldefs.NameAndStringValue_T[][] zEnd, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.owner = owner;
		this.direction = direction;
		this.modifyType = modifyType;
		this.retainOldSNC = retainOldSNC;
		this.modifyServers_allowed = modifyServers_allowed;
		this.staticProtectionLevel = staticProtectionLevel;
		this.protectionEffort = protectionEffort;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.sncType = sncType;
		this.layerRate = layerRate;
		this.addedOrNewRoute = addedOrNewRoute;
		this.removedRoute = removedRoute;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
