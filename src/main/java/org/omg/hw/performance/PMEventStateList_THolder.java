package org.omg.hw.performance;

/**
 *	Generated from IDL definition of alias "PMEventStateList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMEventStateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.performance.PMEventState_T[] value;

	public PMEventStateList_THolder ()
	{
	}
	public PMEventStateList_THolder (final org.omg.hw.performance.PMEventState_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMEventStateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMEventStateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMEventStateList_THelper.write (out,value);
	}
}
