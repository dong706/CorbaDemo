package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of alias "TCInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class TCInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.managedElement.TCInfo_T[] value;

	public TCInfoList_THolder ()
	{
	}
	public TCInfoList_THolder (final org.omg.zx.managedElement.TCInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TCInfoList_THelper.write (out,value);
	}
}
