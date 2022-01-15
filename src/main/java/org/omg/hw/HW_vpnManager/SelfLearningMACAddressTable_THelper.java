package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL definition of struct "SelfLearningMACAddressTable_T"
 *	@author JacORB IDL compiler 
 */

public final class SelfLearningMACAddressTable_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_THelper.id(),"SelfLearningMACAddressTable_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("macAddressList", org.omg.hw.HW_vpnManager.SelfLearningMACAddressList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/SelfLearningMACAddressTable_T:1.0";
	}
	public static org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_T result = new org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.macAddressList = org.omg.hw.HW_vpnManager.SelfLearningMACAddressList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		org.omg.hw.HW_vpnManager.SelfLearningMACAddressList_THelper.write(out,s.macAddressList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
