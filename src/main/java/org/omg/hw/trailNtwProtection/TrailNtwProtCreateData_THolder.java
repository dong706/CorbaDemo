package org.omg.hw.trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.trailNtwProtection.TrailNtwProtCreateData_T value;

	public TrailNtwProtCreateData_THolder ()
	{
	}
	public TrailNtwProtCreateData_THolder(final org.omg.hw.trailNtwProtection.TrailNtwProtCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.trailNtwProtection.TrailNtwProtCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.trailNtwProtection.TrailNtwProtCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.trailNtwProtection.TrailNtwProtCreateData_THelper.write(_out, value);
	}
}
