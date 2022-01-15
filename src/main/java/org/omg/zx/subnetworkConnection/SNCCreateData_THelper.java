package org.omg.zx.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "SNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.subnetworkConnection.SNCCreateData_THelper.id(),"SNCCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.zx.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("staticProtectionLevel", org.omg.zx.subnetworkConnection.StaticProtectionLevel_THelper.type(), null),new org.omg.CORBA.StructMember("protectionEffort", org.omg.zx.subnetworkConnection.ProtectionEffort_THelper.type(), null),new org.omg.CORBA.StructMember("rerouteAllowed", org.omg.zx.subnetworkConnection.Reroute_THelper.type(), null),new org.omg.CORBA.StructMember("networkRouted", org.omg.zx.subnetworkConnection.NetworkRouted_THelper.type(), null),new org.omg.CORBA.StructMember("sncType", org.omg.zx.subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.omg.zx.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("ccInclusions", org.omg.zx.subnetworkConnection.CrossConnectList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpInclusions", org.omg.zx.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.omg.zx.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.subnetworkConnection.SNCCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.subnetworkConnection.SNCCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SNCCreateData_T:1.0";
	}
	public static org.omg.zx.subnetworkConnection.SNCCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.subnetworkConnection.SNCCreateData_T result = new org.omg.zx.subnetworkConnection.SNCCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.direction=org.omg.zx.globaldefs.ConnectionDirection_THelper.read(in);
		result.staticProtectionLevel=org.omg.zx.subnetworkConnection.StaticProtectionLevel_THelper.read(in);
		result.protectionEffort=org.omg.zx.subnetworkConnection.ProtectionEffort_THelper.read(in);
		result.rerouteAllowed=org.omg.zx.subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=org.omg.zx.subnetworkConnection.NetworkRouted_THelper.read(in);
		result.sncType=org.omg.zx.subnetworkConnection.SNCType_THelper.read(in);
		result.layerRate=in.read_short();
		result.ccInclusions = org.omg.zx.subnetworkConnection.CrossConnectList_THelper.read(in);
		result.neTpInclusions = org.omg.zx.subnetworkConnection.ResourceList_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.neTpSncExclusions = org.omg.zx.subnetworkConnection.ResourceList_THelper.read(in);
		result.aEnd = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		result.zEnd = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalCreationInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.subnetworkConnection.SNCCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		org.omg.zx.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.omg.zx.subnetworkConnection.StaticProtectionLevel_THelper.write(out,s.staticProtectionLevel);
		org.omg.zx.subnetworkConnection.ProtectionEffort_THelper.write(out,s.protectionEffort);
		org.omg.zx.subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		org.omg.zx.subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		org.omg.zx.subnetworkConnection.SNCType_THelper.write(out,s.sncType);
		out.write_short(s.layerRate);
		org.omg.zx.subnetworkConnection.CrossConnectList_THelper.write(out,s.ccInclusions);
		org.omg.zx.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		out.write_boolean(s.fullRoute);
		org.omg.zx.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.aEnd);
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.zEnd);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
