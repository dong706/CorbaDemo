package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "ConstraintNotFound"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.ConstraintNotFound value;

	public ConstraintNotFoundHolder ()
	{
	}
	public ConstraintNotFoundHolder(final org.omg.hw.CosNotifyFilter.ConstraintNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.write(_out, value);
	}
}
