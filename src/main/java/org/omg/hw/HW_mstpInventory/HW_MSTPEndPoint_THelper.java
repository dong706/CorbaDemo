package org.omg.hw.HW_mstpInventory;


/**
 *	Generated from IDL definition of struct "HW_MSTPEndPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPEndPoint_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THelper.id(),"HW_MSTPEndPoint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.hw.terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("type", org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPEndPoint_T:1.0";
	}
	public static org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_T result = new org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=org.omg.hw.terminationPoint.Directionality_THelper.read(in);
		result.type=org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_THelper.read(in);
		result.transmissionParams = org.omg.hw.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.hw.terminationPoint.Directionality_THelper.write(out,s.direction);
		org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_THelper.write(out,s.type);
		org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
