package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "ObjectAndRate_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAndRate_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.ObjectAndRate_T value;

	public ObjectAndRate_THolder ()
	{
	}
	public ObjectAndRate_THolder(final org.omg.zx.alarmMgr.ObjectAndRate_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.alarmMgr.ObjectAndRate_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.alarmMgr.ObjectAndRate_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.alarmMgr.ObjectAndRate_THelper.write(_out, value);
	}
}
