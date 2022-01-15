package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SubnetworkConnection_T"
 *	@author JacORB IDL compiler 
 */

public final class SubnetworkConnection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SubnetworkConnection_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.zx.subnetworkConnection.SNCState_T sncState;
	public org.omg.zx.globaldefs.ConnectionDirection_T direction;
	public short rate;
	public org.omg.zx.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public org.omg.zx.subnetworkConnection.SNCType_T sncType;
	public org.omg.zx.subnetworkConnection.TPData_T[] aEnd;
	public org.omg.zx.subnetworkConnection.TPData_T[] zEnd;
	public org.omg.zx.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.omg.zx.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SubnetworkConnection_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.zx.subnetworkConnection.SNCState_T sncState, org.omg.zx.globaldefs.ConnectionDirection_T direction, short rate, org.omg.zx.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, org.omg.zx.subnetworkConnection.SNCType_T sncType, org.omg.zx.subnetworkConnection.TPData_T[] aEnd, org.omg.zx.subnetworkConnection.TPData_T[] zEnd, org.omg.zx.subnetworkConnection.Reroute_T rerouteAllowed, org.omg.zx.subnetworkConnection.NetworkRouted_T networkRouted, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.sncState = sncState;
		this.direction = direction;
		this.rate = rate;
		this.staticProtectionLevel = staticProtectionLevel;
		this.sncType = sncType;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.additionalInfo = additionalInfo;
	}
}
