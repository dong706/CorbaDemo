package org.omg.hw.HW_mstpService;


/**
 *	Generated from IDL definition of struct "HW_AtmServiceTP_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceTP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.id(),"HW_AtmServiceTP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("trafficDescriptorName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("bPC", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpService.HW_AtmServiceTP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpService.HW_AtmServiceTP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_AtmServiceTP_T:1.0";
	}
	public static org.omg.hw.HW_mstpService.HW_AtmServiceTP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpService.HW_AtmServiceTP_T result = new org.omg.hw.HW_mstpService.HW_AtmServiceTP_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.trafficDescriptorName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.bPC=in.read_boolean();
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpService.HW_AtmServiceTP_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.trafficDescriptorName);
		out.write_boolean(s.bPC);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
