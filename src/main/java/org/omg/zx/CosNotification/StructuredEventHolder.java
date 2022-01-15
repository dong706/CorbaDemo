package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "StructuredEvent"
 *	@author JacORB IDL compiler 
 */

public final class StructuredEventHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.StructuredEvent value;

	public StructuredEventHolder ()
	{
	}
	public StructuredEventHolder(final org.omg.zx.CosNotification.StructuredEvent initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.CosNotification.StructuredEventHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.CosNotification.StructuredEventHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.CosNotification.StructuredEventHelper.write(_out, value);
	}
}
