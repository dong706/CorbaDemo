package org.omg.hw.flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FlowDomainFragment_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] endTPs;
	public java.lang.String networkAccessDomain = "";
	public boolean flexible;
	public org.omg.hw.performance.AdministrativeState_T administrativeState;
	public org.omg.hw.subnetworkConnection.SNCState_T fdfrState;
	public org.omg.hw.flowDomainFragment.FDFrType_T fdfrType;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomainFragment_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[][] endTPs, java.lang.String networkAccessDomain, boolean flexible, org.omg.hw.performance.AdministrativeState_T administrativeState, org.omg.hw.subnetworkConnection.SNCState_T fdfrState, org.omg.hw.flowDomainFragment.FDFrType_T fdfrType, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.endTPs = endTPs;
		this.networkAccessDomain = networkAccessDomain;
		this.flexible = flexible;
		this.administrativeState = administrativeState;
		this.fdfrState = fdfrState;
		this.fdfrType = fdfrType;
		this.additionalInfo = additionalInfo;
	}
}
