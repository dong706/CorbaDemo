package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "NamedPropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class NamedPropertyRangeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.NamedPropertyRange value;

	public NamedPropertyRangeHolder ()
	{
	}
	public NamedPropertyRangeHolder(final org.omg.hw.CosNotification.NamedPropertyRange initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotification.NamedPropertyRangeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotification.NamedPropertyRangeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotification.NamedPropertyRangeHelper.write(_out, value);
	}
}
