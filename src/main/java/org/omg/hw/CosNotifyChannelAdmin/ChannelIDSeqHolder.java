package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of alias "ChannelIDSeq"
 *	@author JacORB IDL compiler 
 */

public final class ChannelIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ChannelIDSeqHolder ()
	{
	}
	public ChannelIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ChannelIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ChannelIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ChannelIDSeqHelper.write (out,value);
	}
}
