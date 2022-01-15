package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ObtainInfoMode"
 *	@author JacORB IDL compiler 
 */

public final class ObtainInfoModeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.hw.CosNotifyChannelAdmin.ObtainInfoModeHelper.id(),"ObtainInfoMode",new String[]{"ALL_NOW_UPDATES_OFF","ALL_NOW_UPDATES_ON","NONE_NOW_UPDATES_OFF","NONE_NOW_UPDATES_ON"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyChannelAdmin.ObtainInfoMode s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyChannelAdmin.ObtainInfoMode extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/ObtainInfoMode:1.0";
	}
	public static ObtainInfoMode read (final org.omg.CORBA.portable.InputStream in)
	{
		return ObtainInfoMode.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ObtainInfoMode s)
	{
		out.write_long(s.value());
	}
}
