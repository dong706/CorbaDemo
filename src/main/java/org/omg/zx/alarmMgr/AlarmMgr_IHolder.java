package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL interface "AlarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class AlarmMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public AlarmMgr_I value;
	public AlarmMgr_IHolder()
	{
	}
	public AlarmMgr_IHolder (final AlarmMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AlarmMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AlarmMgr_IHelper.write (_out,value);
	}
}
