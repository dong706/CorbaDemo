package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of alias "EventBatch"
 *	@author JacORB IDL compiler 
 */

public final class EventBatchHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.StructuredEvent[] value;

	public EventBatchHolder ()
	{
	}
	public EventBatchHolder (final org.omg.zx.CosNotification.StructuredEvent[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EventBatchHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventBatchHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EventBatchHelper.write (out,value);
	}
}
