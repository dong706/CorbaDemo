package org.omg.zx.globaldefs;


/**
 *	Generated from IDL definition of struct "NameAndNVS_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndNVS_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.globaldefs.NameAndNVS_THelper.id(),"NameAndNVS_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.globaldefs.NameAndNVS_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.globaldefs.NameAndNVS_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/NameAndNVS_T:1.0";
	}
	public static org.omg.zx.globaldefs.NameAndNVS_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.globaldefs.NameAndNVS_T result = new org.omg.zx.globaldefs.NameAndNVS_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.globaldefs.NameAndNVS_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
