package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_RPRTopoInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRTopoInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_RPRTopoInfo_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] topoParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRTopoInfo_T(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.globaldefs.NameAndStringValue_T[] topoParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.nodeName = nodeName;
		this.topoParameters = topoParameters;
		this.additionalInfo = additionalInfo;
	}
}
