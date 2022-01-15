package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "CallbackNotFound"
 *	@author JacORB IDL compiler 
 */

public final class CallbackNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.CallbackNotFound value;

	public CallbackNotFoundHolder ()
	{
	}
	public CallbackNotFoundHolder(final org.omg.hw.CosNotifyFilter.CallbackNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.CallbackNotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.CallbackNotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.CallbackNotFoundHelper.write(_out, value);
	}
}
