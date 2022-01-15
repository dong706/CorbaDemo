package org.omg.hw.CosNotifyComm;


/**
 *	Generated from IDL interface "PushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class PushSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyComm.PushSupplier s)
	{
			any.insert_Object(s);
	}
	public static org.omg.hw.CosNotifyComm.PushSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/PushSupplier:1.0", "PushSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/PushSupplier:1.0";
	}
	public static PushSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.hw.CosNotifyComm.PushSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.hw.CosNotifyComm.PushSupplier narrow(final java.lang.Object obj)
	{
		if (obj instanceof org.omg.hw.CosNotifyComm.PushSupplier)
		{
			return (org.omg.hw.CosNotifyComm.PushSupplier)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static org.omg.hw.CosNotifyComm.PushSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.hw.CosNotifyComm.PushSupplier)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyComm/PushSupplier:1.0"))
			{
				org.omg.hw.CosNotifyComm._PushSupplierStub stub;
				stub = new org.omg.hw.CosNotifyComm._PushSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static org.omg.hw.CosNotifyComm.PushSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.hw.CosNotifyComm.PushSupplier)obj;
		}
		catch (ClassCastException c)
		{
				org.omg.hw.CosNotifyComm._PushSupplierStub stub;
				stub = new org.omg.hw.CosNotifyComm._PushSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
