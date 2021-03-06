package org.omg.hw.maintenanceOps;


/**
 *	Generated from IDL definition of struct "PRBSTestParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestParameter_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.maintenanceOps.PRBSTestParameter_THelper.id(),"PRBSTestParameter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("testDuration", org.omg.hw.maintenanceOps.TestDuration_THelper.type(), null),new org.omg.CORBA.StructMember("sampleGranularity", org.omg.hw.maintenanceOps.SampleGranularity_THelper.type(), null),new org.omg.CORBA.StructMember("testType", org.omg.hw.maintenanceOps.PRBSTestType_THelper.type(), null),new org.omg.CORBA.StructMember("accumulatingIndicator", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.maintenanceOps.PRBSTestParameter_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.maintenanceOps.PRBSTestParameter_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/PRBSTestParameter_T:1.0";
	}
	public static org.omg.hw.maintenanceOps.PRBSTestParameter_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.maintenanceOps.PRBSTestParameter_T result = new org.omg.hw.maintenanceOps.PRBSTestParameter_T();
		result.tpName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.testDuration=org.omg.hw.maintenanceOps.TestDuration_THelper.read(in);
		result.sampleGranularity=in.read_string();
		result.testType=in.read_string();
		result.accumulatingIndicator=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.maintenanceOps.PRBSTestParameter_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.tpName);
		org.omg.hw.maintenanceOps.TestDuration_THelper.write(out,s.testDuration);
		out.write_string(s.sampleGranularity);
		out.write_string(s.testType);
		out.write_boolean(s.accumulatingIndicator);
	}
}
