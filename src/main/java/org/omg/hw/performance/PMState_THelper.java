package org.omg.hw.performance;


/**
 *	Generated from IDL definition of struct "PMState_T"
 *	@author JacORB IDL compiler 
 */

public final class PMState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.performance.PMState_THelper.id(),"PMState_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.omg.hw.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", org.omg.hw.performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("pmEventStateList", org.omg.hw.performance.PMEventStateList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.PMState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.PMState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMState_T:1.0";
	}
	public static org.omg.hw.performance.PMState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.performance.PMState_T result = new org.omg.hw.performance.PMState_T();
		result.tpName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.layerRate=in.read_short();
		result.granularity=in.read_string();
		result.pmEventStateList = org.omg.hw.performance.PMEventStateList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.performance.PMState_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.tpName);
		out.write_short(s.layerRate);
		out.write_string(s.granularity);
		org.omg.hw.performance.PMEventStateList_THelper.write(out,s.pmEventStateList);
	}
}
