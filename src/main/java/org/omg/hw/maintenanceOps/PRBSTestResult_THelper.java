package org.omg.hw.maintenanceOps;


/**
 *	Generated from IDL definition of struct "PRBSTestResult_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestResult_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.maintenanceOps.PRBSTestResult_THelper.id(),"PRBSTestResult_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("testPara", org.omg.hw.maintenanceOps.PRBSTestParameter_THelper.type(), null),new org.omg.CORBA.StructMember("startTime", org.omg.hw.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("sampleResultList", org.omg.hw.maintenanceOps.SampleResultList_THelper.type(), null),new org.omg.CORBA.StructMember("totalBitError", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("realDuration", org.omg.hw.maintenanceOps.TestDuration_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.maintenanceOps.PRBSTestResult_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.maintenanceOps.PRBSTestResult_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/PRBSTestResult_T:1.0";
	}
	public static org.omg.hw.maintenanceOps.PRBSTestResult_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.maintenanceOps.PRBSTestResult_T result = new org.omg.hw.maintenanceOps.PRBSTestResult_T();
		result.testPara=org.omg.hw.maintenanceOps.PRBSTestParameter_THelper.read(in);
		result.startTime=in.read_string();
		result.sampleResultList = org.omg.hw.maintenanceOps.SampleResultList_THelper.read(in);
		result.totalBitError=in.read_ulong();
		result.realDuration=org.omg.hw.maintenanceOps.TestDuration_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.maintenanceOps.PRBSTestResult_T s)
	{
		org.omg.hw.maintenanceOps.PRBSTestParameter_THelper.write(out,s.testPara);
		out.write_string(s.startTime);
		org.omg.hw.maintenanceOps.SampleResultList_THelper.write(out,s.sampleResultList);
		out.write_ulong(s.totalBitError);
		org.omg.hw.maintenanceOps.TestDuration_THelper.write(out,s.realDuration);
	}
}
