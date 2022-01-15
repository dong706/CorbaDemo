package org.omg.zx.performance;

/**
 *	Generated from IDL definition of alias "PMPList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMP_T[] value;

	public PMPList_THolder ()
	{
	}
	public PMPList_THolder (final org.omg.zx.performance.PMP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMPList_THelper.write (out,value);
	}
}
