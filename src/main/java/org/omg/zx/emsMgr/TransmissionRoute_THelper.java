package org.omg.zx.emsMgr;


/**
 *	Generated from IDL definition of struct "TransmissionRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionRoute_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.emsMgr.TransmissionRoute_THelper.id(),"TransmissionRoute_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("routeNo", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("channelNo", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.emsMgr.TransmissionRoute_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.emsMgr.TransmissionRoute_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/TransmissionRoute_T:1.0";
	}
	public static org.omg.zx.emsMgr.TransmissionRoute_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.emsMgr.TransmissionRoute_T result = new org.omg.zx.emsMgr.TransmissionRoute_T();
		result.routeNo=in.read_long();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.channelNo=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.emsMgr.TransmissionRoute_T s)
	{
		out.write_long(s.routeNo);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.channelNo);
	}
}
