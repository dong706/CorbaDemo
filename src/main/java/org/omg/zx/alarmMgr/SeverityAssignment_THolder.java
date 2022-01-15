package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "SeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class SeverityAssignment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.SeverityAssignment_T value;

	public SeverityAssignment_THolder ()
	{
	}
	public SeverityAssignment_THolder(final org.omg.zx.alarmMgr.SeverityAssignment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.alarmMgr.SeverityAssignment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.alarmMgr.SeverityAssignment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.alarmMgr.SeverityAssignment_THelper.write(_out, value);
	}
}
