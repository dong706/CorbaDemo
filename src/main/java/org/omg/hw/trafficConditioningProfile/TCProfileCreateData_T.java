package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TCProfileCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TCProfileCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCProfileCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TCProfileCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
