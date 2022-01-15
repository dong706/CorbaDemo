package org.omg.hw.performance;


/**
 *	Generated from IDL definition of struct "PerformanceCreateResource_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceCreateResource_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.performance.PerformanceCreateResource_THelper.id(),"PerformanceCreateResource_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("resourceRef", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("resourceSLA", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.PerformanceCreateResource_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.PerformanceCreateResource_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PerformanceCreateResource_T:1.0";
	}
	public static org.omg.hw.performance.PerformanceCreateResource_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.performance.PerformanceCreateResource_T result = new org.omg.hw.performance.PerformanceCreateResource_T();
		result.resourceRef = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.resourceSLA = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.performance.PerformanceCreateResource_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.resourceRef);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.resourceSLA);
	}
}
