package org.omg.hw.performance;

/**
 *	Generated from IDL definition of alias "PerformanceMonitoringInstanceList_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceMonitoringInstanceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PerformanceMonitoringInstance_T[] value;

	public PerformanceMonitoringInstanceList_THolder ()
	{
	}
	public PerformanceMonitoringInstanceList_THolder (final org.omg.hw.performance.PerformanceMonitoringInstance_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerformanceMonitoringInstanceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceMonitoringInstanceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerformanceMonitoringInstanceList_THelper.write (out,value);
	}
}
