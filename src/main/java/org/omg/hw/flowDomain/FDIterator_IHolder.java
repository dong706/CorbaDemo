package org.omg.hw.flowDomain;

/**
 *	Generated from IDL interface "FDIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class FDIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FDIterator_I value;
	public FDIterator_IHolder()
	{
	}
	public FDIterator_IHolder (final FDIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FDIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FDIterator_IHelper.write (_out,value);
	}
}
