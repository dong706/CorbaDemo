package org.omg.zx.callSNC;


/**
 *	Generated from IDL definition of struct "DiversityInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class DiversityInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.callSNC.DiversityInfo_THelper.id(),"DiversityInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sRGType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sharedResourceList", org.omg.zx.callSNC.SharedResourceList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.callSNC.DiversityInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.callSNC.DiversityInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/DiversityInfo_T:1.0";
	}
	public static org.omg.zx.callSNC.DiversityInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.callSNC.DiversityInfo_T result = new org.omg.zx.callSNC.DiversityInfo_T();
		result.sRGType=in.read_string();
		result.sharedResourceList = org.omg.zx.callSNC.SharedResourceList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.callSNC.DiversityInfo_T s)
	{
		out.write_string(s.sRGType);
		org.omg.zx.callSNC.SharedResourceList_THelper.write(out,s.sharedResourceList);
	}
}
