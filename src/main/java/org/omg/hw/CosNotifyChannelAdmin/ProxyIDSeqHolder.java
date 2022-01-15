package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of alias "ProxyIDSeq"
 *	@author JacORB IDL compiler 
 */

public final class ProxyIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ProxyIDSeqHolder ()
	{
	}
	public ProxyIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProxyIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProxyIDSeqHelper.write (out,value);
	}
}
