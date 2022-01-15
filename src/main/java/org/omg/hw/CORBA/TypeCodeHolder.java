package org.omg.hw.CORBA;

/**
 *	Generated from IDL interface "TypeCode"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class TypeCodeHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypeCode value;
	public TypeCodeHolder()
	{
	}
	public TypeCodeHolder (final TypeCode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypeCodeHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypeCodeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypeCodeHelper.write (_out,value);
	}
}
