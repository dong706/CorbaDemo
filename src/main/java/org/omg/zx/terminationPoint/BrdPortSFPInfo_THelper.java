package org.omg.zx.terminationPoint;


/**
 *	Generated from IDL definition of struct "BrdPortSFPInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class BrdPortSFPInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.terminationPoint.BrdPortSFPInfo_THelper.id(),"BrdPortSFPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("brdPortName", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("optiModuleType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("optiModuleTypeValue", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("productTime", org.omg.zx.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("productNo", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("optiModuleDetailInfo", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.terminationPoint.BrdPortSFPInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.terminationPoint.BrdPortSFPInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/BrdPortSFPInfo_T:1.0";
	}
	public static org.omg.zx.terminationPoint.BrdPortSFPInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.terminationPoint.BrdPortSFPInfo_T result = new org.omg.zx.terminationPoint.BrdPortSFPInfo_T();
		result.brdPortName = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.optiModuleType=in.read_string();
		result.optiModuleTypeValue=in.read_string();
		result.productTime=in.read_string();
		result.productNo=in.read_long();
		result.optiModuleDetailInfo=in.read_string();
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.terminationPoint.BrdPortSFPInfo_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.brdPortName);
		out.write_string(s.optiModuleType);
		out.write_string(s.optiModuleTypeValue);
		out.write_string(s.productTime);
		out.write_long(s.productNo);
		out.write_string(s.optiModuleDetailInfo);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
