package org.omg.zx.multiLayerSubnetwork;


/**
 *	Generated from IDL definition of struct "RouteAndRouteType_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndRouteType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_THelper.id(),"RouteAndRouteType_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("rAIDList", org.omg.zx.multiLayerSubnetwork.RAIDList_THelper.type(), null),new org.omg.CORBA.StructMember("routeType", org.omg.zx.callSNC.RouteType_THelper.type(), null),new org.omg.CORBA.StructMember("RouteDescription", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/RouteAndRouteType_T:1.0";
	}
	public static org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T result = new org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T();
		result.rAIDList = org.omg.zx.multiLayerSubnetwork.RAIDList_THelper.read(in);
		result.routeType=in.read_string();
		result.RouteDescription=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.multiLayerSubnetwork.RouteAndRouteType_T s)
	{
		org.omg.zx.multiLayerSubnetwork.RAIDList_THelper.write(out,s.rAIDList);
		out.write_string(s.routeType);
		out.write_string(s.RouteDescription);
	}
}
