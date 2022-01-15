package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "HW_ConjunctionSNC_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ConjunctionSNC_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNC_T value;

	public HW_ConjunctionSNC_THolder ()
	{
	}
	public HW_ConjunctionSNC_THolder(final org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNC_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNC_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNC_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNC_THelper.write(_out, value);
	}
}
