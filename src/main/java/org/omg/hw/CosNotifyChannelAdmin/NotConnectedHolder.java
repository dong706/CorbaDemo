package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "NotConnected"
 *	@author JacORB IDL compiler 
 */

public final class NotConnectedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyChannelAdmin.NotConnected value;

	public NotConnectedHolder ()
	{
	}
	public NotConnectedHolder(final org.omg.hw.CosNotifyChannelAdmin.NotConnected initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyChannelAdmin.NotConnectedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyChannelAdmin.NotConnectedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyChannelAdmin.NotConnectedHelper.write(_out, value);
	}
}
