package org.omg.zx.CosNotification;


/**
 *	Generated from IDL definition of struct "Property"
 *	@author JacORB IDL compiler 
 */

public final class PropertyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.CosNotification.PropertyHelper.id(),"Property",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.CosNotification.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.zx.CosNotification.PropertyValueHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.CosNotification.Property s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.CosNotification.Property extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/Property:1.0";
	}
	public static org.omg.zx.CosNotification.Property read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.CosNotification.Property result = new org.omg.zx.CosNotification.Property();
		result.name=in.read_string();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.CosNotification.Property s)
	{
		out.write_string(s.name);
		out.write_any(s.value);
	}
}
