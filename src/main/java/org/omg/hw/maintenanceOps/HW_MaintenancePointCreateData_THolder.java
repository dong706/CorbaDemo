package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenancePointCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenancePointCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_T value;

	public HW_MaintenancePointCreateData_THolder ()
	{
	}
	public HW_MaintenancePointCreateData_THolder(final org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_THelper.write(_out, value);
	}
}
