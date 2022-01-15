package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "PropertyError"
 *	@author JacORB IDL compiler 
 */

public final class PropertyErrorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.PropertyError value;

	public PropertyErrorHolder ()
	{
	}
	public PropertyErrorHolder(final org.omg.hw.CosNotification.PropertyError initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotification.PropertyErrorHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotification.PropertyErrorHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotification.PropertyErrorHelper.write(_out, value);
	}
}
