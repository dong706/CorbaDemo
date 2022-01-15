package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "StaticRouting_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticRouting_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.StaticRouting_T value;

	public StaticRouting_THolder ()
	{
	}
	public StaticRouting_THolder(final org.omg.hw.ipMgr.StaticRouting_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.ipMgr.StaticRouting_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.ipMgr.StaticRouting_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.ipMgr.StaticRouting_THelper.write(_out, value);
	}
}
