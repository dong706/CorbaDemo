package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "LogicalPort_T"
 *	@author JacORB IDL compiler 
 */

public final class LogicalPort_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.LogicalPort_T value;

	public LogicalPort_THolder ()
	{
	}
	public LogicalPort_THolder(final org.omg.zx.emsMgr.LogicalPort_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.emsMgr.LogicalPort_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.emsMgr.LogicalPort_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.emsMgr.LogicalPort_THelper.write(_out, value);
	}
}
