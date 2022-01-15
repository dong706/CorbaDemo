package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_RPRTopoInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRTopoInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_T value;

	public HW_RPRTopoInfo_THolder ()
	{
	}
	public HW_RPRTopoInfo_THolder(final org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_THelper.write(_out, value);
	}
}
