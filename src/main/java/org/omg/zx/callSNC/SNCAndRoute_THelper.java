package org.omg.zx.callSNC;


/**
 *	Generated from IDL definition of struct "SNCAndRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRoute_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.callSNC.SNCAndRoute_THelper.id(),"SNCAndRoute_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("connection", org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.type(), null),new org.omg.CORBA.StructMember("connectionRoutes", org.omg.zx.subnetworkConnection.RouteList_THelper.type(), null),new org.omg.CORBA.StructMember("edgeMLSNPPLinks", org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("internalMLSNPPLinks", org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("routeType", org.omg.zx.callSNC.RouteType_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.callSNC.SNCAndRoute_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.callSNC.SNCAndRoute_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/SNCAndRoute_T:1.0";
	}
	public static org.omg.zx.callSNC.SNCAndRoute_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.callSNC.SNCAndRoute_T result = new org.omg.zx.callSNC.SNCAndRoute_T();
		result.connection=org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.read(in);
		result.connectionRoutes = org.omg.zx.subnetworkConnection.RouteList_THelper.read(in);
		result.edgeMLSNPPLinks = org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.read(in);
		result.internalMLSNPPLinks = org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.read(in);
		result.routeType=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.callSNC.SNCAndRoute_T s)
	{
		org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.write(out,s.connection);
		org.omg.zx.subnetworkConnection.RouteList_THelper.write(out,s.connectionRoutes);
		org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(out,s.edgeMLSNPPLinks);
		org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(out,s.internalMLSNPPLinks);
		out.write_string(s.routeType);
	}
}
