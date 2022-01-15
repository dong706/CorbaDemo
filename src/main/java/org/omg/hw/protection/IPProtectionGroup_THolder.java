package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "IPProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class IPProtectionGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.IPProtectionGroup_T value;

	public IPProtectionGroup_THolder ()
	{
	}
	public IPProtectionGroup_THolder(final org.omg.hw.protection.IPProtectionGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.protection.IPProtectionGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.protection.IPProtectionGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.protection.IPProtectionGroup_THelper.write(_out, value);
	}
}
