package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_MSTPBindingPath_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPBindingPath_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MSTPBindingPath_T(){}
	public org.omg.hw.terminationPoint.Directionality_T direction;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] allPathList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] usedPathList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MSTPBindingPath_T(org.omg.hw.terminationPoint.Directionality_T direction, org.omg.hw.globaldefs.NameAndStringValue_T[][] allPathList, org.omg.hw.globaldefs.NameAndStringValue_T[][] usedPathList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.direction = direction;
		this.allPathList = allPathList;
		this.usedPathList = usedPathList;
		this.additionalInfo = additionalInfo;
	}
}
