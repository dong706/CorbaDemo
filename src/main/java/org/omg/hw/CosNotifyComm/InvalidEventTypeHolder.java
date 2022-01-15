package org.omg.hw.CosNotifyComm;

/**
 *	Generated from IDL definition of exception "InvalidEventType"
 *	@author JacORB IDL compiler 
 */

public final class InvalidEventTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyComm.InvalidEventType value;

	public InvalidEventTypeHolder ()
	{
	}
	public InvalidEventTypeHolder(final org.omg.hw.CosNotifyComm.InvalidEventType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.write(_out, value);
	}
}
