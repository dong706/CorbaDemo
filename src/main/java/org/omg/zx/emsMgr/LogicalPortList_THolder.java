package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of alias "LogicalPortList_T"
 *	@author JacORB IDL compiler 
 */

public final class LogicalPortList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.LogicalPort_T[] value;

	public LogicalPortList_THolder ()
	{
	}
	public LogicalPortList_THolder (final org.omg.zx.emsMgr.LogicalPort_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LogicalPortList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LogicalPortList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LogicalPortList_THelper.write (out,value);
	}
}
