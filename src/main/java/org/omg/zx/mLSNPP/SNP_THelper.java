package org.omg.zx.mLSNPP;


/**
 *	Generated from IDL definition of struct "SNP_T"
 *	@author JacORB IDL compiler 
 */

public final class SNP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.mLSNPP.SNP_THelper.id(),"SNP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sNPId", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("tPName", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("tNAName", org.omg.zx.mLSNPP.TNAName_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.mLSNPP.SNP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.mLSNPP.SNP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/SNP_T:1.0";
	}
	public static org.omg.zx.mLSNPP.SNP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.mLSNPP.SNP_T result = new org.omg.zx.mLSNPP.SNP_T();
		result.sNPId=in.read_string();
		result.tPName = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.tNAName=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.mLSNPP.SNP_T s)
	{
		out.write_string(s.sNPId);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.tPName);
		out.write_string(s.tNAName);
	}
}
