package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "RouteAndRouteType_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndRouteType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteAndRouteType_T(){}
	public java.lang.String[] rAIDList;
	public java.lang.String routeType;
	public java.lang.String RouteDescription = "";
	public RouteAndRouteType_T(java.lang.String[] rAIDList, java.lang.String routeType, java.lang.String RouteDescription)
	{
		this.rAIDList = rAIDList;
		this.routeType = routeType;
		this.RouteDescription = RouteDescription;
	}
}
