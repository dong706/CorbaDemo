package org.omg.hw.flowDomain_cmcc;
/**
 *	Generated from IDL definition of enum "CPTP_Role_T"
 *	@author JacORB IDL compiler 
 */

public final class CPTP_Role_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.hw.flowDomain_cmcc.CPTP_Role_THelper.id(),"CPTP_Role_T",new String[]{"CPTPR_FD_EDGE","CPTPR_FD_INTERNAL","CPTPR_ALL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.flowDomain_cmcc.CPTP_Role_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.flowDomain_cmcc.CPTP_Role_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain_cmcc/CPTP_Role_T:1.0";
	}
	public static CPTP_Role_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return CPTP_Role_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final CPTP_Role_T s)
	{
		out.write_long(s.value());
	}
}
