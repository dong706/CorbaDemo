package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "HW_ERPSProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ERPSProtectionGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.HW_ERPSProtectionGroup_T value;

	public HW_ERPSProtectionGroup_THolder ()
	{
	}
	public HW_ERPSProtectionGroup_THolder(final org.omg.hw.protection.HW_ERPSProtectionGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.protection.HW_ERPSProtectionGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.protection.HW_ERPSProtectionGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.protection.HW_ERPSProtectionGroup_THelper.write(_out, value);
	}
}
