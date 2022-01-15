package org.omg.zx.managedElement;


/**
 *	Generated from IDL definition of struct "MECoordinates_T"
 *	@author JacORB IDL compiler 
 */

public final class MECoordinates_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.managedElement.MECoordinates_THelper.id(),"MECoordinates_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("coordinate", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("relativeCoordinate", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.managedElement.MECoordinates_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.managedElement.MECoordinates_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/MECoordinates_T:1.0";
	}
	public static org.omg.zx.managedElement.MECoordinates_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.managedElement.MECoordinates_T result = new org.omg.zx.managedElement.MECoordinates_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.coordinate=in.read_string();
		result.relativeCoordinate=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.managedElement.MECoordinates_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.coordinate);
		out.write_string(s.relativeCoordinate);
	}
}
