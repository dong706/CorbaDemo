package org.omg.zx.mtnmVersion;


/**
 *	Generated from IDL interface "Version_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class Version_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.mtnmVersion.Version_I s)
	{
			any.insert_Object(s);
	}
	public static org.omg.zx.mtnmVersion.Version_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/mtnmVersion/Version_I:1.0", "Version_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mtnmVersion/Version_I:1.0";
	}
	public static Version_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.zx.mtnmVersion.Version_I s)
	{
		_out.write_Object(s);
	}
	public static org.omg.zx.mtnmVersion.Version_I narrow(final java.lang.Object obj)
	{
		if (obj instanceof org.omg.zx.mtnmVersion.Version_I)
		{
			return (org.omg.zx.mtnmVersion.Version_I)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static org.omg.zx.mtnmVersion.Version_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.zx.mtnmVersion.Version_I)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:mtnm.tmforum.org/mtnmVersion/Version_I:1.0"))
			{
				org.omg.zx.mtnmVersion._Version_IStub stub;
				stub = new org.omg.zx.mtnmVersion._Version_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static org.omg.zx.mtnmVersion.Version_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.zx.mtnmVersion.Version_I)obj;
		}
		catch (ClassCastException c)
		{
				org.omg.zx.mtnmVersion._Version_IStub stub;
				stub = new org.omg.zx.mtnmVersion._Version_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
