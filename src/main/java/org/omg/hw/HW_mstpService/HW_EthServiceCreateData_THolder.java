package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_EthServiceCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T value;

	public HW_EthServiceCreateData_THolder ()
	{
	}
	public HW_EthServiceCreateData_THolder(final org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_mstpService.HW_EthServiceCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_mstpService.HW_EthServiceCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_mstpService.HW_EthServiceCreateData_THelper.write(_out, value);
	}
}
