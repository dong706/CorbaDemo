package org.omg.hw.TopoManagementManager;


/**
 *	Generated from IDL definition of struct "Node_T"
 *	@author JacORB IDL compiler 
 */

public final class Node_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.TopoManagementManager.Node_THelper.id(),"Node_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nodeType", org.omg.hw.TopoManagementManager.NodeType_THelper.type(), null),new org.omg.CORBA.StructMember("position", org.omg.hw.TopoManagementManager.Position_THelper.type(), null),new org.omg.CORBA.StructMember("parent", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.TopoManagementManager.Node_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.TopoManagementManager.Node_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/TopoManagementManager/Node_T:1.0";
	}
	public static org.omg.hw.TopoManagementManager.Node_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.TopoManagementManager.Node_T result = new org.omg.hw.TopoManagementManager.Node_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.nativeEMSName=in.read_string();
		result.nodeType=org.omg.hw.TopoManagementManager.NodeType_THelper.read(in);
		result.position=org.omg.hw.TopoManagementManager.Position_THelper.read(in);
		result.parent = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.TopoManagementManager.Node_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.nativeEMSName);
		org.omg.hw.TopoManagementManager.NodeType_THelper.write(out,s.nodeType);
		org.omg.hw.TopoManagementManager.Position_THelper.write(out,s.position);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.parent);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
