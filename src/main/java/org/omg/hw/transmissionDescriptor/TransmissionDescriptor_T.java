package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TransmissionDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionDescriptor_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TransmissionDescriptor_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalTPInfo;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] containingTMDName;
	public java.lang.String externalRepresentationReference = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TransmissionDescriptor_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalTPInfo, org.omg.hw.globaldefs.NameAndStringValue_T[] containingTMDName, java.lang.String externalRepresentationReference, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.additionalTPInfo = additionalTPInfo;
		this.containingTMDName = containingTMDName;
		this.externalRepresentationReference = externalRepresentationReference;
		this.additionalInfo = additionalInfo;
	}
}
