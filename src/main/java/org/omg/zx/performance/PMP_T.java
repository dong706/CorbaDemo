package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMP_T"
 *	@author JacORB IDL compiler 
 */

public final class PMP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMP_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.zx.performance.PMParameterWithThresholds_T[] pmParameterWithThresholdsList;
	public org.omg.zx.performance.AdministrativeState_T monitoringState;
	public org.omg.zx.performance.AdministrativeState_T supervisionState;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public PMP_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.zx.performance.PMParameterWithThresholds_T[] pmParameterWithThresholdsList, org.omg.zx.performance.AdministrativeState_T monitoringState, org.omg.zx.performance.AdministrativeState_T supervisionState, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.pmParameterWithThresholdsList = pmParameterWithThresholdsList;
		this.monitoringState = monitoringState;
		this.supervisionState = supervisionState;
		this.additionalInfo = additionalInfo;
	}
}
