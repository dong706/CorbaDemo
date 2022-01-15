package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_EthService_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthService_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_mstpService.HW_EthService_T value;

	public HW_EthService_THolder ()
	{
	}
	public HW_EthService_THolder(final org.omg.hw.HW_mstpService.HW_EthService_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_mstpService.HW_EthService_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_mstpService.HW_EthService_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_mstpService.HW_EthService_THelper.write(_out, value);
	}
}
