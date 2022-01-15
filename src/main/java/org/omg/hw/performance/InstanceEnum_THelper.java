package org.omg.hw.performance;
/**
 *	Generated from IDL definition of enum "InstanceEnum_T"
 *	@author JacORB IDL compiler 
 */

public final class InstanceEnum_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.hw.performance.InstanceEnum_THelper.id(),"InstanceEnum_T",new String[]{"DATA","TCA"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.performance.InstanceEnum_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.performance.InstanceEnum_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/InstanceEnum_T:1.0";
	}
	public static InstanceEnum_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return InstanceEnum_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final InstanceEnum_T s)
	{
		out.write_long(s.value());
	}
}
