package org.omg.hw.protection;


/**
 *	Generated from IDL definition of struct "IFSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class IFSwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.protection.IFSwitchData_THelper.id(),"IFSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("protectionGroupType", org.omg.hw.protection.ProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("switchReason", org.omg.hw.protection.SwitchReason_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.omg.hw.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("groupName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectedTPList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("switchToTPList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.protection.IFSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.protection.IFSwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/IFSwitchData_T:1.0";
	}
	public static org.omg.hw.protection.IFSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.protection.IFSwitchData_T result = new org.omg.hw.protection.IFSwitchData_T();
		result.protectionGroupType=org.omg.hw.protection.ProtectionGroupType_THelper.read(in);
		result.switchReason=org.omg.hw.protection.SwitchReason_THelper.read(in);
		result.layerRate=in.read_short();
		result.groupName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.protectedTPList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.switchToTPList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.protection.IFSwitchData_T s)
	{
		org.omg.hw.protection.ProtectionGroupType_THelper.write(out,s.protectionGroupType);
		org.omg.hw.protection.SwitchReason_THelper.write(out,s.switchReason);
		out.write_short(s.layerRate);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.groupName);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.protectedTPList);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.switchToTPList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
