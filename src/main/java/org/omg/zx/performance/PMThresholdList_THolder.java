package org.omg.zx.performance;

/**
 *	Generated from IDL definition of alias "PMThresholdList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMThreshold_T[] value;

	public PMThresholdList_THolder ()
	{
	}
	public PMThresholdList_THolder (final org.omg.zx.performance.PMThreshold_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMThresholdList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMThresholdList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMThresholdList_THelper.write (out,value);
	}
}
