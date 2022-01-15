package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_VirtualBridgeIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class HW_VirtualBridgeIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_VirtualBridgeIterator_I value;
	public HW_VirtualBridgeIterator_IHolder()
	{
	}
	public HW_VirtualBridgeIterator_IHolder (final HW_VirtualBridgeIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_VirtualBridgeIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_VirtualBridgeIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_VirtualBridgeIterator_IHelper.write (_out,value);
	}
}
