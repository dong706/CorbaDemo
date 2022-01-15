package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of alias "HW_ConjunctionSNCList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ConjunctionSNCList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNC_T[] value;

	public HW_ConjunctionSNCList_THolder ()
	{
	}
	public HW_ConjunctionSNCList_THolder (final org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNC_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_ConjunctionSNCList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_ConjunctionSNCList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_ConjunctionSNCList_THelper.write (out,value);
	}
}
