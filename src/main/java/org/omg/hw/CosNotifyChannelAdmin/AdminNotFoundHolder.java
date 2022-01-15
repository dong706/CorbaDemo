package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "AdminNotFound"
 *	@author JacORB IDL compiler 
 */

public final class AdminNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyChannelAdmin.AdminNotFound value;

	public AdminNotFoundHolder ()
	{
	}
	public AdminNotFoundHolder(final org.omg.hw.CosNotifyChannelAdmin.AdminNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyChannelAdmin.AdminNotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyChannelAdmin.AdminNotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyChannelAdmin.AdminNotFoundHelper.write(_out, value);
	}
}
