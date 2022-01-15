package org.omg.hw.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "SNCModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.subnetworkConnection.SNCModifyData_THelper.id(),"SNCModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.hw.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("modifyType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("retainOldSNC", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("modifyServers_allowed", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("staticProtectionLevel", org.omg.hw.subnetworkConnection.StaticProtectionLevel_THelper.type(), null),new org.omg.CORBA.StructMember("protectionEffort", org.omg.hw.subnetworkConnection.ProtectionEffort_THelper.type(), null),new org.omg.CORBA.StructMember("rerouteAllowed", org.omg.hw.subnetworkConnection.Reroute_THelper.type(), null),new org.omg.CORBA.StructMember("networkRouted", org.omg.hw.subnetworkConnection.NetworkRouted_THelper.type(), null),new org.omg.CORBA.StructMember("sncType", org.omg.hw.subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.omg.hw.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("addedOrNewRoute", org.omg.hw.subnetworkConnection.RouteList_THelper.type(), null),new org.omg.CORBA.StructMember("removedRoute", org.omg.hw.subnetworkConnection.RouteList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpInclusions", org.omg.hw.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.omg.hw.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.subnetworkConnection.SNCModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.subnetworkConnection.SNCModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SNCModifyData_T:1.0";
	}
	public static org.omg.hw.subnetworkConnection.SNCModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.subnetworkConnection.SNCModifyData_T result = new org.omg.hw.subnetworkConnection.SNCModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.direction=org.omg.hw.globaldefs.ConnectionDirection_THelper.read(in);
		result.modifyType=in.read_string();
		result.retainOldSNC=in.read_boolean();
		result.modifyServers_allowed=in.read_boolean();
		result.staticProtectionLevel=org.omg.hw.subnetworkConnection.StaticProtectionLevel_THelper.read(in);
		result.protectionEffort=org.omg.hw.subnetworkConnection.ProtectionEffort_THelper.read(in);
		result.rerouteAllowed=org.omg.hw.subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=org.omg.hw.subnetworkConnection.NetworkRouted_THelper.read(in);
		result.sncType=org.omg.hw.subnetworkConnection.SNCType_THelper.read(in);
		result.layerRate=in.read_short();
		result.addedOrNewRoute = org.omg.hw.subnetworkConnection.RouteList_THelper.read(in);
		result.removedRoute = org.omg.hw.subnetworkConnection.RouteList_THelper.read(in);
		result.neTpInclusions = org.omg.hw.subnetworkConnection.ResourceList_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.neTpSncExclusions = org.omg.hw.subnetworkConnection.ResourceList_THelper.read(in);
		result.aEnd = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.zEnd = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalCreationInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.subnetworkConnection.SNCModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		org.omg.hw.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		out.write_string(s.modifyType);
		out.write_boolean(s.retainOldSNC);
		out.write_boolean(s.modifyServers_allowed);
		org.omg.hw.subnetworkConnection.StaticProtectionLevel_THelper.write(out,s.staticProtectionLevel);
		org.omg.hw.subnetworkConnection.ProtectionEffort_THelper.write(out,s.protectionEffort);
		org.omg.hw.subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		org.omg.hw.subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		org.omg.hw.subnetworkConnection.SNCType_THelper.write(out,s.sncType);
		out.write_short(s.layerRate);
		org.omg.hw.subnetworkConnection.RouteList_THelper.write(out,s.addedOrNewRoute);
		org.omg.hw.subnetworkConnection.RouteList_THelper.write(out,s.removedRoute);
		org.omg.hw.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		out.write_boolean(s.fullRoute);
		org.omg.hw.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.aEnd);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.zEnd);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
