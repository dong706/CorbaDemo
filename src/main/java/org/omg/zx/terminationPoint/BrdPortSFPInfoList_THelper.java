package org.omg.zx.terminationPoint;

/**
 *	Generated from IDL definition of alias "BrdPortSFPInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class BrdPortSFPInfoList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.zx.terminationPoint.BrdPortSFPInfo_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.zx.terminationPoint.BrdPortSFPInfo_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.zx.terminationPoint.BrdPortSFPInfoList_THelper.id(), "BrdPortSFPInfoList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.zx.terminationPoint.BrdPortSFPInfo_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/BrdPortSFPInfoList_T:1.0";
	}
	public static org.omg.zx.terminationPoint.BrdPortSFPInfo_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.zx.terminationPoint.BrdPortSFPInfo_T[] _result;
		int _l_result40 = _in.read_long();
		_result = new org.omg.zx.terminationPoint.BrdPortSFPInfo_T[_l_result40];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.zx.terminationPoint.BrdPortSFPInfo_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.zx.terminationPoint.BrdPortSFPInfo_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.zx.terminationPoint.BrdPortSFPInfo_THelper.write(_out,_s[i]);
		}

	}
}
