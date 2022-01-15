package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of struct "QueryRedefineAlarmData_T"
 *	@author JacORB IDL compiler 
 */

public final class QueryRedefineAlarmData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.emsMgr.QueryRedefineAlarmData_T value;

	public QueryRedefineAlarmData_THolder ()
	{
	}
	public QueryRedefineAlarmData_THolder(final org.omg.hw.emsMgr.QueryRedefineAlarmData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.emsMgr.QueryRedefineAlarmData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.emsMgr.QueryRedefineAlarmData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.emsMgr.QueryRedefineAlarmData_THelper.write(_out, value);
	}
}
