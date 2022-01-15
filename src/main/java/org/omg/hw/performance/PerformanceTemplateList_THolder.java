package org.omg.hw.performance;

/**
 *	Generated from IDL definition of alias "PerformanceTemplateList_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceTemplateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PerformanceTemplate_T[] value;

	public PerformanceTemplateList_THolder ()
	{
	}
	public PerformanceTemplateList_THolder (final org.omg.hw.performance.PerformanceTemplate_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerformanceTemplateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceTemplateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerformanceTemplateList_THelper.write (out,value);
	}
}
