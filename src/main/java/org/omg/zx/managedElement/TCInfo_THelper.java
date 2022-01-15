package org.omg.zx.managedElement;


/**
 *	Generated from IDL definition of struct "TCInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TCInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.managedElement.TCInfo_THelper.id(),"TCInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tclNumber", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("tcCapability", org.omg.zx.managedElement.TCCapability_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.managedElement.TCInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.managedElement.TCInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/TCInfo_T:1.0";
	}
	public static org.omg.zx.managedElement.TCInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.managedElement.TCInfo_T result = new org.omg.zx.managedElement.TCInfo_T();
		result.tclNumber=in.read_long();
		result.tcCapability=org.omg.zx.managedElement.TCCapability_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.managedElement.TCInfo_T s)
	{
		out.write_long(s.tclNumber);
		org.omg.zx.managedElement.TCCapability_THelper.write(out,s.tcCapability);
	}
}
