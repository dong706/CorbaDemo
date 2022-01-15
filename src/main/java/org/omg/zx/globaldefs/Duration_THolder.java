package org.omg.zx.globaldefs;

/**
 *	Generated from IDL definition of struct "Duration_T"
 *	@author JacORB IDL compiler 
 */

public final class Duration_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.globaldefs.Duration_T value;

	public Duration_THolder ()
	{
	}
	public Duration_THolder(final org.omg.zx.globaldefs.Duration_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.globaldefs.Duration_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.globaldefs.Duration_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.globaldefs.Duration_THelper.write(_out, value);
	}
}
