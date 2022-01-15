package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ProxyType"
 *	@author JacORB IDL compiler 
 */

public final class ProxyTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.hw.CosNotifyChannelAdmin.ProxyTypeHelper.id(),"ProxyType",new String[]{"PUSH_ANY","PULL_ANY","PUSH_STRUCTURED","PULL_STRUCTURED","PUSH_SEQUENCE","PULL_SEQUENCE","PUSH_TYPED","PULL_TYPED"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyChannelAdmin.ProxyType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyChannelAdmin.ProxyType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/ProxyType:1.0";
	}
	public static ProxyType read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProxyType.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProxyType s)
	{
		out.write_long(s.value());
	}
}
