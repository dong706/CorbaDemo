package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class SequenceProxyPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPushSupplier value;
	public SequenceProxyPushSupplierHolder()
	{
	}
	public SequenceProxyPushSupplierHolder (final SequenceProxyPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPushSupplierHelper.write (_out,value);
	}
}
