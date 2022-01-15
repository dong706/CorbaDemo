package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of alias "ExportRTList_T"
 *	@author JacORB IDL compiler 
 */

public final class ExportRTList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ExportRTList_THolder ()
	{
	}
	public ExportRTList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExportRTList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExportRTList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExportRTList_THelper.write (out,value);
	}
}
