package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of alias "RoutePerRouteType_T"
 *	@author JacORB IDL compiler 
 */

public final class RoutePerRouteType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T[] value;

	public RoutePerRouteType_THolder ()
	{
	}
	public RoutePerRouteType_THolder (final org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RoutePerRouteType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RoutePerRouteType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RoutePerRouteType_THelper.write (out,value);
	}
}
