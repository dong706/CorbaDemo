package org.omg.hw.performance;


/**
 *	Generated from IDL definition of struct "PMThresholdValue_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdValue_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.performance.PMThresholdValue_THelper.id(),"PMThresholdValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", org.omg.hw.performance.PMParameterName_THelper.type(), null),new org.omg.CORBA.StructMember("pmLocation", org.omg.hw.performance.PMLocation_THelper.type(), null),new org.omg.CORBA.StructMember("thresholdType", org.omg.hw.performance.PMThresholdType_THelper.type(), null),new org.omg.CORBA.StructMember("triggerFlag", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.PMThresholdValue_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.PMThresholdValue_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMThresholdValue_T:1.0";
	}
	public static org.omg.hw.performance.PMThresholdValue_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.performance.PMThresholdValue_T result = new org.omg.hw.performance.PMThresholdValue_T();
		result.pmParameterName=in.read_string();
		result.pmLocation=in.read_string();
		result.thresholdType=org.omg.hw.performance.PMThresholdType_THelper.read(in);
		result.triggerFlag=in.read_boolean();
		result.value=in.read_float();
		result.unit=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.performance.PMThresholdValue_T s)
	{
		out.write_string(s.pmParameterName);
		out.write_string(s.pmLocation);
		org.omg.hw.performance.PMThresholdType_THelper.write(out,s.thresholdType);
		out.write_boolean(s.triggerFlag);
		out.write_float(s.value);
		out.write_string(s.unit);
	}
}
