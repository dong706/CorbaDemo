package org.omg.hw.CosNotifyFilter;


/**
 *	Generated from IDL definition of exception "InvalidValue"
 *	@author JacORB IDL compiler 
 */

public final class InvalidValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.hw.CosNotifyFilter.InvalidValueHelper.id(),"InvalidValue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("constr", org.omg.hw.CosNotifyFilter.ConstraintExpHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyFilter.InvalidValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyFilter.InvalidValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/InvalidValue:1.0";
	}
	public static org.omg.hw.CosNotifyFilter.InvalidValue read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyFilter.InvalidValue result = new org.omg.hw.CosNotifyFilter.InvalidValue();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.constr=org.omg.hw.CosNotifyFilter.ConstraintExpHelper.read(in);
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyFilter.InvalidValue s)
	{
		out.write_string(id());
		org.omg.hw.CosNotifyFilter.ConstraintExpHelper.write(out,s.constr);
		out.write_any(s.value);
	}
}
