package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "EventHeader"
 *	@author JacORB IDL compiler 
 */

public final class EventHeaderHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.EventHeader value;

	public EventHeaderHolder ()
	{
	}
	public EventHeaderHolder(final org.omg.zx.CosNotification.EventHeader initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.CosNotification.EventHeaderHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.CosNotification.EventHeaderHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.CosNotification.EventHeaderHelper.write(_out, value);
	}
}
