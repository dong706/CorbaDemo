package org.omg.zx.aSAP;

/**
 *	Generated from IDL definition of struct "AlarmSeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmSeverityAssignment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.aSAP.AlarmSeverityAssignment_T value;

	public AlarmSeverityAssignment_THolder ()
	{
	}
	public AlarmSeverityAssignment_THolder(final org.omg.zx.aSAP.AlarmSeverityAssignment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.aSAP.AlarmSeverityAssignment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.aSAP.AlarmSeverityAssignment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.aSAP.AlarmSeverityAssignment_THelper.write(_out, value);
	}
}
