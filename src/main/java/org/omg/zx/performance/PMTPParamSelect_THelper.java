package org.omg.zx.performance;


/**
 *	Generated from IDL definition of struct "PMTPParamSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPParamSelect_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.performance.PMTPParamSelect_THelper.id(),"PMTPParamSelect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("layerRateList", org.omg.zx.transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("pMLocationList", org.omg.zx.performance.PMLocationList_THelper.type(), null),new org.omg.CORBA.StructMember("granularityList", org.omg.zx.performance.GranularityList_THelper.type(), null),new org.omg.CORBA.StructMember("pmParameterList", org.omg.zx.performance.PMParameterList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.performance.PMTPParamSelect_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.performance.PMTPParamSelect_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMTPParamSelect_T:1.0";
	}
	public static org.omg.zx.performance.PMTPParamSelect_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.performance.PMTPParamSelect_T result = new org.omg.zx.performance.PMTPParamSelect_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.layerRateList = org.omg.zx.transmissionParameters.LayerRateList_THelper.read(in);
		result.pMLocationList = org.omg.zx.performance.PMLocationList_THelper.read(in);
		result.granularityList = org.omg.zx.performance.GranularityList_THelper.read(in);
		result.pmParameterList = org.omg.zx.performance.PMParameterList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.performance.PMTPParamSelect_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		org.omg.zx.transmissionParameters.LayerRateList_THelper.write(out,s.layerRateList);
		org.omg.zx.performance.PMLocationList_THelper.write(out,s.pMLocationList);
		org.omg.zx.performance.GranularityList_THelper.write(out,s.granularityList);
		org.omg.zx.performance.PMParameterList_THelper.write(out,s.pmParameterList);
	}
}
