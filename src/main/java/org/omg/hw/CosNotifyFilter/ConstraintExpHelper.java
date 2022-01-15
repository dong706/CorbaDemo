package org.omg.hw.CosNotifyFilter;


/**
 *	Generated from IDL definition of struct "ConstraintExp"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintExpHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.CosNotifyFilter.ConstraintExpHelper.id(),"ConstraintExp",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("event_types", org.omg.hw.CosNotification.EventTypeSeqHelper.type(), null),new org.omg.CORBA.StructMember("constraint_expr", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyFilter.ConstraintExp s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyFilter.ConstraintExp extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/ConstraintExp:1.0";
	}
	public static org.omg.hw.CosNotifyFilter.ConstraintExp read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyFilter.ConstraintExp result = new org.omg.hw.CosNotifyFilter.ConstraintExp();
		result.event_types = org.omg.hw.CosNotification.EventTypeSeqHelper.read(in);
		result.constraint_expr=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyFilter.ConstraintExp s)
	{
		org.omg.hw.CosNotification.EventTypeSeqHelper.write(out,s.event_types);
		out.write_string(s.constraint_expr);
	}
}
