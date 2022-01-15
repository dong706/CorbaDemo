package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "IPRouteInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class IPRouteInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.IPRouteInfo_THelper.id(),"IPRouteInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("trafficTrunkName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("route", org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.IPRouteInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.IPRouteInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/IPRouteInfo_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.IPRouteInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.IPRouteInfo_T result = new org.omg.hw.HW_vpnManager.IPRouteInfo_T();
		result.trafficTrunkName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.route = org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.IPRouteInfo_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.trafficTrunkName);
		org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(out,s.route);
	}
}
