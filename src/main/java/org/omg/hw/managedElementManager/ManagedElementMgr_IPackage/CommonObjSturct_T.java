package org.omg.hw.managedElementManager.ManagedElementMgr_IPackage;

/**
 *	Generated from IDL definition of struct "CommonObjSturct_T"
 *	@author JacORB IDL compiler 
 */

public final class CommonObjSturct_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CommonObjSturct_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] attributes;
	public CommonObjSturct_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, org.omg.hw.globaldefs.NameAndStringValue_T[] attributes)
	{
		this.name = name;
		this.attributes = attributes;
	}
}
