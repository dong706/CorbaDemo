package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "HW_XPICGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_XPICGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.HW_XPICGroup_T value;

	public HW_XPICGroup_THolder ()
	{
	}
	public HW_XPICGroup_THolder(final org.omg.hw.protection.HW_XPICGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.protection.HW_XPICGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.protection.HW_XPICGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.protection.HW_XPICGroup_THelper.write(_out, value);
	}
}
