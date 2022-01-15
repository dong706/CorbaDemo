package org.omg.hw.CosNotifyComm;

/**
 *	Generated from IDL interface "StructuredPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class StructuredPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredPushSupplier value;
	public StructuredPushSupplierHolder()
	{
	}
	public StructuredPushSupplierHolder (final StructuredPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredPushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredPushSupplierHelper.write (_out,value);
	}
}
