package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of alias "TNAList_T"
 *	@author JacORB IDL compiler 
 */

public final class TNAList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public TNAList_THolder ()
	{
	}
	public TNAList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TNAList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TNAList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TNAList_THelper.write (out,value);
	}
}
