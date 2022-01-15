package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "SNCAndRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRoute_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.callSNC.SNCAndRoute_T value;

	public SNCAndRoute_THolder ()
	{
	}
	public SNCAndRoute_THolder(final org.omg.zx.callSNC.SNCAndRoute_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.callSNC.SNCAndRoute_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.callSNC.SNCAndRoute_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.callSNC.SNCAndRoute_THelper.write(_out, value);
	}
}
