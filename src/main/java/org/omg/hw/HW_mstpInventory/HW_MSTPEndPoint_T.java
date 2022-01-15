package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_MSTPEndPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPEndPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MSTPEndPoint_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.terminationPoint.Directionality_T direction;
	public org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_T type;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MSTPEndPoint_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.terminationPoint.Directionality_T direction, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_T type, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.type = type;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
