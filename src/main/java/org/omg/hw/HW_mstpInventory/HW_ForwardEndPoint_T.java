package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_ForwardEndPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ForwardEndPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_ForwardEndPoint_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] logicTPName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] paraList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ForwardEndPoint_T(org.omg.hw.globaldefs.NameAndStringValue_T[] logicTPName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.logicTPName = logicTPName;
		this.paraList = paraList;
		this.additionalInfo = additionalInfo;
	}
}
