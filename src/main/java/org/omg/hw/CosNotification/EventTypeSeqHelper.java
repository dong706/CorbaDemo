package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of alias "EventTypeSeq"
 *	@author JacORB IDL compiler 
 */

public final class EventTypeSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.hw.CosNotification.EventType[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.hw.CosNotification.EventType[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.CosNotification.EventTypeSeqHelper.id(), "EventTypeSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.hw.CosNotification.EventTypeHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/EventTypeSeq:1.0";
	}
	public static org.omg.hw.CosNotification.EventType[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.CosNotification.EventType[] _result;
		int _l_result37 = _in.read_long();
		_result = new org.omg.hw.CosNotification.EventType[_l_result37];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.hw.CosNotification.EventTypeHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.CosNotification.EventType[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.hw.CosNotification.EventTypeHelper.write(_out,_s[i]);
		}

	}
}
