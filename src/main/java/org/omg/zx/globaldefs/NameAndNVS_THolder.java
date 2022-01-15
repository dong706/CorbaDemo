package org.omg.zx.globaldefs;

/**
 *	Generated from IDL definition of struct "NameAndNVS_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndNVS_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.globaldefs.NameAndNVS_T value;

	public NameAndNVS_THolder ()
	{
	}
	public NameAndNVS_THolder(final org.omg.zx.globaldefs.NameAndNVS_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.globaldefs.NameAndNVS_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.globaldefs.NameAndNVS_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.globaldefs.NameAndNVS_THelper.write(_out, value);
	}
}
