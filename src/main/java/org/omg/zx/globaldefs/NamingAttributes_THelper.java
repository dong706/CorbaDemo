package org.omg.zx.globaldefs;

/**
 *	Generated from IDL definition of alias "NamingAttributes_T"
 *	@author JacORB IDL compiler 
 */

public final class NamingAttributes_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.zx.globaldefs.NameAndStringValue_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.zx.globaldefs.NameAndStringValue_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.zx.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.zx.globaldefs.NVSList_THelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/NamingAttributes_T:1.0";
	}
	public static org.omg.zx.globaldefs.NameAndStringValue_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.zx.globaldefs.NameAndStringValue_T[] _result;
		_result = org.omg.zx.globaldefs.NVSList_THelper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.zx.globaldefs.NameAndStringValue_T[] _s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(_out,_s);
	}
}
