package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PerformanceTemplate_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceTemplate_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PerformanceTemplate_T value;

	public PerformanceTemplate_THolder ()
	{
	}
	public PerformanceTemplate_THolder(final org.omg.hw.performance.PerformanceTemplate_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.performance.PerformanceTemplate_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.performance.PerformanceTemplate_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.performance.PerformanceTemplate_THelper.write(_out, value);
	}
}
