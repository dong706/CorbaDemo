package org.omg.zx.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "SubnetworkConnection_T"
 *	@author JacORB IDL compiler 
 */

public final class SubnetworkConnection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.id(),"SubnetworkConnection_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sncState", org.omg.zx.subnetworkConnection.SNCState_THelper.type(), null),new org.omg.CORBA.StructMember("direction", org.omg.zx.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rate", org.omg.zx.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("staticProtectionLevel", org.omg.zx.subnetworkConnection.StaticProtectionLevel_THelper.type(), null),new org.omg.CORBA.StructMember("sncType", org.omg.zx.subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.omg.zx.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.omg.zx.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("rerouteAllowed", org.omg.zx.subnetworkConnection.Reroute_THelper.type(), null),new org.omg.CORBA.StructMember("networkRouted", org.omg.zx.subnetworkConnection.NetworkRouted_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.subnetworkConnection.SubnetworkConnection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.subnetworkConnection.SubnetworkConnection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SubnetworkConnection_T:1.0";
	}
	public static org.omg.zx.subnetworkConnection.SubnetworkConnection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.subnetworkConnection.SubnetworkConnection_T result = new org.omg.zx.subnetworkConnection.SubnetworkConnection_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.sncState=org.omg.zx.subnetworkConnection.SNCState_THelper.read(in);
		result.direction=org.omg.zx.globaldefs.ConnectionDirection_THelper.read(in);
		result.rate=in.read_short();
		result.staticProtectionLevel=org.omg.zx.subnetworkConnection.StaticProtectionLevel_THelper.read(in);
		result.sncType=org.omg.zx.subnetworkConnection.SNCType_THelper.read(in);
		result.aEnd = org.omg.zx.subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = org.omg.zx.subnetworkConnection.TPDataList_THelper.read(in);
		result.rerouteAllowed=org.omg.zx.subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=org.omg.zx.subnetworkConnection.NetworkRouted_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.subnetworkConnection.SubnetworkConnection_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.zx.subnetworkConnection.SNCState_THelper.write(out,s.sncState);
		org.omg.zx.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		out.write_short(s.rate);
		org.omg.zx.subnetworkConnection.StaticProtectionLevel_THelper.write(out,s.staticProtectionLevel);
		org.omg.zx.subnetworkConnection.SNCType_THelper.write(out,s.sncType);
		org.omg.zx.subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		org.omg.zx.subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		org.omg.zx.subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		org.omg.zx.subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
