package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "SplitHorizonGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class SplitHorizonGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.SplitHorizonGroup_THelper.id(),"SplitHorizonGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("shgID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("shgMemberNameList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.SplitHorizonGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.SplitHorizonGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/SplitHorizonGroup_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.SplitHorizonGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.SplitHorizonGroup_T result = new org.omg.hw.HW_vpnManager.SplitHorizonGroup_T();
		result.shgID=in.read_ulong();
		result.shgMemberNameList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.SplitHorizonGroup_T s)
	{
		out.write_ulong(s.shgID);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.shgMemberNameList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
