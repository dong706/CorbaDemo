package org.omg.hw.protection;

/**
 *	Generated from IDL definition of alias "SwitchDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchDataList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.hw.protection.SwitchData_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.hw.protection.SwitchData_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.protection.SwitchDataList_THelper.id(), "SwitchDataList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.hw.protection.SwitchData_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/SwitchDataList_T:1.0";
	}
	public static org.omg.hw.protection.SwitchData_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.protection.SwitchData_T[] _result;
		int _l_result20 = _in.read_long();
		_result = new org.omg.hw.protection.SwitchData_T[_l_result20];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.hw.protection.SwitchData_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.protection.SwitchData_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.hw.protection.SwitchData_THelper.write(_out,_s[i]);
		}

	}
}
