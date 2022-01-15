package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "MappingConstraintInfo"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.MappingConstraintInfo value;

	public MappingConstraintInfoHolder ()
	{
	}
	public MappingConstraintInfoHolder(final org.omg.hw.CosNotifyFilter.MappingConstraintInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.MappingConstraintInfoHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.MappingConstraintInfoHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.MappingConstraintInfoHelper.write(_out, value);
	}
}
