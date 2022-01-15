package org.omg.hw.CosNotifyChannelAdmin;


/**
 *	Generated from IDL definition of exception "ChannelNotFound"
 *	@author JacORB IDL compiler 
 */

public final class ChannelNotFoundHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.hw.CosNotifyChannelAdmin.ChannelNotFoundHelper.id(),"ChannelNotFound",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyChannelAdmin.ChannelNotFound s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyChannelAdmin.ChannelNotFound extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/ChannelNotFound:1.0";
	}
	public static org.omg.hw.CosNotifyChannelAdmin.ChannelNotFound read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyChannelAdmin.ChannelNotFound result = new org.omg.hw.CosNotifyChannelAdmin.ChannelNotFound();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyChannelAdmin.ChannelNotFound s)
	{
		out.write_string(id());
	}
}
