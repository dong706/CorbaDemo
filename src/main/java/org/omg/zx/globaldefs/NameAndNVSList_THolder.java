package org.omg.zx.globaldefs;

/**
 *	Generated from IDL definition of alias "NameAndNVSList_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndNVSList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.globaldefs.NameAndNVS_T[] value;

	public NameAndNVSList_THolder ()
	{
	}
	public NameAndNVSList_THolder (final org.omg.zx.globaldefs.NameAndNVS_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NameAndNVSList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NameAndNVSList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NameAndNVSList_THelper.write (out,value);
	}
}
