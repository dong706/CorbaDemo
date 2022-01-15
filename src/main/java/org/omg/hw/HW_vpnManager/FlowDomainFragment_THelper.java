package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.id(),"FlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.hw.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("multipointServiceAttr", org.omg.hw.HW_vpnManager.MultipointServiceAttr_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("administrativeState", org.omg.hw.performance.AdministrativeState_THelper.type(), null),new org.omg.CORBA.StructMember("fdfrState", org.omg.hw.subnetworkConnection.SNCState_THelper.type(), null),new org.omg.CORBA.StructMember("fdfrType", org.omg.hw.HW_vpnManager.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.FlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.FlowDomainFragment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/FlowDomainFragment_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.FlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.FlowDomainFragment_T result = new org.omg.hw.HW_vpnManager.FlowDomainFragment_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=org.omg.hw.globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=org.omg.hw.transmissionParameters.LayeredParameters_THelper.read(in);
		result.multipointServiceAttr=org.omg.hw.HW_vpnManager.MultipointServiceAttr_THelper.read(in);
		result.aEnd = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.networkAccessDomain=in.read_string();
		result.flexible=in.read_boolean();
		result.administrativeState=org.omg.hw.performance.AdministrativeState_THelper.read(in);
		result.fdfrState=org.omg.hw.subnetworkConnection.SNCState_THelper.read(in);
		result.fdfrType=in.read_string();
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.FlowDomainFragment_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.hw.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.omg.hw.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		org.omg.hw.HW_vpnManager.MultipointServiceAttr_THelper.write(out,s.multipointServiceAttr);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		out.write_string(s.networkAccessDomain);
		out.write_boolean(s.flexible);
		org.omg.hw.performance.AdministrativeState_THelper.write(out,s.administrativeState);
		org.omg.hw.subnetworkConnection.SNCState_THelper.write(out,s.fdfrState);
		out.write_string(s.fdfrType);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
