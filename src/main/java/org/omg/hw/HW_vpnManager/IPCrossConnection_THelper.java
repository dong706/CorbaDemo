package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "IPCrossConnection_T"
 *	@author JacORB IDL compiler 
 */

public final class IPCrossConnection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.IPCrossConnection_THelper.id(),"IPCrossConnection_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("activeState", org.omg.hw.subnetworkConnection.SNCState_THelper.type(), null),new org.omg.CORBA.StructMember("administrativeState", org.omg.hw.performance.AdministrativeState_THelper.type(), null),new org.omg.CORBA.StructMember("direction", org.omg.hw.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("ccType", org.omg.hw.subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("aEndList", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEndList", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.IPCrossConnection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.IPCrossConnection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/IPCrossConnection_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.IPCrossConnection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.IPCrossConnection_T result = new org.omg.hw.HW_vpnManager.IPCrossConnection_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.nativeEMSName=in.read_string();
		result.userLabel=in.read_string();
		result.activeState=org.omg.hw.subnetworkConnection.SNCState_THelper.read(in);
		result.administrativeState=org.omg.hw.performance.AdministrativeState_THelper.read(in);
		result.direction=org.omg.hw.globaldefs.ConnectionDirection_THelper.read(in);
		result.ccType=org.omg.hw.subnetworkConnection.SNCType_THelper.read(in);
		result.transmissionParams=org.omg.hw.transmissionParameters.LayeredParameters_THelper.read(in);
		result.aEndList = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.zEndList = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.IPCrossConnection_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.nativeEMSName);
		out.write_string(s.userLabel);
		org.omg.hw.subnetworkConnection.SNCState_THelper.write(out,s.activeState);
		org.omg.hw.performance.AdministrativeState_THelper.write(out,s.administrativeState);
		org.omg.hw.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.omg.hw.subnetworkConnection.SNCType_THelper.write(out,s.ccType);
		org.omg.hw.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.aEndList);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.zEndList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
