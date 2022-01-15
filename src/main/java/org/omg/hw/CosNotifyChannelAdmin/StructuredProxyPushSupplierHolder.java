package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "StructuredProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class StructuredProxyPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPushSupplier value;
	public StructuredProxyPushSupplierHolder()
	{
	}
	public StructuredProxyPushSupplierHolder (final StructuredProxyPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredProxyPushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPushSupplierHelper.write (_out,value);
	}
}
