package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "ShapingQueue"
 *	@author JacORB IDL compiler 
 */

public final class ShapingQueueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_mstpInventory.ShapingQueue value;

	public ShapingQueueHolder ()
	{
	}
	public ShapingQueueHolder(final org.omg.hw.HW_mstpInventory.ShapingQueue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_mstpInventory.ShapingQueueHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_mstpInventory.ShapingQueueHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_mstpInventory.ShapingQueueHelper.write(_out, value);
	}
}
