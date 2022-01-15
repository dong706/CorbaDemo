package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of alias "ConstraintIDSeq"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ConstraintIDSeqHolder ()
	{
	}
	public ConstraintIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConstraintIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstraintIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConstraintIDSeqHelper.write (out,value);
	}
}
