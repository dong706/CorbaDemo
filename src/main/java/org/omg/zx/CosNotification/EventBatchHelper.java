package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of alias "EventBatch"
 *	@author JacORB IDL compiler 
 */

public final class EventBatchHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.zx.CosNotification.StructuredEvent[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.zx.CosNotification.StructuredEvent[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.zx.CosNotification.EventBatchHelper.id(), "EventBatch",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.zx.CosNotification.StructuredEventHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/EventBatch:1.0";
	}
	public static org.omg.zx.CosNotification.StructuredEvent[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.zx.CosNotification.StructuredEvent[] _result;
		int _l_result12 = _in.read_long();
		_result = new org.omg.zx.CosNotification.StructuredEvent[_l_result12];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.zx.CosNotification.StructuredEventHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.zx.CosNotification.StructuredEvent[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.zx.CosNotification.StructuredEventHelper.write(_out,_s[i]);
		}

	}
}
