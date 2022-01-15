package org.omg.zx.mLSNPP;


/**
 *	Generated from IDL definition of struct "SNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.mLSNPP.SNPP_THelper.id(),"SNPP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sNPPId", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sNPList", org.omg.zx.mLSNPP.SNPList_THelper.type(), null),new org.omg.CORBA.StructMember("tNAName", org.omg.zx.mLSNPP.TNAName_THelper.type(), null),new org.omg.CORBA.StructMember("groupTNAName", org.omg.zx.mLSNPP.TNAName_THelper.type(), null),new org.omg.CORBA.StructMember("rAId", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.mLSNPP.SNPP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.mLSNPP.SNPP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/SNPP_T:1.0";
	}
	public static org.omg.zx.mLSNPP.SNPP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.mLSNPP.SNPP_T result = new org.omg.zx.mLSNPP.SNPP_T();
		result.sNPPId=in.read_string();
		result.sNPList = org.omg.zx.mLSNPP.SNPList_THelper.read(in);
		result.tNAName=in.read_string();
		result.groupTNAName=in.read_string();
		result.rAId=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.mLSNPP.SNPP_T s)
	{
		out.write_string(s.sNPPId);
		org.omg.zx.mLSNPP.SNPList_THelper.write(out,s.sNPList);
		out.write_string(s.tNAName);
		out.write_string(s.groupTNAName);
		out.write_string(s.rAId);
	}
}
