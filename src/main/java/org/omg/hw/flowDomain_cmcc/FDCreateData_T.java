package org.omg.hw.flowDomain_cmcc;

/**
 *	Generated from IDL definition of struct "FDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDCreateData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] mfds;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FDCreateData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfds, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.mfds = mfds;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
