package org.omg.zx.performance;


/**
 *	Generated from IDL definition of struct "PMCollectionPlan_T"
 *	@author JacORB IDL compiler 
 */

public final class PMCollectionPlan_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.performance.PMCollectionPlan_THelper.id(),"PMCollectionPlan_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.performance.PMTPSelect_THelper.type(), null),new org.omg.CORBA.StructMember("beginTime", org.omg.zx.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("endTime", org.omg.zx.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("reportInterval", org.omg.zx.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("pMParameterList", org.omg.zx.performance.PMParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("pmMonitorStatus", org.omg.zx.performance.PMMonitorOrReportStatus_THelper.type(), null),new org.omg.CORBA.StructMember("pmReportStatus", org.omg.zx.performance.PMMonitorOrReportStatus_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.performance.PMCollectionPlan_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.performance.PMCollectionPlan_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMCollectionPlan_T:1.0";
	}
	public static org.omg.zx.performance.PMCollectionPlan_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.performance.PMCollectionPlan_T result = new org.omg.zx.performance.PMCollectionPlan_T();
		result.name=org.omg.zx.performance.PMTPSelect_THelper.read(in);
		result.beginTime=in.read_string();
		result.endTime=in.read_string();
		result.reportInterval=in.read_string();
		result.pMParameterList = org.omg.zx.performance.PMParameterList_THelper.read(in);
		result.pmMonitorStatus=org.omg.zx.performance.PMMonitorOrReportStatus_THelper.read(in);
		result.pmReportStatus=org.omg.zx.performance.PMMonitorOrReportStatus_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.performance.PMCollectionPlan_T s)
	{
		org.omg.zx.performance.PMTPSelect_THelper.write(out,s.name);
		out.write_string(s.beginTime);
		out.write_string(s.endTime);
		out.write_string(s.reportInterval);
		org.omg.zx.performance.PMParameterList_THelper.write(out,s.pMParameterList);
		org.omg.zx.performance.PMMonitorOrReportStatus_THelper.write(out,s.pmMonitorStatus);
		org.omg.zx.performance.PMMonitorOrReportStatus_THelper.write(out,s.pmReportStatus);
	}
}
