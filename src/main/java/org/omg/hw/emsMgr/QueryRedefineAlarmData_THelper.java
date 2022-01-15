package org.omg.hw.emsMgr;


/**
 *	Generated from IDL definition of struct "QueryRedefineAlarmData_T"
 *	@author JacORB IDL compiler 
 */

public final class QueryRedefineAlarmData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.emsMgr.QueryRedefineAlarmData_THelper.id(),"QueryRedefineAlarmData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ruleID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("groupID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.emsMgr.QueryRedefineAlarmData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.emsMgr.QueryRedefineAlarmData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/QueryRedefineAlarmData_T:1.0";
	}
	public static org.omg.hw.emsMgr.QueryRedefineAlarmData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.emsMgr.QueryRedefineAlarmData_T result = new org.omg.hw.emsMgr.QueryRedefineAlarmData_T();
		result.ruleID=in.read_long();
		result.groupID=in.read_long();
		result.alarmID=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.emsMgr.QueryRedefineAlarmData_T s)
	{
		out.write_long(s.ruleID);
		out.write_long(s.groupID);
		out.write_long(s.alarmID);
	}
}
