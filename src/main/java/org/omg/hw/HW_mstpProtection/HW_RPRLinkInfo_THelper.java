package org.omg.hw.HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_RPRLinkInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRLinkInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_THelper.id(),"HW_RPRLinkInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("nodeNo", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("rprLinkParameters", org.omg.hw.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_RPRLinkInfo_T:1.0";
	}
	public static org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_T result = new org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.nodeNo=in.read_ushort();
		result.rprLinkParameters = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_ushort(s.nodeNo);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.rprLinkParameters);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
