package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "TrafficTrunk_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunk_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficTrunk_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.subnetworkConnection.SNCState_T activeState;
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.subnetworkConnection.TPData_T[] aEnd;
	public org.omg.hw.subnetworkConnection.TPData_T[] zEnd;
	public org.omg.hw.performance.AdministrativeState_T administrativeState;
	public org.omg.hw.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.omg.hw.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficTrunk_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.subnetworkConnection.SNCState_T activeState, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.subnetworkConnection.TPData_T[] aEnd, org.omg.hw.subnetworkConnection.TPData_T[] zEnd, org.omg.hw.performance.AdministrativeState_T administrativeState, org.omg.hw.subnetworkConnection.Reroute_T rerouteAllowed, org.omg.hw.subnetworkConnection.NetworkRouted_T networkRouted, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.activeState = activeState;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.administrativeState = administrativeState;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.additionalInfo = additionalInfo;
	}
}
