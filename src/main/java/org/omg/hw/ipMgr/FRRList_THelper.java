package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of alias "FRRList_T"
 *	@author JacORB IDL compiler 
 */

public final class FRRList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.hw.ipMgr.FRRProtection_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.hw.ipMgr.FRRProtection_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.ipMgr.FRRList_THelper.id(), "FRRList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.hw.ipMgr.FRRProtection_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/ipMgr/FRRList_T:1.0";
	}
	public static org.omg.hw.ipMgr.FRRProtection_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.ipMgr.FRRProtection_T[] _result;
		int _l_result157 = _in.read_long();
		_result = new org.omg.hw.ipMgr.FRRProtection_T[_l_result157];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.hw.ipMgr.FRRProtection_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.ipMgr.FRRProtection_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.hw.ipMgr.FRRProtection_THelper.write(_out,_s[i]);
		}

	}
}
