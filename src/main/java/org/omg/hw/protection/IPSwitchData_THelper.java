package org.omg.hw.protection;


/**
 *	Generated from IDL definition of struct "IPSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class IPSwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.protection.IPSwitchData_THelper.id(),"IPSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("protectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("switchReason", org.omg.hw.protection.SwitchReason_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.omg.hw.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("groupName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectedList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("switchToList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.protection.IPSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.protection.IPSwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/IPSwitchData_T:1.0";
	}
	public static org.omg.hw.protection.IPSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.protection.IPSwitchData_T result = new org.omg.hw.protection.IPSwitchData_T();
		result.protectionType=in.read_string();
		result.switchReason=org.omg.hw.protection.SwitchReason_THelper.read(in);
		result.layerRate=in.read_short();
		result.groupName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.protectedList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.switchToList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.protection.IPSwitchData_T s)
	{
		out.write_string(s.protectionType);
		org.omg.hw.protection.SwitchReason_THelper.write(out,s.switchReason);
		out.write_short(s.layerRate);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.groupName);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.protectedList);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.switchToList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
