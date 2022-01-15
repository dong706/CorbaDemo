package org.omg.hw.flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrCreateData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.omg.hw.performance.AdministrativeState_T administrativeState;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FDFrCreateData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.omg.hw.performance.AdministrativeState_T administrativeState, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
