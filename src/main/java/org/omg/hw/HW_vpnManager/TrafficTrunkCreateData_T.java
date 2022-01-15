package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunkCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunkCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficTrunkCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.omg.hw.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public boolean fullRoute;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.omg.hw.subnetworkConnection.TPData_T[] aEnd;
	public org.omg.hw.subnetworkConnection.TPData_T[] zEnd;
	public org.omg.hw.HW_vpnManager.IPCrossConnection_T[] ipCCInclusions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TrafficTrunkCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.subnetworkConnection.Reroute_T rerouteAllowed, org.omg.hw.subnetworkConnection.NetworkRouted_T networkRouted, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, boolean fullRoute, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.omg.hw.subnetworkConnection.TPData_T[] aEnd, org.omg.hw.subnetworkConnection.TPData_T[] zEnd, org.omg.hw.HW_vpnManager.IPCrossConnection_T[] ipCCInclusions, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.transmissionParams = transmissionParams;
		this.fullRoute = fullRoute;
		this.neTpInclusions = neTpInclusions;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.ipCCInclusions = ipCCInclusions;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
