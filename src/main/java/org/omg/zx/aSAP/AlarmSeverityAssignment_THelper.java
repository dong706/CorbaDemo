package org.omg.zx.aSAP;


/**
 *	Generated from IDL definition of struct "AlarmSeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmSeverityAssignment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.aSAP.AlarmSeverityAssignment_THelper.id(),"AlarmSeverityAssignment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("probableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("probableCauseQualifier", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeProbableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("serviceAffecting", org.omg.zx.aSAP.AssignedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("serviceNonAffecting", org.omg.zx.aSAP.AssignedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("serviceIndependentOrUnknown", org.omg.zx.aSAP.AssignedSeverity_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.aSAP.AlarmSeverityAssignment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.aSAP.AlarmSeverityAssignment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/aSAP/AlarmSeverityAssignment_T:1.0";
	}
	public static org.omg.zx.aSAP.AlarmSeverityAssignment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.aSAP.AlarmSeverityAssignment_T result = new org.omg.zx.aSAP.AlarmSeverityAssignment_T();
		result.probableCause=in.read_string();
		result.probableCauseQualifier=in.read_string();
		result.nativeProbableCause=in.read_string();
		result.serviceAffecting=org.omg.zx.aSAP.AssignedSeverity_THelper.read(in);
		result.serviceNonAffecting=org.omg.zx.aSAP.AssignedSeverity_THelper.read(in);
		result.serviceIndependentOrUnknown=org.omg.zx.aSAP.AssignedSeverity_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.aSAP.AlarmSeverityAssignment_T s)
	{
		out.write_string(s.probableCause);
		out.write_string(s.probableCauseQualifier);
		out.write_string(s.nativeProbableCause);
		org.omg.zx.aSAP.AssignedSeverity_THelper.write(out,s.serviceAffecting);
		org.omg.zx.aSAP.AssignedSeverity_THelper.write(out,s.serviceNonAffecting);
		org.omg.zx.aSAP.AssignedSeverity_THelper.write(out,s.serviceIndependentOrUnknown);
	}
}
