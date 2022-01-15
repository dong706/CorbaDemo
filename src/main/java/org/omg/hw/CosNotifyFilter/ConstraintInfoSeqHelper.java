package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of alias "ConstraintInfoSeq"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintInfoSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.hw.CosNotifyFilter.ConstraintInfo[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.hw.CosNotifyFilter.ConstraintInfo[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.id(), "ConstraintInfoSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.hw.CosNotifyFilter.ConstraintInfoHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/ConstraintInfoSeq:1.0";
	}
	public static org.omg.hw.CosNotifyFilter.ConstraintInfo[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.CosNotifyFilter.ConstraintInfo[] _result;
		int _l_result63 = _in.read_long();
		_result = new org.omg.hw.CosNotifyFilter.ConstraintInfo[_l_result63];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.hw.CosNotifyFilter.ConstraintInfoHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.CosNotifyFilter.ConstraintInfo[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.hw.CosNotifyFilter.ConstraintInfoHelper.write(_out,_s[i]);
		}

	}
}
