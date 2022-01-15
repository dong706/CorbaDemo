package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TMDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TMDModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TMDModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalObjectInfo;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] containingTMDName;
	public java.lang.String externalRepresentationReference = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TMDModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalObjectInfo, org.omg.hw.globaldefs.NameAndStringValue_T[] containingTMDName, java.lang.String externalRepresentationReference, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.additionalObjectInfo = additionalObjectInfo;
		this.containingTMDName = containingTMDName;
		this.externalRepresentationReference = externalRepresentationReference;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
