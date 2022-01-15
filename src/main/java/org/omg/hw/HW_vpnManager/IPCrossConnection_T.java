package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "IPCrossConnection_T"
 *	@author JacORB IDL compiler 
 */

public final class IPCrossConnection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IPCrossConnection_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public java.lang.String userLabel = "";
	public org.omg.hw.subnetworkConnection.SNCState_T activeState;
	public org.omg.hw.performance.AdministrativeState_T administrativeState;
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.subnetworkConnection.SNCType_T ccType;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.subnetworkConnection.TPData_T[] aEndList;
	public org.omg.hw.subnetworkConnection.TPData_T[] zEndList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public IPCrossConnection_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, java.lang.String userLabel, org.omg.hw.subnetworkConnection.SNCState_T activeState, org.omg.hw.performance.AdministrativeState_T administrativeState, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.subnetworkConnection.SNCType_T ccType, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.subnetworkConnection.TPData_T[] aEndList, org.omg.hw.subnetworkConnection.TPData_T[] zEndList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.userLabel = userLabel;
		this.activeState = activeState;
		this.administrativeState = administrativeState;
		this.direction = direction;
		this.ccType = ccType;
		this.transmissionParams = transmissionParams;
		this.aEndList = aEndList;
		this.zEndList = zEndList;
		this.additionalInfo = additionalInfo;
	}
}
