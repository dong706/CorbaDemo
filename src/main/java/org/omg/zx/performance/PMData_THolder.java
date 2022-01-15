package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMData_T"
 *	@author JacORB IDL compiler 
 */

public final class PMData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMData_T value;

	public PMData_THolder ()
	{
	}
	public PMData_THolder(final org.omg.zx.performance.PMData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.performance.PMData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.performance.PMData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.performance.PMData_THelper.write(_out, value);
	}
}
