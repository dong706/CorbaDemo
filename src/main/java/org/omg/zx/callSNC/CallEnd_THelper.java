package org.omg.zx.callSNC;


/**
 *	Generated from IDL definition of struct "CallEnd_T"
 *	@author JacORB IDL compiler 
 */

public final class CallEnd_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.callSNC.CallEnd_THelper.id(),"CallEnd_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tNANameOrGroupTNAName", org.omg.zx.mLSNPP.TNAName_THelper.type(), null),new org.omg.CORBA.StructMember("sNPPid", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sNPid", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("tpName", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.callSNC.CallEnd_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.callSNC.CallEnd_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/CallEnd_T:1.0";
	}
	public static org.omg.zx.callSNC.CallEnd_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.callSNC.CallEnd_T result = new org.omg.zx.callSNC.CallEnd_T();
		result.tNANameOrGroupTNAName=in.read_string();
		result.sNPPid=in.read_string();
		result.sNPid=in.read_string();
		result.tpName = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.callSNC.CallEnd_T s)
	{
		out.write_string(s.tNANameOrGroupTNAName);
		out.write_string(s.sNPPid);
		out.write_string(s.sNPid);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.tpName);
	}
}
