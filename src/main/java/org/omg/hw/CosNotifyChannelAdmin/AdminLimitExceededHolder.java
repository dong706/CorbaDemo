package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "AdminLimitExceeded"
 *	@author JacORB IDL compiler 
 */

public final class AdminLimitExceededHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded value;

	public AdminLimitExceededHolder ()
	{
	}
	public AdminLimitExceededHolder(final org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.write(_out, value);
	}
}
