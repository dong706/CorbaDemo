package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of alias "MappingConstraintPairSeq"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintPairSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.MappingConstraintPair[] value;

	public MappingConstraintPairSeqHolder ()
	{
	}
	public MappingConstraintPairSeqHolder (final org.omg.hw.CosNotifyFilter.MappingConstraintPair[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MappingConstraintPairSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MappingConstraintPairSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MappingConstraintPairSeqHelper.write (out,value);
	}
}
