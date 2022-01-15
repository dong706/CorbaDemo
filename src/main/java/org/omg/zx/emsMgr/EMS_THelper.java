package org.omg.zx.emsMgr;


/**
 *	Generated from IDL definition of struct "EMS_T"
 *	@author JacORB IDL compiler 
 */

public final class EMS_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.emsMgr.EMS_THelper.id(),"EMS_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("location", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("emsVersion", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("emsType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vendorName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("netAddress", org.omg.zx.managedElement.NetAddress_THelper.type(), null),new org.omg.CORBA.StructMember("alarmState", org.omg.zx.alarmMgr.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.emsMgr.EMS_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.emsMgr.EMS_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/EMS_T:1.0";
	}
	public static org.omg.zx.emsMgr.EMS_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.emsMgr.EMS_T result = new org.omg.zx.emsMgr.EMS_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.location=in.read_string();
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.emsVersion=in.read_string();
		result.emsType=in.read_string();
		result.vendorName=in.read_string();
		result.netAddress=org.omg.zx.managedElement.NetAddress_THelper.read(in);
		result.alarmState=org.omg.zx.alarmMgr.PerceivedSeverity_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.emsMgr.EMS_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.location);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.emsVersion);
		out.write_string(s.emsType);
		out.write_string(s.vendorName);
		org.omg.zx.managedElement.NetAddress_THelper.write(out,s.netAddress);
		org.omg.zx.alarmMgr.PerceivedSeverity_THelper.write(out,s.alarmState);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
