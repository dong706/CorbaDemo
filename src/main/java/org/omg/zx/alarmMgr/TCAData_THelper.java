package org.omg.zx.alarmMgr;


/**
 *	Generated from IDL definition of struct "TCAData_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.alarmMgr.TCAData_THelper.id(),"TCAData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("alarmSource", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("alarmDetectInfo", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", org.omg.zx.performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("pmParameter", org.omg.zx.performance.PMParameter_THelper.type(), null),new org.omg.CORBA.StructMember("performanceValue", org.omg.zx.performance.PMMeasurement_THelper.type(), null),new org.omg.CORBA.StructMember("thresholdValue", org.omg.zx.performance.PMMeasurement_THelper.type(), null),new org.omg.CORBA.StructMember("thresholdType", org.omg.zx.performance.PMThresholdType_THelper.type(), null),new org.omg.CORBA.StructMember("perceivedSeverity", org.omg.zx.alarmMgr.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.omg.zx.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("raiseTime", org.omg.zx.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("clearTime", org.omg.zx.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.alarmMgr.TCAData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.alarmMgr.TCAData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/TCAData_T:1.0";
	}
	public static org.omg.zx.alarmMgr.TCAData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.alarmMgr.TCAData_T result = new org.omg.zx.alarmMgr.TCAData_T();
		result.alarmSource = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.alarmDetectInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.granularity=in.read_string();
		result.pmParameter=in.read_string();
		result.performanceValue=org.omg.zx.performance.PMMeasurement_THelper.read(in);
		result.thresholdValue=org.omg.zx.performance.PMMeasurement_THelper.read(in);
		result.thresholdType=org.omg.zx.performance.PMThresholdType_THelper.read(in);
		result.perceivedSeverity=org.omg.zx.alarmMgr.PerceivedSeverity_THelper.read(in);
		result.layerRate=in.read_short();
		result.raiseTime=in.read_string();
		result.clearTime=in.read_string();
		result.additionalInfo = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.alarmMgr.TCAData_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.alarmSource);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.alarmDetectInfo);
		out.write_string(s.granularity);
		out.write_string(s.pmParameter);
		org.omg.zx.performance.PMMeasurement_THelper.write(out,s.performanceValue);
		org.omg.zx.performance.PMMeasurement_THelper.write(out,s.thresholdValue);
		org.omg.zx.performance.PMThresholdType_THelper.write(out,s.thresholdType);
		org.omg.zx.alarmMgr.PerceivedSeverity_THelper.write(out,s.perceivedSeverity);
		out.write_short(s.layerRate);
		out.write_string(s.raiseTime);
		out.write_string(s.clearTime);
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.additionalInfo);
	}
}
