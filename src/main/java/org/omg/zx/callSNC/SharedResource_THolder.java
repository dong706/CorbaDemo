package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "SharedResource_T"
 *	@author JacORB IDL compiler 
 */

public final class SharedResource_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.callSNC.SharedResource_T value;

	public SharedResource_THolder ()
	{
	}
	public SharedResource_THolder(final org.omg.zx.callSNC.SharedResource_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.callSNC.SharedResource_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.callSNC.SharedResource_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.callSNC.SharedResource_THelper.write(_out, value);
	}
}
