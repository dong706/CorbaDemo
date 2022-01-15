package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MatrixFlowDomainFragment_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public org.omg.hw.subnetworkConnection.TPData_T[] aEnd;
	public org.omg.hw.subnetworkConnection.TPData_T[] zEnd;
	public org.omg.hw.subnetworkConnection.SNCState_T fdfrState;
	public org.omg.hw.performance.AdministrativeState_T administrativeState;
	public boolean flexible;
	public java.lang.String mfdfrType;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomainFragment_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, org.omg.hw.subnetworkConnection.TPData_T[] aEnd, org.omg.hw.subnetworkConnection.TPData_T[] zEnd, org.omg.hw.subnetworkConnection.SNCState_T fdfrState, org.omg.hw.performance.AdministrativeState_T administrativeState, boolean flexible, java.lang.String mfdfrType, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.multipointServiceAttr = multipointServiceAttr;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.fdfrState = fdfrState;
		this.administrativeState = administrativeState;
		this.flexible = flexible;
		this.mfdfrType = mfdfrType;
		this.additionalInfo = additionalInfo;
	}
}
