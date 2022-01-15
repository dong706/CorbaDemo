package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "SelfLearningMACAddress_T"
 *	@author JacORB IDL compiler 
 */

public final class SelfLearningMACAddress_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.SelfLearningMACAddress_THelper.id(),"SelfLearningMACAddress_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("macType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("macAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("peVID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ceVID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("tpName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/SelfLearningMACAddress_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T result = new org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T();
		result.macType=in.read_string();
		result.macAddress=in.read_string();
		result.peVID=in.read_string();
		result.ceVID=in.read_string();
		result.tpName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T s)
	{
		out.write_string(s.macType);
		out.write_string(s.macAddress);
		out.write_string(s.peVID);
		out.write_string(s.ceVID);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.tpName);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
