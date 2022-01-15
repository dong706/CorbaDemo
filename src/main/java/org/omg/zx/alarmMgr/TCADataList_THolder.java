package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of alias "TCADataList_T"
 *	@author JacORB IDL compiler 
 */

public final class TCADataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.TCAData_T[] value;

	public TCADataList_THolder ()
	{
	}
	public TCADataList_THolder (final org.omg.zx.alarmMgr.TCAData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCADataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCADataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TCADataList_THelper.write (out,value);
	}
}
