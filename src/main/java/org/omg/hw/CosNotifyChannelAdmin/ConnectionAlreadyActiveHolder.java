package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "ConnectionAlreadyActive"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionAlreadyActiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive value;

	public ConnectionAlreadyActiveHolder ()
	{
	}
	public ConnectionAlreadyActiveHolder(final org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.write(_out, value);
	}
}
