package org.omg.hw.HW_mstpProtection;


/**
 *	Generated from IDL definition of struct "HW_AtmProtectGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmProtectGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THelper.id(),"HW_AtmProtectGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectType", org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.type(), null),new org.omg.CORBA.StructMember("switchDirect", org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchDirect_THelper.type(), null),new org.omg.CORBA.StructMember("useState", org.omg.hw.HW_mstpProtection.HW_AtmPGUseState_THelper.type(), null),new org.omg.CORBA.StructMember("srcEndPara", org.omg.hw.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.type(), null),new org.omg.CORBA.StructMember("snkEndPara", org.omg.hw.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.type(), null),new org.omg.CORBA.StructMember("ppList", org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPairList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmProtectGroup_T:1.0";
	}
	public static org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_T result = new org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectType=org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.read(in);
		result.switchDirect=org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchDirect_THelper.read(in);
		result.useState=org.omg.hw.HW_mstpProtection.HW_AtmPGUseState_THelper.read(in);
		result.srcEndPara=org.omg.hw.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.read(in);
		result.snkEndPara=org.omg.hw.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.read(in);
		result.ppList = org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPairList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.hw.HW_mstpProtection.HW_AtmProtectType_THelper.write(out,s.protectType);
		org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchDirect_THelper.write(out,s.switchDirect);
		org.omg.hw.HW_mstpProtection.HW_AtmPGUseState_THelper.write(out,s.useState);
		org.omg.hw.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.write(out,s.srcEndPara);
		org.omg.hw.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.write(out,s.snkEndPara);
		org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPairList_THelper.write(out,s.ppList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
