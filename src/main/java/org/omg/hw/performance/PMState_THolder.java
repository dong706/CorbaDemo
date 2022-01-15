package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PMState_T"
 *	@author JacORB IDL compiler 
 */

public final class PMState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PMState_T value;

	public PMState_THolder ()
	{
	}
	public PMState_THolder(final org.omg.hw.performance.PMState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.performance.PMState_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.performance.PMState_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.performance.PMState_THelper.write(_out, value);
	}
}
