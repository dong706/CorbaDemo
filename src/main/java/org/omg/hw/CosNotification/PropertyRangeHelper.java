package org.omg.hw.CosNotification;


/**
 *	Generated from IDL definition of struct "PropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class PropertyRangeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.CosNotification.PropertyRangeHelper.id(),"PropertyRange",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("low_val", org.omg.hw.CosNotification.PropertyValueHelper.type(), null),new org.omg.CORBA.StructMember("high_val", org.omg.hw.CosNotification.PropertyValueHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotification.PropertyRange s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotification.PropertyRange extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/PropertyRange:1.0";
	}
	public static org.omg.hw.CosNotification.PropertyRange read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotification.PropertyRange result = new org.omg.hw.CosNotification.PropertyRange();
		result.low_val=in.read_any();
		result.high_val=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotification.PropertyRange s)
	{
		out.write_any(s.low_val);
		out.write_any(s.high_val);
	}
}
