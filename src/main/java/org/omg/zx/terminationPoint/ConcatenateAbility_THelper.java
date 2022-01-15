package org.omg.zx.terminationPoint;
/**
 *	Generated from IDL definition of enum "ConcatenateAbility_T"
 *	@author JacORB IDL compiler 
 */

public final class ConcatenateAbility_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.zx.terminationPoint.ConcatenateAbility_THelper.id(),"ConcatenateAbility_T",new String[]{"CA_NOT","CA_STANDARD","CA_CONTINUAL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.terminationPoint.ConcatenateAbility_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.terminationPoint.ConcatenateAbility_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/ConcatenateAbility_T:1.0";
	}
	public static ConcatenateAbility_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ConcatenateAbility_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ConcatenateAbility_T s)
	{
		out.write_long(s.value());
	}
}
