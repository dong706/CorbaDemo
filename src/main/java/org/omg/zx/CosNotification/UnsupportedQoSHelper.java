package org.omg.zx.CosNotification;


/**
 *	Generated from IDL definition of exception "UnsupportedQoS"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedQoSHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.zx.CosNotification.UnsupportedQoSHelper.id(),"UnsupportedQoS",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("qos_err", org.omg.zx.CosNotification.PropertyErrorSeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.CosNotification.UnsupportedQoS s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.CosNotification.UnsupportedQoS extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/UnsupportedQoS:1.0";
	}
	public static org.omg.zx.CosNotification.UnsupportedQoS read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.CosNotification.UnsupportedQoS result = new org.omg.zx.CosNotification.UnsupportedQoS();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.qos_err = org.omg.zx.CosNotification.PropertyErrorSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.CosNotification.UnsupportedQoS s)
	{
		out.write_string(id());
		org.omg.zx.CosNotification.PropertyErrorSeqHelper.write(out,s.qos_err);
	}
}
