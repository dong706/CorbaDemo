package org.omg.zx.mLSNPP;


/**
 *	Generated from IDL definition of struct "SNPTNAPair_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAPair_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.mLSNPP.SNPTNAPair_THelper.id(),"SNPTNAPair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("SNPId", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("tNAName", org.omg.zx.mLSNPP.TNAName_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.mLSNPP.SNPTNAPair_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.mLSNPP.SNPTNAPair_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/SNPTNAPair_T:1.0";
	}
	public static org.omg.zx.mLSNPP.SNPTNAPair_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.mLSNPP.SNPTNAPair_T result = new org.omg.zx.mLSNPP.SNPTNAPair_T();
		result.SNPId=in.read_string();
		result.tNAName=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.mLSNPP.SNPTNAPair_T s)
	{
		out.write_string(s.SNPId);
		out.write_string(s.tNAName);
	}
}
