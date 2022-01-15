package org.omg.hw.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "CreateSharedRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreateSharedRouteData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.subnetworkConnection.CreateSharedRouteData_THelper.id(),"CreateSharedRouteData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sncName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("sharedRouteID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("priority", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("neTpInclusions", org.omg.hw.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.omg.hw.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.subnetworkConnection.CreateSharedRouteData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.subnetworkConnection.CreateSharedRouteData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/CreateSharedRouteData_T:1.0";
	}
	public static org.omg.hw.subnetworkConnection.CreateSharedRouteData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.subnetworkConnection.CreateSharedRouteData_T result = new org.omg.hw.subnetworkConnection.CreateSharedRouteData_T();
		result.sncName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.sharedRouteID=in.read_ulong();
		result.priority=in.read_ulong();
		result.neTpInclusions = org.omg.hw.subnetworkConnection.ResourceList_THelper.read(in);
		result.neTpSncExclusions = org.omg.hw.subnetworkConnection.ResourceList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.subnetworkConnection.CreateSharedRouteData_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.sncName);
		out.write_ulong(s.sharedRouteID);
		out.write_ulong(s.priority);
		org.omg.hw.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		org.omg.hw.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
