package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of alias "AlarmTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.AlarmType_T[] value;

	public AlarmTypeList_THolder ()
	{
	}
	public AlarmTypeList_THolder (final org.omg.zx.alarmMgr.AlarmType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmTypeList_THelper.write (out,value);
	}
}
