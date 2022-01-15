package org.omg.hw.flowDomainFragment_cmcc;


/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_THelper.id(),"FDFrCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.hw.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("administrativeState", org.omg.hw.performance.AdministrativeState_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("fdfrType", org.omg.hw.flowDomainFragment_cmcc.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomainFragment_cmcc/FDFrCreateData_T:1.0";
	}
	public static org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T result = new org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.direction=org.omg.hw.globaldefs.ConnectionDirection_THelper.read(in);
		result.administrativeState=org.omg.hw.performance.AdministrativeState_THelper.read(in);
		result.transmissionParams=org.omg.hw.transmissionParameters.LayeredParameters_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.fdfrType=in.read_string();
		result.additionalCreationInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		org.omg.hw.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.omg.hw.performance.AdministrativeState_THelper.write(out,s.administrativeState);
		org.omg.hw.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		out.write_boolean(s.fullRoute);
		out.write_string(s.fdfrType);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
