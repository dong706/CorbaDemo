package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenancePoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenancePoint_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.maintenanceOps.HW_MaintenancePoint_T value;

	public HW_MaintenancePoint_THolder ()
	{
	}
	public HW_MaintenancePoint_THolder(final org.omg.hw.maintenanceOps.HW_MaintenancePoint_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.maintenanceOps.HW_MaintenancePoint_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.maintenanceOps.HW_MaintenancePoint_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.maintenanceOps.HW_MaintenancePoint_THelper.write(_out, value);
	}
}
