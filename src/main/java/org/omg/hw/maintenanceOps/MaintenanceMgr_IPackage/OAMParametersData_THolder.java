package org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage;

/**
 *	Generated from IDL definition of struct "OAMParametersData_T"
 *	@author JacORB IDL compiler 
 */

public final class OAMParametersData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T value;

	public OAMParametersData_THolder ()
	{
	}
	public OAMParametersData_THolder(final org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.write(_out, value);
	}
}
