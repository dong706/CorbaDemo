package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "FixedEventHeader"
 *	@author JacORB IDL compiler 
 */

public final class FixedEventHeaderHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.FixedEventHeader value;

	public FixedEventHeaderHolder ()
	{
	}
	public FixedEventHeaderHolder(final org.omg.zx.CosNotification.FixedEventHeader initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.CosNotification.FixedEventHeaderHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.CosNotification.FixedEventHeaderHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.CosNotification.FixedEventHeaderHelper.write(_out, value);
	}
}
