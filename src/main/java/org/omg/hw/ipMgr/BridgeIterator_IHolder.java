package org.omg.hw.ipMgr;

/**
 *	Generated from IDL interface "BridgeIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class BridgeIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public BridgeIterator_I value;
	public BridgeIterator_IHolder()
	{
	}
	public BridgeIterator_IHolder (final BridgeIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BridgeIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BridgeIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BridgeIterator_IHelper.write (_out,value);
	}
}
