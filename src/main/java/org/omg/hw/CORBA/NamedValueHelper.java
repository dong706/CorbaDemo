package org.omg.hw.CORBA;


/**
 *	Generated from IDL interface "NamedValue"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class NamedValueHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CORBA.NamedValue s)
	{
			any.insert_Object(s);
	}
	public static org.omg.hw.CORBA.NamedValue extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:CORBA/NamedValue:1.0", "NamedValue");
	}
	public static String id()
	{
		return "IDL:CORBA/NamedValue:1.0";
	}
	public static NamedValue read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.hw.CORBA.NamedValue s)
	{
		_out.write_Object(s);
	}
	public static org.omg.hw.CORBA.NamedValue narrow(final java.lang.Object obj)
	{
		if (obj instanceof org.omg.hw.CORBA.NamedValue)
		{
			return (org.omg.hw.CORBA.NamedValue)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static org.omg.hw.CORBA.NamedValue narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.hw.CORBA.NamedValue)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:CORBA/NamedValue:1.0"))
			{
				org.omg.hw.CORBA._NamedValueStub stub;
				stub = new org.omg.hw.CORBA._NamedValueStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static org.omg.hw.CORBA.NamedValue unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.hw.CORBA.NamedValue)obj;
		}
		catch (ClassCastException c)
		{
				org.omg.hw.CORBA._NamedValueStub stub;
				stub = new org.omg.hw.CORBA._NamedValueStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
