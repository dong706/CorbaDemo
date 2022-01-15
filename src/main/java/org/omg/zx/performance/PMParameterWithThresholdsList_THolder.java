package org.omg.zx.performance;

/**
 *	Generated from IDL definition of alias "PMParameterWithThresholdsList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameterWithThresholdsList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMParameterWithThresholds_T[] value;

	public PMParameterWithThresholdsList_THolder ()
	{
	}
	public PMParameterWithThresholdsList_THolder (final org.omg.zx.performance.PMParameterWithThresholds_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMParameterWithThresholdsList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMParameterWithThresholdsList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMParameterWithThresholdsList_THelper.write (out,value);
	}
}
