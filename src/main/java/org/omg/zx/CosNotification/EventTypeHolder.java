package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "EventType"
 *	@author JacORB IDL compiler 
 */

public final class EventTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.EventType value;

	public EventTypeHolder ()
	{
	}
	public EventTypeHolder(final org.omg.zx.CosNotification.EventType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.CosNotification.EventTypeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.CosNotification.EventTypeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.CosNotification.EventTypeHelper.write(_out, value);
	}
}
