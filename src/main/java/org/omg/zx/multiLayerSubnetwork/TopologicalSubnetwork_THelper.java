package org.omg.zx.multiLayerSubnetwork;


/**
 *	Generated from IDL definition of struct "TopologicalSubnetwork_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalSubnetwork_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THelper.id(),"TopologicalSubnetwork_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ifTopLevel", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("includingMemberNameList", org.omg.zx.multiLayerSubnetwork.TopoMemberList_THelper.type(), null),new org.omg.CORBA.StructMember("coordinate", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/TopologicalSubnetwork_T:1.0";
	}
	public static org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T result = new org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.ifTopLevel=in.read_boolean();
		result.includingMemberNameList = org.omg.zx.multiLayerSubnetwork.TopoMemberList_THelper.read(in);
		result.coordinate=in.read_string();
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_boolean(s.ifTopLevel);
		org.omg.zx.multiLayerSubnetwork.TopoMemberList_THelper.write(out,s.includingMemberNameList);
		out.write_string(s.coordinate);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
