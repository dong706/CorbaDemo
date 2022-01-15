package org.omg.zx.managedElementManager;


/**
 *	Generated from IDL definition of struct "MEConfigData_T"
 *	@author JacORB IDL compiler 
 */

public final class MEConfigData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.managedElementManager.MEConfigData_THelper.id(),"MEConfigData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("configDatas", org.omg.zx.notifications.NVList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.managedElementManager.MEConfigData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.managedElementManager.MEConfigData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElementManager/MEConfigData_T:1.0";
	}
	public static org.omg.zx.managedElementManager.MEConfigData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.managedElementManager.MEConfigData_T result = new org.omg.zx.managedElementManager.MEConfigData_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.configDatas = org.omg.zx.notifications.NVList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.managedElementManager.MEConfigData_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		org.omg.zx.notifications.NVList_THelper.write(out,s.configDatas);
	}
}
