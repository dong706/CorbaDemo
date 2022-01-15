package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PmMonitorConditioning_T"
 *	@author JacORB IDL compiler 
 */

public final class PmMonitorConditioning_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PmMonitorConditioning_T value;

	public PmMonitorConditioning_THolder ()
	{
	}
	public PmMonitorConditioning_THolder(final org.omg.hw.performance.PmMonitorConditioning_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.performance.PmMonitorConditioning_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.performance.PmMonitorConditioning_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.performance.PmMonitorConditioning_THelper.write(_out, value);
	}
}
