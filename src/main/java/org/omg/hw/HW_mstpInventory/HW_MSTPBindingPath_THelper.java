package org.omg.hw.HW_mstpInventory;


/**
 *	Generated from IDL definition of struct "HW_MSTPBindingPath_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPBindingPath_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.HW_mstpInventory.HW_MSTPBindingPath_THelper.id(),"HW_MSTPBindingPath_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("direction", org.omg.hw.terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("allPathList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("usedPathList", org.omg.hw.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.HW_mstpInventory.HW_MSTPBindingPath_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.HW_mstpInventory.HW_MSTPBindingPath_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPBindingPath_T:1.0";
	}
	public static org.omg.hw.HW_mstpInventory.HW_MSTPBindingPath_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.HW_mstpInventory.HW_MSTPBindingPath_T result = new org.omg.hw.HW_mstpInventory.HW_MSTPBindingPath_T();
		result.direction=org.omg.hw.terminationPoint.Directionality_THelper.read(in);
		result.allPathList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.usedPathList = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.HW_mstpInventory.HW_MSTPBindingPath_T s)
	{
		org.omg.hw.terminationPoint.Directionality_THelper.write(out,s.direction);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.allPathList);
		org.omg.hw.globaldefs.NamingAttributesList_THelper.write(out,s.usedPathList);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
