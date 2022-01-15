package org.omg.hw.flowDomainFragment_cmcc;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.omg.hw.performance.AdministrativeState_T administrativeState;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNamesToRemove;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] aEndTPNames;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] zEndTPNames;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] internalTPNames;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public FDFrModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.omg.hw.performance.AdministrativeState_T administrativeState, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNamesToRemove, org.omg.hw.globaldefs.NameAndStringValue_T[][] aEndTPNames, org.omg.hw.globaldefs.NameAndStringValue_T[][] zEndTPNames, org.omg.hw.globaldefs.NameAndStringValue_T[][] internalTPNames, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.tpNamesToRemove = tpNamesToRemove;
		this.aEndTPNames = aEndTPNames;
		this.zEndTPNames = zEndTPNames;
		this.internalTPNames = internalTPNames;
		this.additionalModificationInfo = additionalModificationInfo;
	}
}
