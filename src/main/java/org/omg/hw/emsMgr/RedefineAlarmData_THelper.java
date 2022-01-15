package org.omg.hw.emsMgr;


/**
 *	Generated from IDL definition of struct "RedefineAlarmData_T"
 *	@author JacORB IDL compiler 
 */

public final class RedefineAlarmData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.emsMgr.RedefineAlarmData_THelper.id(),"RedefineAlarmData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ruleID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("groupID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("redefinedSeverity", org.omg.hw.notifications.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("objectList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("redefineInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.emsMgr.RedefineAlarmData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.emsMgr.RedefineAlarmData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/RedefineAlarmData_T:1.0";
	}
	public static org.omg.hw.emsMgr.RedefineAlarmData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.emsMgr.RedefineAlarmData_T result = new org.omg.hw.emsMgr.RedefineAlarmData_T();
		result.ruleID=in.read_long();
		result.groupID=in.read_long();
		result.alarmID=in.read_long();
		result.redefinedSeverity=org.omg.hw.notifications.PerceivedSeverity_THelper.read(in);
		result.objectList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.redefineInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.emsMgr.RedefineAlarmData_T s)
	{
		out.write_long(s.ruleID);
		out.write_long(s.groupID);
		out.write_long(s.alarmID);
		org.omg.hw.notifications.PerceivedSeverity_THelper.write(out,s.redefinedSeverity);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.objectList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.redefineInfo);
	}
}
