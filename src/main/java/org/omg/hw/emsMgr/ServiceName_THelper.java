package org.omg.hw.emsMgr;


/**
 *	Generated from IDL definition of struct "ServiceName_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceName_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.emsMgr.ServiceName_THelper.id(),"ServiceName_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.emsMgr.ServiceName_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.emsMgr.ServiceName_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/ServiceName_T:1.0";
	}
	public static org.omg.hw.emsMgr.ServiceName_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.emsMgr.ServiceName_T result = new org.omg.hw.emsMgr.ServiceName_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.nativeEMSName=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.emsMgr.ServiceName_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.nativeEMSName);
	}
}
