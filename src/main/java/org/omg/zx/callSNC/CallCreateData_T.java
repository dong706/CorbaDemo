package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "CallCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class CallCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallCreateData_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] callName;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.omg.zx.callSNC.CallEnd_T aEnd;
	public org.omg.zx.callSNC.CallEnd_T zEnd;
	public org.omg.zx.callSNC.CallParameterProfile_T callParameters;
	public org.omg.zx.callSNC.Diversity_T callDiversity;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public CallCreateData_T(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.omg.zx.callSNC.CallEnd_T aEnd, org.omg.zx.callSNC.CallEnd_T zEnd, org.omg.zx.callSNC.CallParameterProfile_T callParameters, org.omg.zx.callSNC.Diversity_T callDiversity, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.callName = callName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.callParameters = callParameters;
		this.callDiversity = callDiversity;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
