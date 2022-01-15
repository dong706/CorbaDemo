package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "ConstraintExp"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintExpHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.ConstraintExp value;

	public ConstraintExpHolder ()
	{
	}
	public ConstraintExpHolder(final org.omg.hw.CosNotifyFilter.ConstraintExp initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.ConstraintExpHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.ConstraintExpHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.ConstraintExpHelper.write(_out, value);
	}
}
