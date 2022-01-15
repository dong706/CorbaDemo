package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMParameterWithThresholds_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameterWithThresholds_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMParameterWithThresholds_T value;

	public PMParameterWithThresholds_THolder ()
	{
	}
	public PMParameterWithThresholds_THolder(final org.omg.zx.performance.PMParameterWithThresholds_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.performance.PMParameterWithThresholds_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.performance.PMParameterWithThresholds_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.performance.PMParameterWithThresholds_THelper.write(_out, value);
	}
}
