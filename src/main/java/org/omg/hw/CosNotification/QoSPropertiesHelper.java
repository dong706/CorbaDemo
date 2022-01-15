package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of alias "QoSProperties"
 *	@author JacORB IDL compiler 
 */

public final class QoSPropertiesHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.hw.CosNotification.Property[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.hw.CosNotification.Property[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.CosNotification.QoSPropertiesHelper.id(), "QoSProperties",org.omg.hw.CosNotification.PropertySeqHelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/QoSProperties:1.0";
	}
	public static org.omg.hw.CosNotification.Property[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.CosNotification.Property[] _result;
		_result = org.omg.hw.CosNotification.PropertySeqHelper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.CosNotification.Property[] _s)
	{
		org.omg.hw.CosNotification.PropertySeqHelper.write(_out,_s);
	}
}
