package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ClientType"
 *	@author JacORB IDL compiler 
 */

public final class ClientTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.hw.CosNotifyChannelAdmin.ClientTypeHelper.id(),"ClientType",new String[]{"ANY_EVENT","STRUCTURED_EVENT","SEQUENCE_EVENT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyChannelAdmin.ClientType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyChannelAdmin.ClientType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/ClientType:1.0";
	}
	public static ClientType read (final org.omg.CORBA.portable.InputStream in)
	{
		return ClientType.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ClientType s)
	{
		out.write_long(s.value());
	}
}
