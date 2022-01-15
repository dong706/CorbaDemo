package org.omg.hw.performance;

/**
 *	Generated from IDL definition of alias "PerformanceCreateResourceList_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceCreateResourceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PerformanceCreateResource_T[] value;

	public PerformanceCreateResourceList_THolder ()
	{
	}
	public PerformanceCreateResourceList_THolder (final org.omg.hw.performance.PerformanceCreateResource_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerformanceCreateResourceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceCreateResourceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerformanceCreateResourceList_THelper.write (out,value);
	}
}
