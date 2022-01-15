package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "Property"
 *	@author JacORB IDL compiler 
 */

public final class PropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.Property value;

	public PropertyHolder ()
	{
	}
	public PropertyHolder(final org.omg.zx.CosNotification.Property initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.CosNotification.PropertyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.CosNotification.PropertyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.CosNotification.PropertyHelper.write(_out, value);
	}
}
