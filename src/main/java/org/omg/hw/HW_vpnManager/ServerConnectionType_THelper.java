package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "ServerConnectionType_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerConnectionType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.ServerConnectionType_THelper.id(),"ServerConnectionType_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("nameList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("channel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("usedAs", org.omg.hw.HW_vpnManager.UsedAsType_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.ServerConnectionType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.ServerConnectionType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/ServerConnectionType_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.ServerConnectionType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.ServerConnectionType_T result = new org.omg.hw.HW_vpnManager.ServerConnectionType_T();
		result.nameList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.channel=in.read_string();
		result.usedAs=org.omg.hw.HW_vpnManager.UsedAsType_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.ServerConnectionType_T s)
	{
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.nameList);
		out.write_string(s.channel);
		org.omg.hw.HW_vpnManager.UsedAsType_THelper.write(out,s.usedAs);
	}
}
