package org.omg.hw.HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_AtmPGSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THelper.id(),"HW_AtmPGSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pgName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectType", org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.type(), null),new org.omg.CORBA.StructMember("srcEndSwitchPara", org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.type(), null),new org.omg.CORBA.StructMember("snkEndSwitchPara", org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmPGSwitchData_T:1.0";
	}
	public static org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_T result = new org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_T();
		result.pgName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.protectType=org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.read(in);
		result.srcEndSwitchPara=org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.read(in);
		result.snkEndSwitchPara=org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.pgName);
		org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.write(out,s.protectType);
		org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.write(out,s.srcEndSwitchPara);
		org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.write(out,s.snkEndSwitchPara);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
