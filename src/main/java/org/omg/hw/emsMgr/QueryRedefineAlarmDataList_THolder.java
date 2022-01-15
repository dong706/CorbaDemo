package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of alias "QueryRedefineAlarmDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class QueryRedefineAlarmDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.emsMgr.QueryRedefineAlarmData_T[] value;

	public QueryRedefineAlarmDataList_THolder ()
	{
	}
	public QueryRedefineAlarmDataList_THolder (final org.omg.hw.emsMgr.QueryRedefineAlarmData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return QueryRedefineAlarmDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QueryRedefineAlarmDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		QueryRedefineAlarmDataList_THelper.write (out,value);
	}
}
