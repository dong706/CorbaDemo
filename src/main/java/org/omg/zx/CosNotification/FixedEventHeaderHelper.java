package org.omg.zx.CosNotification;


/**
 *	Generated from IDL definition of struct "FixedEventHeader"
 *	@author JacORB IDL compiler 
 */

public final class FixedEventHeaderHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.CosNotification.FixedEventHeaderHelper.id(),"FixedEventHeader",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("event_type", org.omg.zx.CosNotification.EventTypeHelper.type(), null),new org.omg.CORBA.StructMember("event_name", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.CosNotification.FixedEventHeader s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.CosNotification.FixedEventHeader extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/FixedEventHeader:1.0";
	}
	public static org.omg.zx.CosNotification.FixedEventHeader read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.CosNotification.FixedEventHeader result = new org.omg.zx.CosNotification.FixedEventHeader();
		result.event_type=org.omg.zx.CosNotification.EventTypeHelper.read(in);
		result.event_name=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.CosNotification.FixedEventHeader s)
	{
		org.omg.zx.CosNotification.EventTypeHelper.write(out,s.event_type);
		out.write_string(s.event_name);
	}
}
