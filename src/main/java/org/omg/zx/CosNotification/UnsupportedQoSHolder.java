package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of exception "UnsupportedQoS"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedQoSHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.CosNotification.UnsupportedQoS value;

	public UnsupportedQoSHolder ()
	{
	}
	public UnsupportedQoSHolder(final org.omg.zx.CosNotification.UnsupportedQoS initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.CosNotification.UnsupportedQoSHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.CosNotification.UnsupportedQoSHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.CosNotification.UnsupportedQoSHelper.write(_out, value);
	}
}
