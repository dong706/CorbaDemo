package org.omg.hw.CosEventComm;

/**
 *	Generated from IDL definition of exception "Disconnected"
 *	@author JacORB IDL compiler 
 */

public final class DisconnectedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosEventComm.Disconnected value;

	public DisconnectedHolder ()
	{
	}
	public DisconnectedHolder(final org.omg.hw.CosEventComm.Disconnected initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosEventComm.DisconnectedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosEventComm.DisconnectedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosEventComm.DisconnectedHelper.write(_out, value);
	}
}
