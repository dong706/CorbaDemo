package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of struct "ManagedElement_T"
 *	@author JacORB IDL compiler 
 */

public final class ManagedElement_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.managedElement.ManagedElement_T value;

	public ManagedElement_THolder ()
	{
	}
	public ManagedElement_THolder(final org.omg.zx.managedElement.ManagedElement_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.managedElement.ManagedElement_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.managedElement.ManagedElement_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.managedElement.ManagedElement_THelper.write(_out, value);
	}
}
