package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "WDMProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMProtectionGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.WDMProtectionGroup_T value;

	public WDMProtectionGroup_THolder ()
	{
	}
	public WDMProtectionGroup_THolder(final org.omg.hw.protection.WDMProtectionGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.protection.WDMProtectionGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.protection.WDMProtectionGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.protection.WDMProtectionGroup_THelper.write(_out, value);
	}
}
