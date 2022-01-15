package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of exception "UnsupportedAdmin"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedAdminHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotification.UnsupportedAdmin value;

	public UnsupportedAdminHolder ()
	{
	}
	public UnsupportedAdminHolder(final org.omg.hw.CosNotification.UnsupportedAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotification.UnsupportedAdminHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotification.UnsupportedAdminHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotification.UnsupportedAdminHelper.write(_out, value);
	}
}
