package org.omg.zx.performance;


/**
 *	Generated from IDL definition of struct "TCAParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameters_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.performance.TCAParameters_THelper.id(),"TCAParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", org.omg.zx.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", org.omg.zx.performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("tcaTypeValues", org.omg.zx.performance.PMThresholdValueList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.performance.TCAParameters_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.performance.TCAParameters_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/TCAParameters_T:1.0";
	}
	public static org.omg.zx.performance.TCAParameters_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.performance.TCAParameters_T result = new org.omg.zx.performance.TCAParameters_T();
		result.layerRate=in.read_short();
		result.granularity=in.read_string();
		result.tcaTypeValues = org.omg.zx.performance.PMThresholdValueList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.performance.TCAParameters_T s)
	{
		out.write_short(s.layerRate);
		out.write_string(s.granularity);
		org.omg.zx.performance.PMThresholdValueList_THelper.write(out,s.tcaTypeValues);
	}
}
