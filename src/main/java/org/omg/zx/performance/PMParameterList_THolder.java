package org.omg.zx.performance;

/**
 *	Generated from IDL definition of alias "PMParameterList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameterList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public PMParameterList_THolder ()
	{
	}
	public PMParameterList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMParameterList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMParameterList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMParameterList_THelper.write (out,value);
	}
}
