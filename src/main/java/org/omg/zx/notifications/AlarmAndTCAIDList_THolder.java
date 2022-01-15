package org.omg.zx.notifications;

/**
 *	Generated from IDL definition of alias "AlarmAndTCAIDList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmAndTCAIDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] value;

	public AlarmAndTCAIDList_THolder ()
	{
	}
	public AlarmAndTCAIDList_THolder (final org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmAndTCAIDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmAndTCAIDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmAndTCAIDList_THelper.write (out,value);
	}
}
