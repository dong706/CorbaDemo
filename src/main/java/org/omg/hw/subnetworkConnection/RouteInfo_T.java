package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteInfo_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] sncName;
	public org.omg.hw.subnetworkConnection.CrossConnect_T[] route;
	public RouteInfo_T(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.CrossConnect_T[] route)
	{
		this.sncName = sncName;
		this.route = route;
	}
}
