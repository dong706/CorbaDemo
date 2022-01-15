package org.omg.zx.performance;


/**
 *	Generated from IDL definition of struct "QueryPMFilter_T"
 *	@author JacORB IDL compiler 
 */

public final class QueryPMFilter_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.performance.QueryPMFilter_THelper.id(),"QueryPMFilter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmSourceSelect", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pmParameterSelect", org.omg.zx.performance.PMParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("pmGranularitySelect", org.omg.zx.performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("layerRateList", org.omg.zx.transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("pMLocationList", org.omg.zx.performance.PMLocationList_THelper.type(), null),new org.omg.CORBA.StructMember("raiseTime", org.omg.zx.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("clearTime", org.omg.zx.globaldefs.Time_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.performance.QueryPMFilter_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.performance.QueryPMFilter_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/QueryPMFilter_T:1.0";
	}
	public static org.omg.zx.performance.QueryPMFilter_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.performance.QueryPMFilter_T result = new org.omg.zx.performance.QueryPMFilter_T();
		result.pmSourceSelect = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		result.pmParameterSelect = org.omg.zx.performance.PMParameterList_THelper.read(in);
		result.pmGranularitySelect=in.read_string();
		result.layerRateList = org.omg.zx.transmissionParameters.LayerRateList_THelper.read(in);
		result.pMLocationList = org.omg.zx.performance.PMLocationList_THelper.read(in);
		result.raiseTime=in.read_string();
		result.clearTime=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.performance.QueryPMFilter_T s)
	{
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.pmSourceSelect);
		org.omg.zx.performance.PMParameterList_THelper.write(out,s.pmParameterSelect);
		out.write_string(s.pmGranularitySelect);
		org.omg.zx.transmissionParameters.LayerRateList_THelper.write(out,s.layerRateList);
		org.omg.zx.performance.PMLocationList_THelper.write(out,s.pMLocationList);
		out.write_string(s.raiseTime);
		out.write_string(s.clearTime);
	}
}
