package org.omg.hw.protection;

/**
 *	Generated from IDL definition of alias "WDMSwitchDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class WDMSwitchDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.WDMSwitchData_T[] value;

	public WDMSwitchDataList_THolder ()
	{
	}
	public WDMSwitchDataList_THolder (final org.omg.hw.protection.WDMSwitchData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return WDMSwitchDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WDMSwitchDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		WDMSwitchDataList_THelper.write (out,value);
	}
}
