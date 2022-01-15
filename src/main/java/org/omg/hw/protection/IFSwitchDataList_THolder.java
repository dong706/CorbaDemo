package org.omg.hw.protection;

/**
 *	Generated from IDL definition of alias "IFSwitchDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class IFSwitchDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.IFSwitchData_T[] value;

	public IFSwitchDataList_THolder ()
	{
	}
	public IFSwitchDataList_THolder (final org.omg.hw.protection.IFSwitchData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IFSwitchDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IFSwitchDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IFSwitchDataList_THelper.write (out,value);
	}
}
