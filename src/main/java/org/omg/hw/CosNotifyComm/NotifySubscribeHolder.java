package org.omg.hw.CosNotifyComm;

/**
 *	Generated from IDL interface "NotifySubscribe"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class NotifySubscribeHolder	implements org.omg.CORBA.portable.Streamable{
	 public NotifySubscribe value;
	public NotifySubscribeHolder()
	{
	}
	public NotifySubscribeHolder (final NotifySubscribe initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NotifySubscribeHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NotifySubscribeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NotifySubscribeHelper.write (_out,value);
	}
}
