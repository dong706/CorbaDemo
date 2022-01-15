package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "Property"
 *	@author JacORB IDL compiler 
 */

public final class PropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.Property value;

	public PropertyHolder ()
	{
	}
	public PropertyHolder(final org.omg.hw.CosNotification.Property initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotification.PropertyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotification.PropertyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotification.PropertyHelper.write(_out, value);
	}
}
