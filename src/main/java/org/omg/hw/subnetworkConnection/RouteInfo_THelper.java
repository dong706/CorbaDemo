package org.omg.hw.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "RouteInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.subnetworkConnection.RouteInfo_THelper.id(),"RouteInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sncName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("route", org.omg.hw.subnetworkConnection.Route_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.subnetworkConnection.RouteInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.subnetworkConnection.RouteInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/RouteInfo_T:1.0";
	}
	public static org.omg.hw.subnetworkConnection.RouteInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.subnetworkConnection.RouteInfo_T result = new org.omg.hw.subnetworkConnection.RouteInfo_T();
		result.sncName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.route = org.omg.hw.subnetworkConnection.Route_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.subnetworkConnection.RouteInfo_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.sncName);
		org.omg.hw.subnetworkConnection.Route_THelper.write(out,s.route);
	}
}
