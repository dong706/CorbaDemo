package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of alias "RedefineAlarmDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class RedefineAlarmDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.emsMgr.RedefineAlarmData_T[] value;

	public RedefineAlarmDataList_THolder ()
	{
	}
	public RedefineAlarmDataList_THolder (final org.omg.hw.emsMgr.RedefineAlarmData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RedefineAlarmDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RedefineAlarmDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RedefineAlarmDataList_THelper.write (out,value);
	}
}
