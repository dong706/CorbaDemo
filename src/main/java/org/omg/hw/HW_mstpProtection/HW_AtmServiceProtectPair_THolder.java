package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmServiceProtectPair_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceProtectPair_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_T value;

	public HW_AtmServiceProtectPair_THolder ()
	{
	}
	public HW_AtmServiceProtectPair_THolder(final org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_mstpProtection.HW_AtmServiceProtectPair_THelper.write(_out, value);
	}
}
