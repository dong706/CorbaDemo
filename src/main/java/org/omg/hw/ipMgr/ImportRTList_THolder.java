package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of alias "ImportRTList_T"
 *	@author JacORB IDL compiler 
 */

public final class ImportRTList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ImportRTList_THolder ()
	{
	}
	public ImportRTList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ImportRTList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ImportRTList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ImportRTList_THelper.write (out,value);
	}
}
