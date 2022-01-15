package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL interface "MLSNPPLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class MLSNPPLinkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MLSNPPLinkIterator_I value;
	public MLSNPPLinkIterator_IHolder()
	{
	}
	public MLSNPPLinkIterator_IHolder (final MLSNPPLinkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MLSNPPLinkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MLSNPPLinkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MLSNPPLinkIterator_IHelper.write (_out,value);
	}
}
