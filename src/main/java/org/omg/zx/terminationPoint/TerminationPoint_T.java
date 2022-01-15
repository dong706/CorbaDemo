package org.omg.zx.terminationPoint;

/**
 *	Generated from IDL definition of struct "TerminationPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class TerminationPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TerminationPoint_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String owner = "";
	public org.omg.zx.terminationPoint.TPType_T type;
	public org.omg.zx.terminationPoint.TPConnectionState_T connectionState;
	public org.omg.zx.terminationPoint.TerminationMode_T tpMappingMode;
	public org.omg.zx.terminationPoint.Directionality_T direction;
	public org.omg.zx.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.zx.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] includeTPList;
	public org.omg.zx.notifications.NameAndAnyValue_T[] additionalInfo;
	public TerminationPoint_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String owner, org.omg.zx.terminationPoint.TPType_T type, org.omg.zx.terminationPoint.TPConnectionState_T connectionState, org.omg.zx.terminationPoint.TerminationMode_T tpMappingMode, org.omg.zx.terminationPoint.Directionality_T direction, org.omg.zx.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.zx.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, org.omg.zx.globaldefs.NameAndStringValue_T[][] includeTPList, org.omg.zx.notifications.NameAndAnyValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.owner = owner;
		this.type = type;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.includeTPList = includeTPList;
		this.additionalInfo = additionalInfo;
	}
}
