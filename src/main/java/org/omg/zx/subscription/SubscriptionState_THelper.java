package org.omg.zx.subscription;
/**
 *	Generated from IDL definition of enum "SubscriptionState_T"
 *	@author JacORB IDL compiler 
 */

public final class SubscriptionState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.zx.subscription.SubscriptionState_THelper.id(),"SubscriptionState_T",new String[]{"SS_WORKING","SS_SUSPEND","SS_NO_EXIST"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.subscription.SubscriptionState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.subscription.SubscriptionState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subscription/SubscriptionState_T:1.0";
	}
	public static SubscriptionState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return SubscriptionState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SubscriptionState_T s)
	{
		out.write_long(s.value());
	}
}
