package org.omg.zx.notifications;
/**
 *	Generated from IDL definition of enum "AlarmTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmTypeQualifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public AlarmTypeQualifier_T value;

	public AlarmTypeQualifier_THolder ()
	{
	}
	public AlarmTypeQualifier_THolder (final AlarmTypeQualifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmTypeQualifier_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmTypeQualifier_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmTypeQualifier_THelper.write (out,value);
	}
}
