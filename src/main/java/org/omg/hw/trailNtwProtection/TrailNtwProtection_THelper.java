package org.omg.hw.trailNtwProtection;


/**
 *	Generated from IDL definition of struct "TrailNtwProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.trailNtwProtection.TrailNtwProtection_THelper.id(),"TrailNtwProtection_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", org.omg.hw.protection.ProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("protectionSchemeState", org.omg.hw.protection.ProtectionSchemeState_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.hw.protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("rate", org.omg.hw.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("trailNtwProtectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupAName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectionGroupZName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("pgATPList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pgZTPList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("workerTrailList", org.omg.hw.globaldefs.NamingAttributesMultipleList_THelper.type(), null),new org.omg.CORBA.StructMember("protectionTrail", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("tnpParameters", org.omg.hw.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("apsFunction", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.trailNtwProtection.TrailNtwProtection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.trailNtwProtection.TrailNtwProtection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/trailNtwProtection/TrailNtwProtection_T:1.0";
	}
	public static org.omg.hw.trailNtwProtection.TrailNtwProtection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.trailNtwProtection.TrailNtwProtection_T result = new org.omg.hw.trailNtwProtection.TrailNtwProtection_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionGroupType=org.omg.hw.protection.ProtectionGroupType_THelper.read(in);
		result.protectionSchemeState=org.omg.hw.protection.ProtectionSchemeState_THelper.read(in);
		result.reversionMode=org.omg.hw.protection.ReversionMode_THelper.read(in);
		result.rate=in.read_short();
		result.trailNtwProtectionType=in.read_string();
		result.protectionGroupAName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.protectionGroupZName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.pgATPList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.pgZTPList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.workerTrailList = org.omg.hw.globaldefs.NamingAttributesMultipleList_THelper.read(in);
		result.protectionTrail = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.tnpParameters = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.apsFunction=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.trailNtwProtection.TrailNtwProtection_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.hw.protection.ProtectionGroupType_THelper.write(out,s.protectionGroupType);
		org.omg.hw.protection.ProtectionSchemeState_THelper.write(out,s.protectionSchemeState);
		org.omg.hw.protection.ReversionMode_THelper.write(out,s.reversionMode);
		out.write_short(s.rate);
		out.write_string(s.trailNtwProtectionType);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.protectionGroupAName);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.protectionGroupZName);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.pgATPList);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.pgZTPList);
		org.omg.hw.globaldefs.NamingAttributesMultipleList_THelper.write(out,s.workerTrailList);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.protectionTrail);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.tnpParameters);
		out.write_string(s.apsFunction);
		out.write_string(s.networkAccessDomain);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
