package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMThresholdValue_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdValue_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMThresholdValue_T value;

	public PMThresholdValue_THolder ()
	{
	}
	public PMThresholdValue_THolder(final org.omg.zx.performance.PMThresholdValue_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.performance.PMThresholdValue_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.performance.PMThresholdValue_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.performance.PMThresholdValue_THelper.write(_out, value);
	}
}
