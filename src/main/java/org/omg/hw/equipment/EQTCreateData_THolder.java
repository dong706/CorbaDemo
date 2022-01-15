package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of struct "EQTCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class EQTCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.equipment.EQTCreateData_T value;

	public EQTCreateData_THolder ()
	{
	}
	public EQTCreateData_THolder(final org.omg.hw.equipment.EQTCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.equipment.EQTCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.equipment.EQTCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.equipment.EQTCreateData_THelper.write(_out, value);
	}
}
