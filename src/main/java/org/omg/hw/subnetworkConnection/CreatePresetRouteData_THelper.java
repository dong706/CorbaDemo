package org.omg.hw.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "CreatePresetRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreatePresetRouteData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.subnetworkConnection.CreatePresetRouteData_THelper.id(),"CreatePresetRouteData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sncName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("presetRouteID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("priority", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("neTpInclusions", org.omg.hw.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.omg.hw.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.subnetworkConnection.CreatePresetRouteData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.subnetworkConnection.CreatePresetRouteData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/CreatePresetRouteData_T:1.0";
	}
	public static org.omg.hw.subnetworkConnection.CreatePresetRouteData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.subnetworkConnection.CreatePresetRouteData_T result = new org.omg.hw.subnetworkConnection.CreatePresetRouteData_T();
		result.sncName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.presetRouteID=in.read_ulong();
		result.priority=in.read_ulong();
		result.neTpInclusions = org.omg.hw.subnetworkConnection.ResourceList_THelper.read(in);
		result.neTpSncExclusions = org.omg.hw.subnetworkConnection.ResourceList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.subnetworkConnection.CreatePresetRouteData_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.sncName);
		out.write_ulong(s.presetRouteID);
		out.write_ulong(s.priority);
		org.omg.hw.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		org.omg.hw.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
