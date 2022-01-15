package org.omg.zx.performance;

/**
 *	Generated from IDL definition of alias "PMTaskList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTaskList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMTask_T[] value;

	public PMTaskList_THolder ()
	{
	}
	public PMTaskList_THolder (final org.omg.zx.performance.PMTask_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMTaskList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMTaskList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMTaskList_THelper.write (out,value);
	}
}
