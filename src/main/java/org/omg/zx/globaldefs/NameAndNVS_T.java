package org.omg.zx.globaldefs;

/**
 *	Generated from IDL definition of struct "NameAndNVS_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndNVS_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public NameAndNVS_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public NameAndNVS_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.additionalInfo = additionalInfo;
	}
}
