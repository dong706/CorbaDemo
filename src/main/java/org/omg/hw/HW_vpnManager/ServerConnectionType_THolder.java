package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "ServerConnectionType_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerConnectionType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_vpnManager.ServerConnectionType_T value;

	public ServerConnectionType_THolder ()
	{
	}
	public ServerConnectionType_THolder(final org.omg.hw.HW_vpnManager.ServerConnectionType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_vpnManager.ServerConnectionType_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_vpnManager.ServerConnectionType_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_vpnManager.ServerConnectionType_THelper.write(_out, value);
	}
}
