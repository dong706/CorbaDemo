package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of alias "PropertySeq"
 *	@author JacORB IDL compiler 
 */

public final class PropertySeqHelper
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
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.CosNotification.PropertySeqHelper.id(), "PropertySeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.hw.CosNotification.PropertyHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/PropertySeq:1.0";
	}
	public static org.omg.hw.CosNotification.Property[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.CosNotification.Property[] _result;
		int _l_result36 = _in.read_long();
		_result = new org.omg.hw.CosNotification.Property[_l_result36];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.hw.CosNotification.PropertyHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.CosNotification.Property[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.hw.CosNotification.PropertyHelper.write(_out,_s[i]);
		}

	}
}
