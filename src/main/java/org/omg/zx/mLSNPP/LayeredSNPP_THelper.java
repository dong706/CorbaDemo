package org.omg.zx.mLSNPP;


/**
 *	Generated from IDL definition of struct "LayeredSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.mLSNPP.LayeredSNPP_THelper.id(),"LayeredSNPP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", org.omg.zx.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("SNPPList", org.omg.zx.mLSNPP.SNPPList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.mLSNPP.LayeredSNPP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.mLSNPP.LayeredSNPP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/LayeredSNPP_T:1.0";
	}
	public static org.omg.zx.mLSNPP.LayeredSNPP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.mLSNPP.LayeredSNPP_T result = new org.omg.zx.mLSNPP.LayeredSNPP_T();
		result.layerRate=in.read_short();
		result.SNPPList = org.omg.zx.mLSNPP.SNPPList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.mLSNPP.LayeredSNPP_T s)
	{
		out.write_short(s.layerRate);
		org.omg.zx.mLSNPP.SNPPList_THelper.write(out,s.SNPPList);
	}
}
