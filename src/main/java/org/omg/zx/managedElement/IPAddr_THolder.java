package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of struct "IPAddr_T"
 *	@author JacORB IDL compiler 
 */

public final class IPAddr_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.managedElement.IPAddr_T value;

	public IPAddr_THolder ()
	{
	}
	public IPAddr_THolder(final org.omg.zx.managedElement.IPAddr_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.managedElement.IPAddr_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.managedElement.IPAddr_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.managedElement.IPAddr_THelper.write(_out, value);
	}
}
