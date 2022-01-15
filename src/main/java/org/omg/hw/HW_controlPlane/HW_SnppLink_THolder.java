package org.omg.hw.HW_controlPlane;

/**
 *	Generated from IDL definition of struct "HW_SnppLink_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SnppLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_controlPlane.HW_SnppLink_T value;

	public HW_SnppLink_THolder ()
	{
	}
	public HW_SnppLink_THolder(final org.omg.hw.HW_controlPlane.HW_SnppLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_controlPlane.HW_SnppLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_controlPlane.HW_SnppLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_controlPlane.HW_SnppLink_THelper.write(_out, value);
	}
}
