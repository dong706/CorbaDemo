package org.omg.hw.HW_controlPlane;

/**
 *	Generated from IDL definition of struct "HW_SnppLink_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SnppLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_SnppLink_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] aEndSnppName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] zEndSnppName;
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public short[] rateList;
	public short cost;
	public java.lang.String protectType;
	public org.omg.hw.HW_controlPlane.HW_Capacity_T[] linkCapacity;
	public java.lang.String linkState;
	public int[] srlgIDList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_SnppLink_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.NameAndStringValue_T[] aEndSnppName, org.omg.hw.globaldefs.NameAndStringValue_T[] zEndSnppName, org.omg.hw.globaldefs.ConnectionDirection_T direction, short[] rateList, short cost, java.lang.String protectType, org.omg.hw.HW_controlPlane.HW_Capacity_T[] linkCapacity, java.lang.String linkState, int[] srlgIDList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.aEndSnppName = aEndSnppName;
		this.zEndSnppName = zEndSnppName;
		this.direction = direction;
		this.rateList = rateList;
		this.cost = cost;
		this.protectType = protectType;
		this.linkCapacity = linkCapacity;
		this.linkState = linkState;
		this.srlgIDList = srlgIDList;
		this.additionalInfo = additionalInfo;
	}
}
