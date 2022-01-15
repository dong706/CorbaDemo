package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TransmissionDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionDescriptor_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.transmissionDescriptor.TransmissionDescriptor_T value;

	public TransmissionDescriptor_THolder ()
	{
	}
	public TransmissionDescriptor_THolder(final org.omg.hw.transmissionDescriptor.TransmissionDescriptor_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THelper.write(_out, value);
	}
}
