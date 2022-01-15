package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of alias "ConstraintExpSeq"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintExpSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.ConstraintExp[] value;

	public ConstraintExpSeqHolder ()
	{
	}
	public ConstraintExpSeqHolder (final org.omg.hw.CosNotifyFilter.ConstraintExp[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConstraintExpSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstraintExpSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConstraintExpSeqHelper.write (out,value);
	}
}
