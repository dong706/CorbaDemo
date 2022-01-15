package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_AtmServiceTP_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceTP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmServiceTP_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] trafficDescriptorName;
	public boolean bPC;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmServiceTP_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, org.omg.hw.globaldefs.NameAndStringValue_T[] trafficDescriptorName, boolean bPC, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.trafficDescriptorName = trafficDescriptorName;
		this.bPC = bPC;
		this.additionalInfo = additionalInfo;
	}
}
