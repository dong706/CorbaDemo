package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_RPRSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRSwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_T value;

	public HW_RPRSwitchData_THolder ()
	{
	}
	public HW_RPRSwitchData_THolder(final org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THelper.write(_out, value);
	}
}
