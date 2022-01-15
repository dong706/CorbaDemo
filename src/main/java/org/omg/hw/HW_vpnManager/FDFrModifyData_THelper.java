package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.FDFrModifyData_THelper.id(),"FDFrModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("multipointServiceAttr", org.omg.hw.HW_vpnManager.MultipointServiceAttr_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.FDFrModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.FDFrModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/FDFrModifyData_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.FDFrModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.FDFrModifyData_T result = new org.omg.hw.HW_vpnManager.FDFrModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.multipointServiceAttr=org.omg.hw.HW_vpnManager.MultipointServiceAttr_THelper.read(in);
		result.transmissionParams=org.omg.hw.transmissionParameters.LayeredParameters_THelper.read(in);
		result.aEnd = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.FDFrModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		org.omg.hw.HW_vpnManager.MultipointServiceAttr_THelper.write(out,s.multipointServiceAttr);
		org.omg.hw.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
