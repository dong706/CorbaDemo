package org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage;


/**
 *	Generated from IDL definition of struct "OAMParametersData_T"
 *	@author JacORB IDL compiler 
 */

public final class OAMParametersData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.id(),"OAMParametersData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectName", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameterList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/MaintenanceMgr_I/OAMParametersData_T:1.0";
	}
	public static org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T result = new org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T();
		result.objectName = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.transmissionParams = org.omg.hw.transmissionParameters.LayeredParameterList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.objectName);
		org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
	}
}
