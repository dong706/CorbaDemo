package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "FilterNotFound"
 *	@author JacORB IDL compiler 
 */

public final class FilterNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.FilterNotFound value;

	public FilterNotFoundHolder ()
	{
	}
	public FilterNotFoundHolder(final org.omg.hw.CosNotifyFilter.FilterNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.write(_out, value);
	}
}
