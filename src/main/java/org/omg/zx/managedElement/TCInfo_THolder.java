package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of struct "TCInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TCInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.managedElement.TCInfo_T value;

	public TCInfo_THolder ()
	{
	}
	public TCInfo_THolder(final org.omg.zx.managedElement.TCInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.managedElement.TCInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.managedElement.TCInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.managedElement.TCInfo_THelper.write(_out, value);
	}
}
