package org.omg.hw.performance;
/**
 *	Generated from IDL definition of enum "AdministrativeState_T"
 *	@author JacORB IDL compiler 
 */

public final class AdministrativeState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.hw.performance.AdministrativeState_THelper.id(),"AdministrativeState_T",new String[]{"AS_Locked","AS_Unlocked"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.AdministrativeState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.AdministrativeState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/AdministrativeState_T:1.0";
	}
	public static AdministrativeState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return AdministrativeState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final AdministrativeState_T s)
	{
		out.write_long(s.value());
	}
}
