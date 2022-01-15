package org.omg.zx.notifications;

/**
 *	Generated from IDL definition of union "AlarmOrTCAIdentifier_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmOrTCAIdentifier_THelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.notifications.AlarmOrTCAIdentifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.notifications.AlarmOrTCAIdentifier_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/AlarmOrTCAIdentifier_T:1.0";
	}
	public static AlarmOrTCAIdentifier_T read (org.omg.CORBA.portable.InputStream in)
	{
		AlarmOrTCAIdentifier_T result = new AlarmOrTCAIdentifier_T ();
		org.omg.zx.notifications.AlarmTypeQualifier_T disc = org.omg.zx.notifications.AlarmTypeQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case org.omg.zx.notifications.AlarmTypeQualifier_T._ALARM:
			{
				org.omg.zx.notifications.AlarmId_T _var;
				_var=org.omg.zx.notifications.AlarmId_THelper.read(in);
				result.alarmId (_var);
				break;
			}
			case org.omg.zx.notifications.AlarmTypeQualifier_T._TCA:
			{
				org.omg.zx.notifications.TCAId_T _var;
				_var=org.omg.zx.notifications.TCAId_THelper.read(in);
				result.tcaId (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, AlarmOrTCAIdentifier_T s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case org.omg.zx.notifications.AlarmTypeQualifier_T._ALARM:
			{
				org.omg.zx.notifications.AlarmId_THelper.write(out,s.alarmId ());
				break;
			}
			case org.omg.zx.notifications.AlarmTypeQualifier_T._TCA:
			{
				org.omg.zx.notifications.TCAId_THelper.write(out,s.tcaId ());
				break;
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[2];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.zx.notifications.AlarmTypeQualifier_THelper.insert(label_any, org.omg.zx.notifications.AlarmTypeQualifier_T.ALARM);
			members[1] = new org.omg.CORBA.UnionMember ("alarmId", label_any, org.omg.zx.notifications.AlarmId_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.zx.notifications.AlarmTypeQualifier_THelper.insert(label_any, org.omg.zx.notifications.AlarmTypeQualifier_T.TCA);
			members[0] = new org.omg.CORBA.UnionMember ("tcaId", label_any, org.omg.zx.notifications.TCAId_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"AlarmOrTCAIdentifier_T",org.omg.zx.notifications.AlarmTypeQualifier_THelper.type(), members);
		}
		return _type;
	}
}
