package org.omg.zx.alarmMgr;
/**
 *	Generated from IDL definition of enum "AlarmType_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.zx.alarmMgr.AlarmType_THelper.id(),"AlarmType_T",new String[]{"AT_COMMUNICATIONSALARM","AT_QOSALARM","AT_EQUIPMENTALARM","AT_PROCESSINGERRORALARM","AT_ENVIRONMENTALALARM","AT_NETWORKSECURITYALARM","AT_CONNECTIONALARM"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.alarmMgr.AlarmType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.alarmMgr.AlarmType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/AlarmType_T:1.0";
	}
	public static AlarmType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return AlarmType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final AlarmType_T s)
	{
		out.write_long(s.value());
	}
}
