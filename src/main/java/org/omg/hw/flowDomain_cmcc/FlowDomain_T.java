package org.omg.hw.flowDomain_cmcc;

/**
 *	Generated from IDL definition of struct "FlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomain_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FlowDomain_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String networkAccessDomain = "";
	public org.omg.hw.flowDomain_cmcc.ConnectivityState_T fDConnectivityState;
	public java.lang.String fdType;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomain_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String networkAccessDomain, org.omg.hw.flowDomain_cmcc.ConnectivityState_T fDConnectivityState, java.lang.String fdType, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.networkAccessDomain = networkAccessDomain;
		this.fDConnectivityState = fDConnectivityState;
		this.fdType = fdType;
		this.additionalInfo = additionalInfo;
	}
}
