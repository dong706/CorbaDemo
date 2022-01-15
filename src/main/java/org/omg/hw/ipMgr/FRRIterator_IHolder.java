package org.omg.hw.ipMgr;

/**
 *	Generated from IDL interface "FRRIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class FRRIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FRRIterator_I value;
	public FRRIterator_IHolder()
	{
	}
	public FRRIterator_IHolder (final FRRIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FRRIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FRRIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FRRIterator_IHelper.write (_out,value);
	}
}
