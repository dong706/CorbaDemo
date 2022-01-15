package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_ATMMaintenanceEntityAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ATMMaintenanceEntityAttr_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_T value;

	public HW_ATMMaintenanceEntityAttr_THolder ()
	{
	}
	public HW_ATMMaintenanceEntityAttr_THolder(final org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.write(_out, value);
	}
}
