package org.omg.hw.flowDomain_cmcc;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomain_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MatrixFlowDomain_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String networkAccessDomain = "";
	public boolean flexible;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomain_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String networkAccessDomain, boolean flexible, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.networkAccessDomain = networkAccessDomain;
		this.flexible = flexible;
		this.additionalInfo = additionalInfo;
	}
}
