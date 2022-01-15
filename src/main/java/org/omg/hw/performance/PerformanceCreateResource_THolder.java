package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PerformanceCreateResource_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceCreateResource_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PerformanceCreateResource_T value;

	public PerformanceCreateResource_THolder ()
	{
	}
	public PerformanceCreateResource_THolder(final org.omg.hw.performance.PerformanceCreateResource_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.performance.PerformanceCreateResource_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.performance.PerformanceCreateResource_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.performance.PerformanceCreateResource_THelper.write(_out, value);
	}
}
