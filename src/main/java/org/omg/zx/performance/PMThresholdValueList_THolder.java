package org.omg.zx.performance;

/**
 *	Generated from IDL definition of alias "PMThresholdValueList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdValueList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMThresholdValue_T[] value;

	public PMThresholdValueList_THolder ()
	{
	}
	public PMThresholdValueList_THolder (final org.omg.zx.performance.PMThresholdValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMThresholdValueList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMThresholdValueList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMThresholdValueList_THelper.write (out,value);
	}
}
