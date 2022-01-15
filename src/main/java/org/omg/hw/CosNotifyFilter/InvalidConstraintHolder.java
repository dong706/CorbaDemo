package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidConstraint"
 *	@author JacORB IDL compiler 
 */

public final class InvalidConstraintHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.InvalidConstraint value;

	public InvalidConstraintHolder ()
	{
	}
	public InvalidConstraintHolder(final org.omg.hw.CosNotifyFilter.InvalidConstraint initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.write(_out, value);
	}
}
