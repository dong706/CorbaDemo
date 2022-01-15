package org.omg.hw.HW_mstpService;


/**
 *	Generated from IDL definition of struct "HW_EthServiceCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpService.HW_EthServiceCreateData_THelper.id(),"HW_EthServiceCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serviceType", org.omg.hw.HW_mstpService.HW_EthServiceType_THelper.type(), null),new org.omg.CORBA.StructMember("direction", org.omg.hw.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("aEndPoint", org.omg.hw.HW_mstpService.HW_EthServiceTP_THelper.type(), null),new org.omg.CORBA.StructMember("zEndPoint", org.omg.hw.HW_mstpService.HW_EthServiceTP_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_EthServiceCreateData_T:1.0";
	}
	public static org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T result = new org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T();
		result.serviceType=org.omg.hw.HW_mstpService.HW_EthServiceType_THelper.read(in);
		result.direction=org.omg.hw.globaldefs.ConnectionDirection_THelper.read(in);
		result.aEndPoint=org.omg.hw.HW_mstpService.HW_EthServiceTP_THelper.read(in);
		result.zEndPoint=org.omg.hw.HW_mstpService.HW_EthServiceTP_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T s)
	{
		org.omg.hw.HW_mstpService.HW_EthServiceType_THelper.write(out,s.serviceType);
		org.omg.hw.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.omg.hw.HW_mstpService.HW_EthServiceTP_THelper.write(out,s.aEndPoint);
		org.omg.hw.HW_mstpService.HW_EthServiceTP_THelper.write(out,s.zEndPoint);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
