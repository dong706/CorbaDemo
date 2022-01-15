package org.omg.hw.multiLayerSubnetwork;


/**
 *	Generated from IDL definition of struct "RouteAndTopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndTopologicalLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_THelper.id(),"RouteAndTopologicalLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sncName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("route", org.omg.hw.subnetworkConnection.Route_THelper.type(), null),new org.omg.CORBA.StructMember("topologicalLinkList", org.omg.hw.topologicalLink.TopologicalLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/RouteAndTopologicalLink_T:1.0";
	}
	public static org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T result = new org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T();
		result.sncName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.route = org.omg.hw.subnetworkConnection.Route_THelper.read(in);
		result.topologicalLinkList = org.omg.hw.topologicalLink.TopologicalLinkList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.sncName);
		org.omg.hw.subnetworkConnection.Route_THelper.write(out,s.route);
		org.omg.hw.topologicalLink.TopologicalLinkList_THelper.write(out,s.topologicalLinkList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
