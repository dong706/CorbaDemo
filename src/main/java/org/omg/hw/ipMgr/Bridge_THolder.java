package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "Bridge_T"
 *	@author JacORB IDL compiler 
 */

public final class Bridge_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.Bridge_T value;

	public Bridge_THolder ()
	{
	}
	public Bridge_THolder(final org.omg.hw.ipMgr.Bridge_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.ipMgr.Bridge_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.ipMgr.Bridge_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.ipMgr.Bridge_THelper.write(_out, value);
	}
}
