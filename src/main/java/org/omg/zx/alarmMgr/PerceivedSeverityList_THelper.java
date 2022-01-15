package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of alias "PerceivedSeverityList_T"
 *	@author JacORB IDL compiler 
 */

public final class PerceivedSeverityList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.zx.alarmMgr.PerceivedSeverity_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.zx.alarmMgr.PerceivedSeverity_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.id(), "PerceivedSeverityList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.zx.alarmMgr.PerceivedSeverity_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/PerceivedSeverityList_T:1.0";
	}
	public static org.omg.zx.alarmMgr.PerceivedSeverity_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.zx.alarmMgr.PerceivedSeverity_T[] _result;
		int _l_result31 = _in.read_long();
		_result = new org.omg.zx.alarmMgr.PerceivedSeverity_T[_l_result31];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.zx.alarmMgr.PerceivedSeverity_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.zx.alarmMgr.PerceivedSeverity_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.zx.alarmMgr.PerceivedSeverity_THelper.write(_out,_s[i]);
		}

	}
}
