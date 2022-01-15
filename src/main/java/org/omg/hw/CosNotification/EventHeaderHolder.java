package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "EventHeader"
 *	@author JacORB IDL compiler 
 */

public final class EventHeaderHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.EventHeader value;

	public EventHeaderHolder ()
	{
	}
	public EventHeaderHolder(final org.omg.hw.CosNotification.EventHeader initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotification.EventHeaderHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotification.EventHeaderHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotification.EventHeaderHelper.write(_out, value);
	}
}
