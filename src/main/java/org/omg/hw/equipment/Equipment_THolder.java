package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of struct "Equipment_T"
 *	@author JacORB IDL compiler 
 */

public final class Equipment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.equipment.Equipment_T value;

	public Equipment_THolder ()
	{
	}
	public Equipment_THolder(final org.omg.hw.equipment.Equipment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.equipment.Equipment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.equipment.Equipment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.equipment.Equipment_THelper.write(_out, value);
	}
}
