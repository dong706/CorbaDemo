package org.omg.hw.performance;


/**
 *	Generated from IDL definition of struct "PerformanceTemplate_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceTemplate_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.performance.PerformanceTemplate_THelper.id(),"PerformanceTemplate_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.hw.performance.InstanceEnum_THelper.type(), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.PerformanceTemplate_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.PerformanceTemplate_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PerformanceTemplate_T:1.0";
	}
	public static org.omg.hw.performance.PerformanceTemplate_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.performance.PerformanceTemplate_T result = new org.omg.hw.performance.PerformanceTemplate_T();
		result.id=in.read_ulong();
		result.name=in.read_string();
		result.type=org.omg.hw.performance.InstanceEnum_THelper.read(in);
		result.period=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.performance.PerformanceTemplate_T s)
	{
		out.write_ulong(s.id);
		out.write_string(s.name);
		org.omg.hw.performance.InstanceEnum_THelper.write(out,s.type);
		out.write_ulong(s.period);
	}
}
