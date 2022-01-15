package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "ESwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.ESwitchData_T value;

	public ESwitchData_THolder ()
	{
	}
	public ESwitchData_THolder(final org.omg.hw.protection.ESwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.protection.ESwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.protection.ESwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.protection.ESwitchData_THelper.write(_out, value);
	}
}
