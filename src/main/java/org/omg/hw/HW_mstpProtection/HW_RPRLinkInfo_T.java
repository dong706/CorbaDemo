package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_RPRLinkInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRLinkInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_RPRLinkInfo_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public short nodeNo;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] rprLinkParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRLinkInfo_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, short nodeNo, org.omg.hw.globaldefs.NameAndStringValue_T[] rprLinkParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nodeNo = nodeNo;
		this.rprLinkParameters = rprLinkParameters;
		this.additionalInfo = additionalInfo;
	}
}
