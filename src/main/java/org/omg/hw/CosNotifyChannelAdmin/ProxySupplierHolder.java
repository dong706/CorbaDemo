package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "ProxySupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class ProxySupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxySupplier value;
	public ProxySupplierHolder()
	{
	}
	public ProxySupplierHolder (final ProxySupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxySupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxySupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxySupplierHelper.write (_out,value);
	}
}
