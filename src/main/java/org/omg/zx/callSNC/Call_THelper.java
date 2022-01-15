package org.omg.zx.callSNC;


/**
 *	Generated from IDL definition of struct "Call_T"
 *	@author JacORB IDL compiler 
 */

public final class Call_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.callSNC.Call_THelper.id(),"Call_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("callName", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("callId", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("callState", org.omg.zx.callSNC.CallState_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.omg.zx.callSNC.CallEnd_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.omg.zx.callSNC.CallEnd_THelper.type(), null),new org.omg.CORBA.StructMember("callParameters", org.omg.zx.callSNC.CallParameterProfile_THelper.type(), null),new org.omg.CORBA.StructMember("callDiversity", org.omg.zx.callSNC.Diversity_THelper.type(), null),new org.omg.CORBA.StructMember("diversitySynthesis", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("linkDiversityViolations", org.omg.zx.callSNC.DiversityInfo_THelper.type(), null),new org.omg.CORBA.StructMember("nodeDiversityViolations", org.omg.zx.callSNC.DiversityInfo_THelper.type(), null),new org.omg.CORBA.StructMember("linkPartialDiversityList", org.omg.zx.callSNC.DiversityInfoList_THelper.type(), null),new org.omg.CORBA.StructMember("nodePartialDiversityList", org.omg.zx.callSNC.DiversityInfoList_THelper.type(), null),new org.omg.CORBA.StructMember("callAdditionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.callSNC.Call_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.callSNC.Call_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/Call_T:1.0";
	}
	public static org.omg.zx.callSNC.Call_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.callSNC.Call_T result = new org.omg.zx.callSNC.Call_T();
		result.callName = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.nativeEMSName=in.read_string();
		result.callId=in.read_string();
		result.callState=in.read_string();
		result.aEnd=org.omg.zx.callSNC.CallEnd_THelper.read(in);
		result.zEnd=org.omg.zx.callSNC.CallEnd_THelper.read(in);
		result.callParameters=org.omg.zx.callSNC.CallParameterProfile_THelper.read(in);
		result.callDiversity=org.omg.zx.callSNC.Diversity_THelper.read(in);
		result.diversitySynthesis=in.read_string();
		result.linkDiversityViolations=org.omg.zx.callSNC.DiversityInfo_THelper.read(in);
		result.nodeDiversityViolations=org.omg.zx.callSNC.DiversityInfo_THelper.read(in);
		result.linkPartialDiversityList = org.omg.zx.callSNC.DiversityInfoList_THelper.read(in);
		result.nodePartialDiversityList = org.omg.zx.callSNC.DiversityInfoList_THelper.read(in);
		result.callAdditionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.callSNC.Call_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.callName);
		out.write_string(s.userLabel);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		out.write_string(s.nativeEMSName);
		out.write_string(s.callId);
		out.write_string(s.callState);
		org.omg.zx.callSNC.CallEnd_THelper.write(out,s.aEnd);
		org.omg.zx.callSNC.CallEnd_THelper.write(out,s.zEnd);
		org.omg.zx.callSNC.CallParameterProfile_THelper.write(out,s.callParameters);
		org.omg.zx.callSNC.Diversity_THelper.write(out,s.callDiversity);
		out.write_string(s.diversitySynthesis);
		org.omg.zx.callSNC.DiversityInfo_THelper.write(out,s.linkDiversityViolations);
		org.omg.zx.callSNC.DiversityInfo_THelper.write(out,s.nodeDiversityViolations);
		org.omg.zx.callSNC.DiversityInfoList_THelper.write(out,s.linkPartialDiversityList);
		org.omg.zx.callSNC.DiversityInfoList_THelper.write(out,s.nodePartialDiversityList);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.callAdditionalInfo);
	}
}
