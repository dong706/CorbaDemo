package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "DuplicateConstraintID"
 *	@author JacORB IDL compiler 
 */

public final class DuplicateConstraintIDHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.DuplicateConstraintID value;

	public DuplicateConstraintIDHolder ()
	{
	}
	public DuplicateConstraintIDHolder(final org.omg.hw.CosNotifyFilter.DuplicateConstraintID initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.DuplicateConstraintIDHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.DuplicateConstraintIDHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.DuplicateConstraintIDHelper.write(_out, value);
	}
}
