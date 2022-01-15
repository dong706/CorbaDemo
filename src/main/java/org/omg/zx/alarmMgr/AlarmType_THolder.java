package org.omg.zx.alarmMgr;
/**
 *	Generated from IDL definition of enum "AlarmType_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public AlarmType_T value;

	public AlarmType_THolder ()
	{
	}
	public AlarmType_THolder (final AlarmType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmType_THelper.write (out,value);
	}
}
