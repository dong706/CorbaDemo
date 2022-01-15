package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "AlarmData_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.AlarmData_T value;

	public AlarmData_THolder ()
	{
	}
	public AlarmData_THolder(final org.omg.zx.alarmMgr.AlarmData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.alarmMgr.AlarmData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.alarmMgr.AlarmData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.alarmMgr.AlarmData_THelper.write(_out, value);
	}
}
