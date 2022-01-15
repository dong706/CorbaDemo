package org.omg.zx.alarmMgr;


/**
 *	Generated from IDL definition of struct "QueryAlarmFilter_T"
 *	@author JacORB IDL compiler 
 */

public final class QueryAlarmFilter_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.alarmMgr.QueryAlarmFilter_THelper.id(),"QueryAlarmFilter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("alarmSourceSelect", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("alarmTypeSelect", org.omg.zx.alarmMgr.AlarmTypeList_THelper.type(), null),new org.omg.CORBA.StructMember("perceivedSeveritySelect", org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.type(), null),new org.omg.CORBA.StructMember("probableCauseSelect", org.omg.zx.alarmMgr.ProbableCauseList_THelper.type(), null),new org.omg.CORBA.StructMember("raiseTimeDuration", org.omg.zx.globaldefs.Duration_THelper.type(), null),new org.omg.CORBA.StructMember("clearTimeDuration", org.omg.zx.globaldefs.Duration_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.alarmMgr.QueryAlarmFilter_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.alarmMgr.QueryAlarmFilter_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/QueryAlarmFilter_T:1.0";
	}
	public static org.omg.zx.alarmMgr.QueryAlarmFilter_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.alarmMgr.QueryAlarmFilter_T result = new org.omg.zx.alarmMgr.QueryAlarmFilter_T();
		result.alarmSourceSelect = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		result.alarmTypeSelect = org.omg.zx.alarmMgr.AlarmTypeList_THelper.read(in);
		result.perceivedSeveritySelect = org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.read(in);
		result.probableCauseSelect = org.omg.zx.alarmMgr.ProbableCauseList_THelper.read(in);
		result.raiseTimeDuration=org.omg.zx.globaldefs.Duration_THelper.read(in);
		result.clearTimeDuration=org.omg.zx.globaldefs.Duration_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.alarmMgr.QueryAlarmFilter_T s)
	{
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.alarmSourceSelect);
		org.omg.zx.alarmMgr.AlarmTypeList_THelper.write(out,s.alarmTypeSelect);
		org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.write(out,s.perceivedSeveritySelect);
		org.omg.zx.alarmMgr.ProbableCauseList_THelper.write(out,s.probableCauseSelect);
		org.omg.zx.globaldefs.Duration_THelper.write(out,s.raiseTimeDuration);
		org.omg.zx.globaldefs.Duration_THelper.write(out,s.clearTimeDuration);
	}
}
