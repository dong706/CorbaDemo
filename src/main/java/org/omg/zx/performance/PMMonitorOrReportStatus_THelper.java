package org.omg.zx.performance;
/**
 *	Generated from IDL definition of enum "PMMonitorOrReportStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class PMMonitorOrReportStatus_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.zx.performance.PMMonitorOrReportStatus_THelper.id(),"PMMonitorOrReportStatus_T",new String[]{"Locked","Unlocked"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.performance.PMMonitorOrReportStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.performance.PMMonitorOrReportStatus_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMMonitorOrReportStatus_T:1.0";
	}
	public static PMMonitorOrReportStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return PMMonitorOrReportStatus_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final PMMonitorOrReportStatus_T s)
	{
		out.write_long(s.value());
	}
}
