package org.omg.hw.CosNotifyChannelAdmin;


/**
 *	Generated from IDL definition of struct "AdminLimit"
 *	@author JacORB IDL compiler 
 */

public final class AdminLimitHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.CosNotifyChannelAdmin.AdminLimitHelper.id(),"AdminLimit",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.CosNotification.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.hw.CosNotification.PropertyValueHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyChannelAdmin.AdminLimit s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyChannelAdmin.AdminLimit extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/AdminLimit:1.0";
	}
	public static org.omg.hw.CosNotifyChannelAdmin.AdminLimit read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyChannelAdmin.AdminLimit result = new org.omg.hw.CosNotifyChannelAdmin.AdminLimit();
		result.name=in.read_string();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyChannelAdmin.AdminLimit s)
	{
		out.write_string(s.name);
		out.write_any(s.value);
	}
}
