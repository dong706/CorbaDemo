package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ClientType"
 *	@author JacORB IDL compiler 
 */

public final class ClientTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ClientType value;

	public ClientTypeHolder ()
	{
	}
	public ClientTypeHolder (final ClientType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ClientTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClientTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ClientTypeHelper.write (out,value);
	}
}
