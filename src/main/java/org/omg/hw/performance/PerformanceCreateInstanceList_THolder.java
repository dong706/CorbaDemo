package org.omg.hw.performance;

/**
 *	Generated from IDL definition of alias "PerformanceCreateInstanceList_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceCreateInstanceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PerformanceCreateInstance_T[] value;

	public PerformanceCreateInstanceList_THolder ()
	{
	}
	public PerformanceCreateInstanceList_THolder (final org.omg.hw.performance.PerformanceCreateInstance_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerformanceCreateInstanceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceCreateInstanceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerformanceCreateInstanceList_THelper.write (out,value);
	}
}
