package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of alias "ClockSourceStatusList_T"
 *	@author JacORB IDL compiler 
 */

public final class ClockSourceStatusList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.emsMgr.ClockSourceStatus_T[] value;

	public ClockSourceStatusList_THolder ()
	{
	}
	public ClockSourceStatusList_THolder (final org.omg.hw.emsMgr.ClockSourceStatus_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ClockSourceStatusList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClockSourceStatusList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ClockSourceStatusList_THelper.write (out,value);
	}
}
