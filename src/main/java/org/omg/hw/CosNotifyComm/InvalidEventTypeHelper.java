package org.omg.hw.CosNotifyComm;


/**
 *	Generated from IDL definition of exception "InvalidEventType"
 *	@author JacORB IDL compiler 
 */

public final class InvalidEventTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.id(),"InvalidEventType",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.hw.CosNotification.EventTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyComm.InvalidEventType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyComm.InvalidEventType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/InvalidEventType:1.0";
	}
	public static org.omg.hw.CosNotifyComm.InvalidEventType read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyComm.InvalidEventType result = new org.omg.hw.CosNotifyComm.InvalidEventType();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.type=org.omg.hw.CosNotification.EventTypeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyComm.InvalidEventType s)
	{
		out.write_string(id());
		org.omg.hw.CosNotification.EventTypeHelper.write(out,s.type);
	}
}
