package org.omg.hw.CosNotifyFilter;


/**
 *	Generated from IDL definition of struct "MappingConstraintPair"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintPairHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.CosNotifyFilter.MappingConstraintPairHelper.id(),"MappingConstraintPair",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("constraint_expression", org.omg.hw.CosNotifyFilter.ConstraintExpHelper.type(), null),new org.omg.CORBA.StructMember("result_to_set", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyFilter.MappingConstraintPair s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyFilter.MappingConstraintPair extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/MappingConstraintPair:1.0";
	}
	public static org.omg.hw.CosNotifyFilter.MappingConstraintPair read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyFilter.MappingConstraintPair result = new org.omg.hw.CosNotifyFilter.MappingConstraintPair();
		result.constraint_expression=org.omg.hw.CosNotifyFilter.ConstraintExpHelper.read(in);
		result.result_to_set=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyFilter.MappingConstraintPair s)
	{
		org.omg.hw.CosNotifyFilter.ConstraintExpHelper.write(out,s.constraint_expression);
		out.write_any(s.result_to_set);
	}
}
