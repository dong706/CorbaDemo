package org.omg.hw.managedElementManager.ManagedElementMgr_IPackage;

/**
 *	Generated from IDL definition of struct "CommonObjSturct_T"
 *	@author JacORB IDL compiler 
 */

public final class CommonObjSturct_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T value;

	public CommonObjSturct_THolder ()
	{
	}
	public CommonObjSturct_THolder(final org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out, value);
	}
}
