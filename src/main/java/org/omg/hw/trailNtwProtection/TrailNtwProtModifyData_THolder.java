package org.omg.hw.trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_T value;

	public TrailNtwProtModifyData_THolder ()
	{
	}
	public TrailNtwProtModifyData_THolder(final org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_THelper.write(_out, value);
	}
}
