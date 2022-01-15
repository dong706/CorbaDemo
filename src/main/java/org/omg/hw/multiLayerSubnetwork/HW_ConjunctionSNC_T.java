package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "HW_ConjunctionSNC_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ConjunctionSNC_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_ConjunctionSNC_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] sncName1;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] sncName2;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ConjunctionSNC_T(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName1, org.omg.hw.globaldefs.NameAndStringValue_T[] sncName2, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.sncName1 = sncName1;
		this.sncName2 = sncName2;
		this.additionalInfo = additionalInfo;
	}
}
