package org.omg.hw.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "RouteDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteDescriptor_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.subnetworkConnection.RouteDescriptor_THelper.id(),"RouteDescriptor_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("intended", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("actualState", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("administrativeState", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("inUseBy", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("exclusive", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("routeXCs", org.omg.hw.subnetworkConnection.Route_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.subnetworkConnection.RouteDescriptor_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.subnetworkConnection.RouteDescriptor_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/RouteDescriptor_T:1.0";
	}
	public static org.omg.hw.subnetworkConnection.RouteDescriptor_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.subnetworkConnection.RouteDescriptor_T result = new org.omg.hw.subnetworkConnection.RouteDescriptor_T();
		result.id=in.read_string();
		result.intended=in.read_string();
		result.actualState=in.read_string();
		result.administrativeState=in.read_string();
		result.inUseBy=in.read_string();
		result.exclusive=in.read_string();
		result.routeXCs = org.omg.hw.subnetworkConnection.Route_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.subnetworkConnection.RouteDescriptor_T s)
	{
		out.write_string(s.id);
		out.write_string(s.intended);
		out.write_string(s.actualState);
		out.write_string(s.administrativeState);
		out.write_string(s.inUseBy);
		out.write_string(s.exclusive);
		org.omg.hw.subnetworkConnection.Route_THelper.write(out,s.routeXCs);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
