package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "RouteAndRouteType_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndRouteType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T value;

	public RouteAndRouteType_THolder ()
	{
	}
	public RouteAndRouteType_THolder(final org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_THelper.write(_out, value);
	}
}
