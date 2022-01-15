package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "ProxyNotFound"
 *	@author JacORB IDL compiler 
 */

public final class ProxyNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyChannelAdmin.ProxyNotFound value;

	public ProxyNotFoundHolder ()
	{
	}
	public ProxyNotFoundHolder(final org.omg.hw.CosNotifyChannelAdmin.ProxyNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyChannelAdmin.ProxyNotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyChannelAdmin.ProxyNotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyChannelAdmin.ProxyNotFoundHelper.write(_out, value);
	}
}
