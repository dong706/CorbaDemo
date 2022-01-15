package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of alias "EventTypeSeq"
 *	@author JacORB IDL compiler 
 */

public final class EventTypeSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.EventType[] value;

	public EventTypeSeqHolder ()
	{
	}
	public EventTypeSeqHolder (final org.omg.zx.CosNotification.EventType[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EventTypeSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventTypeSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EventTypeSeqHelper.write (out,value);
	}
}
