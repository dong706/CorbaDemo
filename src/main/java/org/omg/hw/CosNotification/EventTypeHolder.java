package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "EventType"
 *	@author JacORB IDL compiler 
 */

public final class EventTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.EventType value;

	public EventTypeHolder ()
	{
	}
	public EventTypeHolder(final org.omg.hw.CosNotification.EventType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotification.EventTypeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotification.EventTypeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotification.EventTypeHelper.write(_out, value);
	}
}
