package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of struct "EquipmentHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentHolder_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.equipment.EquipmentHolder_T value;

	public EquipmentHolder_THolder ()
	{
	}
	public EquipmentHolder_THolder(final org.omg.hw.equipment.EquipmentHolder_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.equipment.EquipmentHolder_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.equipment.EquipmentHolder_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.equipment.EquipmentHolder_THelper.write(_out, value);
	}
}
