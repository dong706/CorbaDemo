package org.omg.hw.performance;


/**
 *	Generated from IDL definition of struct "PmMonitorConditioning_T"
 *	@author JacORB IDL compiler 
 */

public final class PmMonitorConditioning_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.performance.PmMonitorConditioning_THelper.id(),"PmMonitorConditioning_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("granularity", org.omg.hw.performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("startTime", org.omg.hw.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("endTime", org.omg.hw.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("pmScheduleName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("templateID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("templateName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("template", org.omg.hw.performance.PerformanceTemplate_THelper.type(), null),new org.omg.CORBA.StructMember("intanceType", org.omg.hw.performance.InstanceEnum_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.PmMonitorConditioning_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.PmMonitorConditioning_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PmMonitorConditioning_T:1.0";
	}
	public static org.omg.hw.performance.PmMonitorConditioning_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.performance.PmMonitorConditioning_T result = new org.omg.hw.performance.PmMonitorConditioning_T();
		result.granularity=in.read_string();
		result.startTime=in.read_string();
		result.endTime=in.read_string();
		result.pmScheduleName=in.read_string();
		result.templateID=in.read_string();
		result.templateName=in.read_string();
		result.template=org.omg.hw.performance.PerformanceTemplate_THelper.read(in);
		result.intanceType=org.omg.hw.performance.InstanceEnum_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.performance.PmMonitorConditioning_T s)
	{
		out.write_string(s.granularity);
		out.write_string(s.startTime);
		out.write_string(s.endTime);
		out.write_string(s.pmScheduleName);
		out.write_string(s.templateID);
		out.write_string(s.templateName);
		org.omg.hw.performance.PerformanceTemplate_THelper.write(out,s.template);
		org.omg.hw.performance.InstanceEnum_THelper.write(out,s.intanceType);
	}
}
