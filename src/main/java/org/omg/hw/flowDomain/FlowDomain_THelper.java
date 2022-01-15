package org.omg.hw.flowDomain;


/**
 *	Generated from IDL definition of struct "FlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomain_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.flowDomain.FlowDomain_THelper.id(),"FlowDomain_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("mfds", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("fdEdgeCPTPs", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("fdInternalCPTPs", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("fDConnectivityState", org.omg.hw.flowDomain.ConnectivityState_THelper.type(), null),new org.omg.CORBA.StructMember("fdType", org.omg.hw.flowDomain.FDType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.flowDomain.FlowDomain_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.flowDomain.FlowDomain_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/FlowDomain_T:1.0";
	}
	public static org.omg.hw.flowDomain.FlowDomain_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.flowDomain.FlowDomain_T result = new org.omg.hw.flowDomain.FlowDomain_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.transmissionParams = org.omg.hw.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.networkAccessDomain=in.read_string();
		result.mfds = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.fdEdgeCPTPs = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.fdInternalCPTPs = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.fDConnectivityState=org.omg.hw.flowDomain.ConnectivityState_THelper.read(in);
		result.fdType=in.read_string();
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.flowDomain.FlowDomain_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		out.write_string(s.networkAccessDomain);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.mfds);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.fdEdgeCPTPs);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.fdInternalCPTPs);
		org.omg.hw.flowDomain.ConnectivityState_THelper.write(out,s.fDConnectivityState);
		out.write_string(s.fdType);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
