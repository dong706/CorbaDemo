package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "NamedPropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class NamedPropertyRangeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.NamedPropertyRange value;

	public NamedPropertyRangeHolder ()
	{
	}
	public NamedPropertyRangeHolder(final org.omg.zx.CosNotification.NamedPropertyRange initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.CosNotification.NamedPropertyRangeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.CosNotification.NamedPropertyRangeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.CosNotification.NamedPropertyRangeHelper.write(_out, value);
	}
}
