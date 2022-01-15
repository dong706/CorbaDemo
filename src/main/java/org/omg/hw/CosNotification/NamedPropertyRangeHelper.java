package org.omg.hw.CosNotification;


/**
 *	Generated from IDL definition of struct "NamedPropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class NamedPropertyRangeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.CosNotification.NamedPropertyRangeHelper.id(),"NamedPropertyRange",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.CosNotification.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("range", org.omg.hw.CosNotification.PropertyRangeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotification.NamedPropertyRange s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotification.NamedPropertyRange extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/NamedPropertyRange:1.0";
	}
	public static org.omg.hw.CosNotification.NamedPropertyRange read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotification.NamedPropertyRange result = new org.omg.hw.CosNotification.NamedPropertyRange();
		result.name=in.read_string();
		result.range=org.omg.hw.CosNotification.PropertyRangeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotification.NamedPropertyRange s)
	{
		out.write_string(s.name);
		org.omg.hw.CosNotification.PropertyRangeHelper.write(out,s.range);
	}
}
