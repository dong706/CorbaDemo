package org.omg.hw.performance;


/**
 *	Generated from IDL definition of struct "PerformanceMonitoringInstance_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceMonitoringInstance_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.performance.PerformanceMonitoringInstance_THelper.id(),"PerformanceMonitoringInstance_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vendorExtensions", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null),new org.omg.CORBA.StructMember("resourceRef", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("pmmc", org.omg.hw.performance.PmMonitorConditioning_THelper.type(), null),new org.omg.CORBA.StructMember("status", org.omg.hw.performance.ActivityStatusEnum_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.PerformanceMonitoringInstance_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.PerformanceMonitoringInstance_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PerformanceMonitoringInstance_T:1.0";
	}
	public static org.omg.hw.performance.PerformanceMonitoringInstance_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.performance.PerformanceMonitoringInstance_T result = new org.omg.hw.performance.PerformanceMonitoringInstance_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.vendorExtensions=in.read_any();
		result.resourceRef = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.pmmc=org.omg.hw.performance.PmMonitorConditioning_THelper.read(in);
		result.status=org.omg.hw.performance.ActivityStatusEnum_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.performance.PerformanceMonitoringInstance_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_any(s.vendorExtensions);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.resourceRef);
		org.omg.hw.performance.PmMonitorConditioning_THelper.write(out,s.pmmc);
		org.omg.hw.performance.ActivityStatusEnum_THelper.write(out,s.status);
	}
}
