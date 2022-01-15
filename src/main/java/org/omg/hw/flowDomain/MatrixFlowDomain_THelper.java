package org.omg.hw.flowDomain;


/**
 *	Generated from IDL definition of struct "MatrixFlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomain_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.flowDomain.MatrixFlowDomain_THelper.id(),"MatrixFlowDomain_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("assignedCPTPs", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("transmissionDescriptorName", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionDescriptorState", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.flowDomain.MatrixFlowDomain_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.flowDomain.MatrixFlowDomain_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/MatrixFlowDomain_T:1.0";
	}
	public static org.omg.hw.flowDomain.MatrixFlowDomain_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.flowDomain.MatrixFlowDomain_T result = new org.omg.hw.flowDomain.MatrixFlowDomain_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.transmissionParams = org.omg.hw.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.networkAccessDomain=in.read_string();
		result.assignedCPTPs = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.flexible=in.read_boolean();
		result.transmissionDescriptorName = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.transmissionDescriptorState=in.read_string();
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.flowDomain.MatrixFlowDomain_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		out.write_string(s.networkAccessDomain);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.assignedCPTPs);
		out.write_boolean(s.flexible);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.transmissionDescriptorName);
		out.write_string(s.transmissionDescriptorState);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
