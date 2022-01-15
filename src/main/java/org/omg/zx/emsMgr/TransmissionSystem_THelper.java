package org.omg.zx.emsMgr;


/**
 *	Generated from IDL definition of struct "TransmissionSystem_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionSystem_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.emsMgr.TransmissionSystem_THelper.id(),"TransmissionSystem_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vendorName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("workReceiveRouteList", org.omg.zx.emsMgr.TransmissionRouteList_THelper.type(), null),new org.omg.CORBA.StructMember("workSendRouteList", org.omg.zx.emsMgr.TransmissionRouteList_THelper.type(), null),new org.omg.CORBA.StructMember("protectionReceiveRouteList", org.omg.zx.emsMgr.TransmissionRouteList_THelper.type(), null),new org.omg.CORBA.StructMember("protectionworkSendRouteList", org.omg.zx.emsMgr.TransmissionRouteList_THelper.type(), null),new org.omg.CORBA.StructMember("capacity", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("includingTSList", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.emsMgr.TransmissionSystem_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.emsMgr.TransmissionSystem_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/TransmissionSystem_T:1.0";
	}
	public static org.omg.zx.emsMgr.TransmissionSystem_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.emsMgr.TransmissionSystem_T result = new org.omg.zx.emsMgr.TransmissionSystem_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.vendorName=in.read_string();
		result.protectionType=in.read_string();
		result.workReceiveRouteList = org.omg.zx.emsMgr.TransmissionRouteList_THelper.read(in);
		result.workSendRouteList = org.omg.zx.emsMgr.TransmissionRouteList_THelper.read(in);
		result.protectionReceiveRouteList = org.omg.zx.emsMgr.TransmissionRouteList_THelper.read(in);
		result.protectionworkSendRouteList = org.omg.zx.emsMgr.TransmissionRouteList_THelper.read(in);
		result.capacity=in.read_string();
		result.includingTSList = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.emsMgr.TransmissionSystem_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.vendorName);
		out.write_string(s.protectionType);
		org.omg.zx.emsMgr.TransmissionRouteList_THelper.write(out,s.workReceiveRouteList);
		org.omg.zx.emsMgr.TransmissionRouteList_THelper.write(out,s.workSendRouteList);
		org.omg.zx.emsMgr.TransmissionRouteList_THelper.write(out,s.protectionReceiveRouteList);
		org.omg.zx.emsMgr.TransmissionRouteList_THelper.write(out,s.protectionworkSendRouteList);
		out.write_string(s.capacity);
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.includingTSList);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
