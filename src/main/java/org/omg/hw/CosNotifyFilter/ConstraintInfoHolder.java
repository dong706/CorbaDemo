package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "ConstraintInfo"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.ConstraintInfo value;

	public ConstraintInfoHolder ()
	{
	}
	public ConstraintInfoHolder(final org.omg.hw.CosNotifyFilter.ConstraintInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.ConstraintInfoHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.ConstraintInfoHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.ConstraintInfoHelper.write(_out, value);
	}
}
