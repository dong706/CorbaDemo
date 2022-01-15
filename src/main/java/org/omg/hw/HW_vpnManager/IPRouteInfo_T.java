package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "IPRouteInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class IPRouteInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IPRouteInfo_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName;
	public org.omg.hw.HW_vpnManager.IPCrossConnection_T[] route;
	public IPRouteInfo_T(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.IPCrossConnection_T[] route)
	{
		this.trafficTrunkName = trafficTrunkName;
		this.route = route;
	}
}
