package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMTask_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTask_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMTask_T value;

	public PMTask_THolder ()
	{
	}
	public PMTask_THolder(final org.omg.zx.performance.PMTask_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.performance.PMTask_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.performance.PMTask_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.performance.PMTask_THelper.write(_out, value);
	}
}
