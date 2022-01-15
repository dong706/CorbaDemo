package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunkModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunkModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficTrunkModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.omg.hw.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.HW_vpnManager.IPCrossConnection_T[] addedOrNewRoute;
	public org.omg.hw.HW_vpnManager.IPCrossConnection_T[] removedRoute;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.omg.hw.subnetworkConnection.TPData_T[] aEnd;
	public org.omg.hw.subnetworkConnection.TPData_T[] zEnd;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficTrunkModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.subnetworkConnection.Reroute_T rerouteAllowed, org.omg.hw.subnetworkConnection.NetworkRouted_T networkRouted, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.HW_vpnManager.IPCrossConnection_T[] addedOrNewRoute, org.omg.hw.HW_vpnManager.IPCrossConnection_T[] removedRoute, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.omg.hw.subnetworkConnection.TPData_T[] aEnd, org.omg.hw.subnetworkConnection.TPData_T[] zEnd, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.transmissionParams = transmissionParams;
		this.addedOrNewRoute = addedOrNewRoute;
		this.removedRoute = removedRoute;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalInfo = additionalInfo;
	}
}
