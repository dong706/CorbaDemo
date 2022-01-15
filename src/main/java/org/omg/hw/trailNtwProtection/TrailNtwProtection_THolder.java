package org.omg.hw.trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtection_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.trailNtwProtection.TrailNtwProtection_T value;

	public TrailNtwProtection_THolder ()
	{
	}
	public TrailNtwProtection_THolder(final org.omg.hw.trailNtwProtection.TrailNtwProtection_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.trailNtwProtection.TrailNtwProtection_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.trailNtwProtection.TrailNtwProtection_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.trailNtwProtection.TrailNtwProtection_THelper.write(_out, value);
	}
}
