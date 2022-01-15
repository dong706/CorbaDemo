package org.omg.hw.performance;


/**
 *	Generated from IDL definition of struct "PerformanceCreateInstance_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceCreateInstance_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.performance.PerformanceCreateInstance_THelper.id(),"PerformanceCreateInstance_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vendorExtensions", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null),new org.omg.CORBA.StructMember("resType", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("scheduleName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("startTime", org.omg.hw.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("endTime", org.omg.hw.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("resource", org.omg.hw.performance.PerformanceCreateResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("template", org.omg.hw.performance.PerformanceTemplateList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.PerformanceCreateInstance_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.PerformanceCreateInstance_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PerformanceCreateInstance_T:1.0";
	}
	public static org.omg.hw.performance.PerformanceCreateInstance_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.performance.PerformanceCreateInstance_T result = new org.omg.hw.performance.PerformanceCreateInstance_T();
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.vendorExtensions=in.read_any();
		result.resType=in.read_ulong();
		result.scheduleName=in.read_string();
		result.startTime=in.read_string();
		result.endTime=in.read_string();
		result.resource = org.omg.hw.performance.PerformanceCreateResourceList_THelper.read(in);
		result.template = org.omg.hw.performance.PerformanceTemplateList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.performance.PerformanceCreateInstance_T s)
	{
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_any(s.vendorExtensions);
		out.write_ulong(s.resType);
		out.write_string(s.scheduleName);
		out.write_string(s.startTime);
		out.write_string(s.endTime);
		org.omg.hw.performance.PerformanceCreateResourceList_THelper.write(out,s.resource);
		org.omg.hw.performance.PerformanceTemplateList_THelper.write(out,s.template);
	}
}
