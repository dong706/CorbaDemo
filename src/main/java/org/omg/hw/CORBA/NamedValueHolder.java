package org.omg.hw.CORBA;

/**
 *	Generated from IDL interface "NamedValue"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class NamedValueHolder	implements org.omg.CORBA.portable.Streamable{
	 public NamedValue value;
	public NamedValueHolder()
	{
	}
	public NamedValueHolder (final NamedValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NamedValueHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamedValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NamedValueHelper.write (_out,value);
	}
}
