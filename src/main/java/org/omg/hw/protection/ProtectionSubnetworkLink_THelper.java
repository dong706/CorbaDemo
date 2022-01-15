package org.omg.hw.protection;


/**
 *	Generated from IDL definition of struct "ProtectionSubnetworkLink_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetworkLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.protection.ProtectionSubnetworkLink_THelper.id(),"ProtectionSubnetworkLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("srcTP", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("snkTP", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("vc4List", org.omg.hw.protection.TSSeq_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.protection.ProtectionSubnetworkLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.protection.ProtectionSubnetworkLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionSubnetworkLink_T:1.0";
	}
	public static org.omg.hw.protection.ProtectionSubnetworkLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.protection.ProtectionSubnetworkLink_T result = new org.omg.hw.protection.ProtectionSubnetworkLink_T();
		result.srcTP = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.snkTP = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.vc4List = org.omg.hw.protection.TSSeq_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.protection.ProtectionSubnetworkLink_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.srcTP);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.snkTP);
		org.omg.hw.protection.TSSeq_THelper.write(out,s.vc4List);
	}
}
