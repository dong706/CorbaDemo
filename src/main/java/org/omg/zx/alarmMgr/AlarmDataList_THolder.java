package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of alias "AlarmDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.AlarmData_T[] value;

	public AlarmDataList_THolder ()
	{
	}
	public AlarmDataList_THolder (final org.omg.zx.alarmMgr.AlarmData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmDataList_THelper.write (out,value);
	}
}
