package org.omg.hw.notifications;

/**
 *	Generated from IDL definition of struct "CorrelatedNotifications_T"
 *	@author JacORB IDL compiler 
 */

public final class CorrelatedNotifications_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.notifications.CorrelatedNotifications_T value;

	public CorrelatedNotifications_THolder ()
	{
	}
	public CorrelatedNotifications_THolder(final org.omg.hw.notifications.CorrelatedNotifications_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.notifications.CorrelatedNotifications_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.notifications.CorrelatedNotifications_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.notifications.CorrelatedNotifications_THelper.write(_out, value);
	}
}
