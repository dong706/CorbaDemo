package org.omg.hw.protection;


/**
 *	Generated from IDL definition of struct "PGPModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class PGPModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.protection.PGPModifyData_THelper.id(),"PGPModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.hw.protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("pgpTPList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pgpParameters", org.omg.hw.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.protection.PGPModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.protection.PGPModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/PGPModifyData_T:1.0";
	}
	public static org.omg.hw.protection.PGPModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.protection.PGPModifyData_T result = new org.omg.hw.protection.PGPModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.reversionMode=org.omg.hw.protection.ReversionMode_THelper.read(in);
		result.pgpTPList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.pgpParameters = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.protection.PGPModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		org.omg.hw.protection.ReversionMode_THelper.write(out,s.reversionMode);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.pgpTPList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.pgpParameters);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
