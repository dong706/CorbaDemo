package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "InterFilterGroupOperator"
 *	@author JacORB IDL compiler 
 */

public final class InterFilterGroupOperatorHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.id(),"InterFilterGroupOperator",new String[]{"AND_OP","OR_OP"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/InterFilterGroupOperator:1.0";
	}
	public static InterFilterGroupOperator read (final org.omg.CORBA.portable.InputStream in)
	{
		return InterFilterGroupOperator.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final InterFilterGroupOperator s)
	{
		out.write_long(s.value());
	}
}
