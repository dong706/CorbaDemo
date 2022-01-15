package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL interface "MLSNPPIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class MLSNPPIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MLSNPPIterator_I value;
	public MLSNPPIterator_IHolder()
	{
	}
	public MLSNPPIterator_IHolder (final MLSNPPIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MLSNPPIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MLSNPPIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MLSNPPIterator_IHelper.write (_out,value);
	}
}
