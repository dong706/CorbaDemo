package org.omg.zx.performance;


/**
 *	Generated from IDL definition of struct "PMTask_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTask_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.performance.PMTask_THelper.id(),"PMTask_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("taskName", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("pmCollectionPlanList", org.omg.zx.performance.PMCollectionPlanList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.performance.PMTask_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.performance.PMTask_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMTask_T:1.0";
	}
	public static org.omg.zx.performance.PMTask_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.performance.PMTask_T result = new org.omg.zx.performance.PMTask_T();
		result.taskName = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.pmCollectionPlanList = org.omg.zx.performance.PMCollectionPlanList_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.performance.PMTask_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.taskName);
		org.omg.zx.performance.PMCollectionPlanList_THelper.write(out,s.pmCollectionPlanList);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
