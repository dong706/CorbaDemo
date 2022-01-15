package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "PresetRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class PresetRoute_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.subnetworkConnection.PresetRoute_T value;

	public PresetRoute_THolder ()
	{
	}
	public PresetRoute_THolder(final org.omg.hw.subnetworkConnection.PresetRoute_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.subnetworkConnection.PresetRoute_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.subnetworkConnection.PresetRoute_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.subnetworkConnection.PresetRoute_THelper.write(_out, value);
	}
}
