package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of alias "NamedPropertyRangeSeq"
 *	@author JacORB IDL compiler 
 */

public final class NamedPropertyRangeSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.NamedPropertyRange[] value;

	public NamedPropertyRangeSeqHolder ()
	{
	}
	public NamedPropertyRangeSeqHolder (final org.omg.hw.CosNotification.NamedPropertyRange[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamedPropertyRangeSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamedPropertyRangeSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamedPropertyRangeSeqHelper.write (out,value);
	}
}
