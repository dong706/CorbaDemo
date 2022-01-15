package org.omg.hw.ipMgr;


/**
 *	Generated from IDL definition of struct "FRRProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class FRRProtection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.ipMgr.FRRProtection_THelper.id(),"FRRProtection_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("rate", org.omg.hw.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("tpList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("frrParameters", org.omg.hw.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("bindingObject", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.ipMgr.FRRProtection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.ipMgr.FRRProtection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/ipMgr/FRRProtection_T:1.0";
	}
	public static org.omg.hw.ipMgr.FRRProtection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.ipMgr.FRRProtection_T result = new org.omg.hw.ipMgr.FRRProtection_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionType=in.read_string();
		result.rate=in.read_short();
		result.tpList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.frrParameters = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.bindingObject = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.ipMgr.FRRProtection_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_string(s.protectionType);
		out.write_short(s.rate);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.tpList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.frrParameters);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.bindingObject);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
