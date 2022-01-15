package org.omg.zx.alarmMgr;


/**
 *	Generated from IDL definition of struct "SeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class SeverityAssignment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.alarmMgr.SeverityAssignment_THelper.id(),"SeverityAssignment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("probableCause", org.omg.zx.alarmMgr.ProbableCause_THelper.type(), null),new org.omg.CORBA.StructMember("currentSeverity", org.omg.zx.alarmMgr.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("defaultSeverity", org.omg.zx.alarmMgr.PerceivedSeverity_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.alarmMgr.SeverityAssignment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.alarmMgr.SeverityAssignment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/SeverityAssignment_T:1.0";
	}
	public static org.omg.zx.alarmMgr.SeverityAssignment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.alarmMgr.SeverityAssignment_T result = new org.omg.zx.alarmMgr.SeverityAssignment_T();
		result.probableCause=in.read_string();
		result.currentSeverity=org.omg.zx.alarmMgr.PerceivedSeverity_THelper.read(in);
		result.defaultSeverity=org.omg.zx.alarmMgr.PerceivedSeverity_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.alarmMgr.SeverityAssignment_T s)
	{
		out.write_string(s.probableCause);
		org.omg.zx.alarmMgr.PerceivedSeverity_THelper.write(out,s.currentSeverity);
		org.omg.zx.alarmMgr.PerceivedSeverity_THelper.write(out,s.defaultSeverity);
	}
}
