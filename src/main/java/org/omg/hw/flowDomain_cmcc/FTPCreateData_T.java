package org.omg.hw.flowDomain_cmcc;

/**
 *	Generated from IDL definition of struct "FTPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FTPCreateData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] ingressTransmissionDescriptorName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] egressTransmissionDescriptorName;
	public org.omg.hw.terminationPoint.TerminationMode_T tpMappingMode;
	public org.omg.hw.terminationPoint.Directionality_T direction;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FTPCreateData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.omg.hw.globaldefs.NameAndStringValue_T[] ingressTransmissionDescriptorName, org.omg.hw.globaldefs.NameAndStringValue_T[] egressTransmissionDescriptorName, org.omg.hw.terminationPoint.TerminationMode_T tpMappingMode, org.omg.hw.terminationPoint.Directionality_T direction, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.equipmentName = equipmentName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.ingressTransmissionDescriptorName = ingressTransmissionDescriptorName;
		this.egressTransmissionDescriptorName = egressTransmissionDescriptorName;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
