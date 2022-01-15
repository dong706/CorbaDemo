package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_AtmServiceTP_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceTP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_mstpService.HW_AtmServiceTP_T value;

	public HW_AtmServiceTP_THolder ()
	{
	}
	public HW_AtmServiceTP_THolder(final org.omg.hw.HW_mstpService.HW_AtmServiceTP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_mstpService.HW_AtmServiceTP_THelper.write(_out, value);
	}
}
