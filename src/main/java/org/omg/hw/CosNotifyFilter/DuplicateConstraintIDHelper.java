package org.omg.hw.CosNotifyFilter;


/**
 *	Generated from IDL definition of exception "DuplicateConstraintID"
 *	@author JacORB IDL compiler 
 */

public final class DuplicateConstraintIDHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.hw.CosNotifyFilter.DuplicateConstraintIDHelper.id(),"DuplicateConstraintID",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.hw.CosNotifyFilter.ConstraintIDHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyFilter.DuplicateConstraintID s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyFilter.DuplicateConstraintID extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/DuplicateConstraintID:1.0";
	}
	public static org.omg.hw.CosNotifyFilter.DuplicateConstraintID read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.CosNotifyFilter.DuplicateConstraintID result = new org.omg.hw.CosNotifyFilter.DuplicateConstraintID();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.id=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.CosNotifyFilter.DuplicateConstraintID s)
	{
		out.write_string(id());
		out.write_long(s.id);
	}
}
