package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_LinkAggregationGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_LinkAggregationGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_LinkAggregationGroup_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] paraList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] mainPortName;
	public org.omg.hw.HW_mstpInventory.HW_LAGBranchPort_T[] branchPortList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_LinkAggregationGroup_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[] mainPortName, org.omg.hw.HW_mstpInventory.HW_LAGBranchPort_T[] branchPortList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.paraList = paraList;
		this.mainPortName = mainPortName;
		this.branchPortList = branchPortList;
		this.additionalInfo = additionalInfo;
	}
}
