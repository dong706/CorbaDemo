package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of struct "NetAddress_T"
 *	@author JacORB IDL compiler 
 */

public final class NetAddress_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.managedElement.NetAddress_T value;

	public NetAddress_THolder ()
	{
	}
	public NetAddress_THolder(final org.omg.zx.managedElement.NetAddress_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.managedElement.NetAddress_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.managedElement.NetAddress_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.managedElement.NetAddress_THelper.write(_out, value);
	}
}
