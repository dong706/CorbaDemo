package org.omg.hw.HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_AtmServiceProtectPair_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceProtectPair_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_THelper.id(),"HW_AtmServiceProtectPair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("workServiceName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectServiceName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("monitorFlag", org.omg.hw.HW_mstpProtection.HW_AtmMonitorFlag_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmServiceProtectPair_T:1.0";
	}
	public static org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_T result = new org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_T();
		result.workServiceName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.protectServiceName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.monitorFlag=org.omg.hw.HW_mstpProtection.HW_AtmMonitorFlag_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.workServiceName);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.protectServiceName);
		org.omg.hw.HW_mstpProtection.HW_AtmMonitorFlag_THelper.write(out,s.monitorFlag);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
