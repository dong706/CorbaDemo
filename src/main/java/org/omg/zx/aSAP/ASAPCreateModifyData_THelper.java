package org.omg.zx.aSAP;


/**
 *	Generated from IDL definition of struct "ASAPCreateModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAPCreateModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.aSAP.ASAPCreateModifyData_THelper.id(),"ASAPCreateModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("alarmSeverityAssignmentList", org.omg.zx.aSAP.AlarmSeverityAssignmentList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.aSAP.ASAPCreateModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.aSAP.ASAPCreateModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/aSAP/ASAPCreateModifyData_T:1.0";
	}
	public static org.omg.zx.aSAP.ASAPCreateModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.aSAP.ASAPCreateModifyData_T result = new org.omg.zx.aSAP.ASAPCreateModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.alarmSeverityAssignmentList = org.omg.zx.aSAP.AlarmSeverityAssignmentList_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.aSAP.ASAPCreateModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		org.omg.zx.aSAP.AlarmSeverityAssignmentList_THelper.write(out,s.alarmSeverityAssignmentList);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
