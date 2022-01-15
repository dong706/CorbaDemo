package org.omg.hw.terminationPoint;

/**
 *	Generated from IDL definition of struct "TerminationPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class TerminationPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TerminationPoint_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public org.omg.hw.terminationPoint.TPType_T type;
	public org.omg.hw.terminationPoint.TPConnectionState_T connectionState;
	public org.omg.hw.terminationPoint.TerminationMode_T tpMappingMode;
	public org.omg.hw.terminationPoint.Directionality_T direction;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TerminationPoint_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, org.omg.hw.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName, org.omg.hw.terminationPoint.TPType_T type, org.omg.hw.terminationPoint.TPConnectionState_T connectionState, org.omg.hw.terminationPoint.TerminationMode_T tpMappingMode, org.omg.hw.terminationPoint.Directionality_T direction, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
		this.type = type;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.additionalInfo = additionalInfo;
	}
}
