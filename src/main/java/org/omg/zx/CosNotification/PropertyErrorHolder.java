package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "PropertyError"
 *	@author JacORB IDL compiler 
 */

public final class PropertyErrorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.PropertyError value;

	public PropertyErrorHolder ()
	{
	}
	public PropertyErrorHolder(final org.omg.zx.CosNotification.PropertyError initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.CosNotification.PropertyErrorHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.CosNotification.PropertyErrorHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.CosNotification.PropertyErrorHelper.write(_out, value);
	}
}
