package org.omg.zx.managedElement;
/**
 *	Generated from IDL definition of enum "TCCapability_T"
 *	@author JacORB IDL compiler 
 */

public final class TCCapability_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.zx.managedElement.TCCapability_THelper.id(),"TCCapability_T",new String[]{"TCC_NA","TCC_4x4","TCC_8x8","TCC_16x16","TCC_32x32","TCC_64x64","TCC_128x128"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.managedElement.TCCapability_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.managedElement.TCCapability_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/TCCapability_T:1.0";
	}
	public static TCCapability_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return TCCapability_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TCCapability_T s)
	{
		out.write_long(s.value());
	}
}
