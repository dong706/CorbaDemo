package org.omg.zx.managedElement;


/**
 *	Generated from IDL definition of struct "NetAddress_T"
 *	@author JacORB IDL compiler 
 */

public final class NetAddress_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.managedElement.NetAddress_THelper.id(),"NetAddress_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ipAddr", org.omg.zx.managedElement.IPAddr_THelper.type(), null),new org.omg.CORBA.StructMember("portNumber", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.managedElement.NetAddress_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.managedElement.NetAddress_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/NetAddress_T:1.0";
	}
	public static org.omg.zx.managedElement.NetAddress_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.managedElement.NetAddress_T result = new org.omg.zx.managedElement.NetAddress_T();
		result.ipAddr=org.omg.zx.managedElement.IPAddr_THelper.read(in);
		result.portNumber=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.managedElement.NetAddress_T s)
	{
		org.omg.zx.managedElement.IPAddr_THelper.write(out,s.ipAddr);
		out.write_long(s.portNumber);
	}
}
