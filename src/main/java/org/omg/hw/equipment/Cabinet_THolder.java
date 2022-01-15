package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of struct "Cabinet_T"
 *	@author JacORB IDL compiler 
 */

public final class Cabinet_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.equipment.Cabinet_T value;

	public Cabinet_THolder ()
	{
	}
	public Cabinet_THolder(final org.omg.hw.equipment.Cabinet_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.equipment.Cabinet_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.equipment.Cabinet_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.equipment.Cabinet_THelper.write(_out, value);
	}
}
