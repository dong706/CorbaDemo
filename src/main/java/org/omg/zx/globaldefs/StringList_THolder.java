package org.omg.zx.globaldefs;

/**
 *	Generated from IDL definition of alias "StringList_T"
 *	@author JacORB IDL compiler 
 */

public final class StringList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public StringList_THolder ()
	{
	}
	public StringList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StringList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StringList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StringList_THelper.write (out,value);
	}
}
