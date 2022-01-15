package org.omg.hw.CosNotifyChannelAdmin;


/**
 *	Generated from IDL definition of exception "ConnectionAlreadyActive"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionAlreadyActiveHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.id(),"ConnectionAlreadyActive",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/ConnectionAlreadyActive:1.0";
	}
	public static org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive result = new org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive s)
	{
		out.write_string(id());
	}
}
