package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "PGPModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class PGPModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.PGPModifyData_T value;

	public PGPModifyData_THolder ()
	{
	}
	public PGPModifyData_THolder(final org.omg.hw.protection.PGPModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.protection.PGPModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.protection.PGPModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.protection.PGPModifyData_THelper.write(_out, value);
	}
}
