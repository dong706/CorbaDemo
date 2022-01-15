package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of alias "AdminIDSeq"
 *	@author JacORB IDL compiler 
 */

public final class AdminIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public AdminIDSeqHolder ()
	{
	}
	public AdminIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AdminIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdminIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AdminIDSeqHelper.write (out,value);
	}
}
