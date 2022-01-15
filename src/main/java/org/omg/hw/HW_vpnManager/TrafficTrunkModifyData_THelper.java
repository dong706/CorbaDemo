package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "TrafficTrunkModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficTrunkModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_THelper.id(),"TrafficTrunkModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.hw.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rerouteAllowed", org.omg.hw.subnetworkConnection.Reroute_THelper.type(), null),new org.omg.CORBA.StructMember("networkRouted", org.omg.hw.subnetworkConnection.NetworkRouted_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("addedOrNewRoute", org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.type(), null),new org.omg.CORBA.StructMember("removedRoute", org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpInclusions", org.omg.hw.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.omg.hw.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/TrafficTrunkModifyData_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T result = new org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.direction=org.omg.hw.globaldefs.ConnectionDirection_THelper.read(in);
		result.rerouteAllowed=org.omg.hw.subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=org.omg.hw.subnetworkConnection.NetworkRouted_THelper.read(in);
		result.transmissionParams=org.omg.hw.transmissionParameters.LayeredParameters_THelper.read(in);
		result.addedOrNewRoute = org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(in);
		result.removedRoute = org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(in);
		result.neTpInclusions = org.omg.hw.subnetworkConnection.ResourceList_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.neTpSncExclusions = org.omg.hw.subnetworkConnection.ResourceList_THelper.read(in);
		result.aEnd = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		org.omg.hw.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.omg.hw.subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		org.omg.hw.subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		org.omg.hw.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(out,s.addedOrNewRoute);
		org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(out,s.removedRoute);
		org.omg.hw.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		out.write_boolean(s.fullRoute);
		org.omg.hw.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
