package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "SharedResource_T"
 *	@author JacORB IDL compiler 
 */

public final class SharedResource_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SharedResource_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] connectionNameList;
	public SharedResource_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, org.omg.zx.globaldefs.NameAndStringValue_T[][] connectionNameList)
	{
		this.name = name;
		this.connectionNameList = connectionNameList;
	}
}
