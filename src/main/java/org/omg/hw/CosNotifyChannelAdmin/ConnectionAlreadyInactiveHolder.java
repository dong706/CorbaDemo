package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "ConnectionAlreadyInactive"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionAlreadyInactiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactive value;

	public ConnectionAlreadyInactiveHolder ()
	{
	}
	public ConnectionAlreadyInactiveHolder(final org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.write(_out, value);
	}
}
