package org.omg.zx.notifications;
/**
 *	Generated from IDL definition of union "AlarmOrTCAIdentifier_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmOrTCAIdentifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public AlarmOrTCAIdentifier_T value;

	public AlarmOrTCAIdentifier_THolder ()
	{
	}
	public AlarmOrTCAIdentifier_THolder (final AlarmOrTCAIdentifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmOrTCAIdentifier_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmOrTCAIdentifier_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmOrTCAIdentifier_THelper.write (out, value);
	}
}
