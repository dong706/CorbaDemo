package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of struct "AdminLimit"
 *	@author JacORB IDL compiler 
 */

public final class AdminLimitHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyChannelAdmin.AdminLimit value;

	public AdminLimitHolder ()
	{
	}
	public AdminLimitHolder(final org.omg.hw.CosNotifyChannelAdmin.AdminLimit initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyChannelAdmin.AdminLimitHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyChannelAdmin.AdminLimitHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyChannelAdmin.AdminLimitHelper.write(_out, value);
	}
}
