package org.omg.zx.performance;


/**
 *	Generated from IDL definition of struct "PMMeasurement_T"
 *	@author JacORB IDL compiler 
 */

public final class PMMeasurement_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.performance.PMMeasurement_THelper.id(),"PMMeasurement_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameter", org.omg.zx.performance.PMParameter_THelper.type(), null),new org.omg.CORBA.StructMember("pmLocation", org.omg.zx.performance.PMLocation_THelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("intervalStatus", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.performance.PMMeasurement_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.performance.PMMeasurement_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMMeasurement_T:1.0";
	}
	public static org.omg.zx.performance.PMMeasurement_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.performance.PMMeasurement_T result = new org.omg.zx.performance.PMMeasurement_T();
		result.pmParameter=in.read_string();
		result.pmLocation=in.read_string();
		result.value=in.read_float();
		result.unit=in.read_string();
		result.intervalStatus=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.performance.PMMeasurement_T s)
	{
		out.write_string(s.pmParameter);
		out.write_string(s.pmLocation);
		out.write_float(s.value);
		out.write_string(s.unit);
		out.write_string(s.intervalStatus);
	}
}
