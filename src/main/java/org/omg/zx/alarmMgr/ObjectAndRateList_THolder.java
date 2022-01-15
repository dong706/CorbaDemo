package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of alias "ObjectAndRateList_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAndRateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.alarmMgr.ObjectAndRate_T[] value;

	public ObjectAndRateList_THolder ()
	{
	}
	public ObjectAndRateList_THolder (final org.omg.zx.alarmMgr.ObjectAndRate_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObjectAndRateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectAndRateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObjectAndRateList_THelper.write (out,value);
	}
}
