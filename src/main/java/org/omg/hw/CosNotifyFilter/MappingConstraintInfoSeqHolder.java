package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of alias "MappingConstraintInfoSeq"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintInfoSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] value;

	public MappingConstraintInfoSeqHolder ()
	{
	}
	public MappingConstraintInfoSeqHolder (final org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MappingConstraintInfoSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MappingConstraintInfoSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MappingConstraintInfoSeqHelper.write (out,value);
	}
}
