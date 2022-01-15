package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_Flow_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_Flow_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_Flow_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] qosRuleNames;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] paraList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_Flow_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.NameAndStringValue_T[][] qosRuleNames, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.qosRuleNames = qosRuleNames;
		this.paraList = paraList;
		this.additionalInfo = additionalInfo;
	}
}
