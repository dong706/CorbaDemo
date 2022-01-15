package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "PropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class PropertyRangeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.PropertyRange value;

	public PropertyRangeHolder ()
	{
	}
	public PropertyRangeHolder(final org.omg.hw.CosNotification.PropertyRange initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotification.PropertyRangeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotification.PropertyRangeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotification.PropertyRangeHelper.write(_out, value);
	}
}
