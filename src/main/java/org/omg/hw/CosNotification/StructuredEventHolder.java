package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "StructuredEvent"
 *	@author JacORB IDL compiler 
 */

public final class StructuredEventHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.StructuredEvent value;

	public StructuredEventHolder ()
	{
	}
	public StructuredEventHolder(final org.omg.hw.CosNotification.StructuredEvent initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotification.StructuredEventHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotification.StructuredEventHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotification.StructuredEventHelper.write(_out, value);
	}
}
