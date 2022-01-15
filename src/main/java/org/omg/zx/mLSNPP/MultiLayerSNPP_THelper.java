package org.omg.zx.mLSNPP;


/**
 *	Generated from IDL definition of struct "MultiLayerSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.mLSNPP.MultiLayerSNPP_THelper.id(),"MultiLayerSNPP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.zx.terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("layeredSNPPList", org.omg.zx.mLSNPP.LayeredSNPPList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.mLSNPP.MultiLayerSNPP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.mLSNPP.MultiLayerSNPP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/MultiLayerSNPP_T:1.0";
	}
	public static org.omg.zx.mLSNPP.MultiLayerSNPP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.mLSNPP.MultiLayerSNPP_T result = new org.omg.zx.mLSNPP.MultiLayerSNPP_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=org.omg.zx.terminationPoint.Directionality_THelper.read(in);
		result.layeredSNPPList = org.omg.zx.mLSNPP.LayeredSNPPList_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.mLSNPP.MultiLayerSNPP_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.zx.terminationPoint.Directionality_THelper.write(out,s.direction);
		org.omg.zx.mLSNPP.LayeredSNPPList_THelper.write(out,s.layeredSNPPList);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
