package org.omg.hw.flowDomain;

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
	public java.lang.String ftpType = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public org.omg.hw.terminationPoint.TPConnectionState_T connectionState;
	public org.omg.hw.terminationPoint.TerminationMode_T tpMappingMode;
	public org.omg.hw.terminationPoint.Directionality_T direction;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FTPCreateData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String ftpType, org.omg.hw.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, org.omg.hw.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName, org.omg.hw.terminationPoint.TPConnectionState_T connectionState, org.omg.hw.terminationPoint.TerminationMode_T tpMappingMode, org.omg.hw.terminationPoint.Directionality_T direction, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.equipmentName = equipmentName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.ftpType = ftpType;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
