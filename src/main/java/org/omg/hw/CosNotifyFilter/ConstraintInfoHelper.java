package org.omg.hw.CosNotifyFilter;


/**
 *	Generated from IDL definition of struct "ConstraintInfo"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintInfoHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.CosNotifyFilter.ConstraintInfoHelper.id(),"ConstraintInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("constraint_expression", org.omg.hw.CosNotifyFilter.ConstraintExpHelper.type(), null),new org.omg.CORBA.StructMember("constraint_id", org.omg.hw.CosNotifyFilter.ConstraintIDHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyFilter.ConstraintInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyFilter.ConstraintInfo extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/ConstraintInfo:1.0";
	}
	public static org.omg.hw.CosNotifyFilter.ConstraintInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyFilter.ConstraintInfo result = new org.omg.hw.CosNotifyFilter.ConstraintInfo();
		result.constraint_expression=org.omg.hw.CosNotifyFilter.ConstraintExpHelper.read(in);
		result.constraint_id=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyFilter.ConstraintInfo s)
	{
		org.omg.hw.CosNotifyFilter.ConstraintExpHelper.write(out,s.constraint_expression);
		out.write_long(s.constraint_id);
	}
}
