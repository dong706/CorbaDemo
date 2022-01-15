package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidValue"
 *	@author JacORB IDL compiler 
 */

public final class InvalidValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.InvalidValue value;

	public InvalidValueHolder ()
	{
	}
	public InvalidValueHolder(final org.omg.hw.CosNotifyFilter.InvalidValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.InvalidValueHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.InvalidValueHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.InvalidValueHelper.write(_out, value);
	}
}
