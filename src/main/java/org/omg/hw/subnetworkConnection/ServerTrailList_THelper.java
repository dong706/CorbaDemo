package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of alias "ServerTrailList_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerTrailList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.hw.subnetworkConnection.ServerTrail_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.hw.subnetworkConnection.ServerTrail_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.subnetworkConnection.ServerTrailList_THelper.id(), "ServerTrailList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.hw.subnetworkConnection.ServerTrail_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/ServerTrailList_T:1.0";
	}
	public static org.omg.hw.subnetworkConnection.ServerTrail_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.subnetworkConnection.ServerTrail_T[] _result;
		int _l_result16 = _in.read_long();
		_result = new org.omg.hw.subnetworkConnection.ServerTrail_T[_l_result16];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.hw.subnetworkConnection.ServerTrail_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.subnetworkConnection.ServerTrail_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.hw.subnetworkConnection.ServerTrail_THelper.write(_out,_s[i]);
		}

	}
}
