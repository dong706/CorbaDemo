package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "TCAData_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.TCAData_T value;

	public TCAData_THolder ()
	{
	}
	public TCAData_THolder(final org.omg.zx.alarmMgr.TCAData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.alarmMgr.TCAData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.alarmMgr.TCAData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.alarmMgr.TCAData_THelper.write(_out, value);
	}
}
