package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "WaveLengthStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class WaveLengthStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.subnetworkConnection.WaveLengthStatus_T value;

	public WaveLengthStatus_THolder ()
	{
	}
	public WaveLengthStatus_THolder(final org.omg.hw.subnetworkConnection.WaveLengthStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.subnetworkConnection.WaveLengthStatus_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.subnetworkConnection.WaveLengthStatus_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.subnetworkConnection.WaveLengthStatus_THelper.write(_out, value);
	}
}
