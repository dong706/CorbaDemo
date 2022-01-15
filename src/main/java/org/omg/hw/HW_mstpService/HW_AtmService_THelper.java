package org.omg.hw.HW_mstpService;


/**
 *	Generated from IDL definition of struct "HW_AtmService_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmService_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpService.HW_AtmService_THelper.id(),"HW_AtmService_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectType", org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.type(), null),new org.omg.CORBA.StructMember("serviceType", org.omg.hw.HW_mstpService.HW_AtmServiceType_THelper.type(), null),new org.omg.CORBA.StructMember("spreadType", org.omg.hw.HW_mstpService.HW_AtmServiceSpreadType_THelper.type(), null),new org.omg.CORBA.StructMember("protectRole", org.omg.hw.HW_mstpService.HW_AtmProtectRole_THelper.type(), null),new org.omg.CORBA.StructMember("activeState", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("aEndPoint", org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.type(), null),new org.omg.CORBA.StructMember("zEndPoint", org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpService.HW_AtmService_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpService.HW_AtmService_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_AtmService_T:1.0";
	}
	public static org.omg.hw.HW_mstpService.HW_AtmService_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpService.HW_AtmService_T result = new org.omg.hw.HW_mstpService.HW_AtmService_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectType=org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.read(in);
		result.serviceType=org.omg.hw.HW_mstpService.HW_AtmServiceType_THelper.read(in);
		result.spreadType=org.omg.hw.HW_mstpService.HW_AtmServiceSpreadType_THelper.read(in);
		result.protectRole=org.omg.hw.HW_mstpService.HW_AtmProtectRole_THelper.read(in);
		result.activeState=in.read_boolean();
		result.aEndPoint=org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.read(in);
		result.zEndPoint=org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpService.HW_AtmService_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.write(out,s.protectType);
		org.omg.hw.HW_mstpService.HW_AtmServiceType_THelper.write(out,s.serviceType);
		org.omg.hw.HW_mstpService.HW_AtmServiceSpreadType_THelper.write(out,s.spreadType);
		org.omg.hw.HW_mstpService.HW_AtmProtectRole_THelper.write(out,s.protectRole);
		out.write_boolean(s.activeState);
		org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.write(out,s.aEndPoint);
		org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.write(out,s.zEndPoint);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
