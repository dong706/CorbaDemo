package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of alias "SeverityAssignmentList_T"
 *	@author JacORB IDL compiler 
 */

public final class SeverityAssignmentList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.SeverityAssignment_T[] value;

	public SeverityAssignmentList_THolder ()
	{
	}
	public SeverityAssignmentList_THolder (final org.omg.zx.alarmMgr.SeverityAssignment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SeverityAssignmentList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SeverityAssignmentList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SeverityAssignmentList_THelper.write (out,value);
	}
}
