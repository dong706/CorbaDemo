package org.omg.zx.globaldefs;


/**
 *	Generated from IDL definition of struct "Duration_T"
 *	@author JacORB IDL compiler 
 */

public final class Duration_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.globaldefs.Duration_THelper.id(),"Duration_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("fromTime", org.omg.zx.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("toTime", org.omg.zx.globaldefs.Time_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.globaldefs.Duration_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.globaldefs.Duration_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/Duration_T:1.0";
	}
	public static org.omg.zx.globaldefs.Duration_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.globaldefs.Duration_T result = new org.omg.zx.globaldefs.Duration_T();
		result.fromTime=in.read_string();
		result.toTime=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.globaldefs.Duration_T s)
	{
		out.write_string(s.fromTime);
		out.write_string(s.toTime);
	}
}
