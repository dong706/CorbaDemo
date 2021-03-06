package org.omg.zx.managedElement;


/**
 *	Generated from IDL definition of struct "IPAddr_T"
 *	@author JacORB IDL compiler 
 */

public final class IPAddr_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.managedElement.IPAddr_THelper.id(),"IPAddr_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("a", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("b", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("c", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("d", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.managedElement.IPAddr_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.managedElement.IPAddr_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/IPAddr_T:1.0";
	}
	public static org.omg.zx.managedElement.IPAddr_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.managedElement.IPAddr_T result = new org.omg.zx.managedElement.IPAddr_T();
		result.a=in.read_long();
		result.b=in.read_long();
		result.c=in.read_long();
		result.d=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.managedElement.IPAddr_T s)
	{
		out.write_long(s.a);
		out.write_long(s.b);
		out.write_long(s.c);
		out.write_long(s.d);
	}
}
