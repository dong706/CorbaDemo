package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of alias "AlarmStaticInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmStaticInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.emsMgr.AlarmStaticInfo_T[] value;

	public AlarmStaticInfoList_THolder ()
	{
	}
	public AlarmStaticInfoList_THolder (final org.omg.hw.emsMgr.AlarmStaticInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmStaticInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmStaticInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmStaticInfoList_THelper.write (out,value);
	}
}
