package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class SequenceProxyPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPushConsumer value;
	public SequenceProxyPushConsumerHolder()
	{
	}
	public SequenceProxyPushConsumerHolder (final SequenceProxyPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPushConsumerHelper.write (_out,value);
	}
}
