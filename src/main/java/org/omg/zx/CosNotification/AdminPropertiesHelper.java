package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of alias "AdminProperties"
 *	@author JacORB IDL compiler 
 */

public final class AdminPropertiesHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.zx.CosNotification.Property[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.zx.CosNotification.Property[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.zx.CosNotification.AdminPropertiesHelper.id(), "AdminProperties",org.omg.zx.CosNotification.PropertySeqHelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/AdminProperties:1.0";
	}
	public static org.omg.zx.CosNotification.Property[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.zx.CosNotification.Property[] _result;
		_result = org.omg.zx.CosNotification.PropertySeqHelper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.zx.CosNotification.Property[] _s)
	{
		org.omg.zx.CosNotification.PropertySeqHelper.write(_out,_s);
	}
}
