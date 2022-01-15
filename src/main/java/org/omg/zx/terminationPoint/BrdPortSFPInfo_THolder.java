package org.omg.zx.terminationPoint;

/**
 *	Generated from IDL definition of struct "BrdPortSFPInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class BrdPortSFPInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.terminationPoint.BrdPortSFPInfo_T value;

	public BrdPortSFPInfo_THolder ()
	{
	}
	public BrdPortSFPInfo_THolder(final org.omg.zx.terminationPoint.BrdPortSFPInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.terminationPoint.BrdPortSFPInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.terminationPoint.BrdPortSFPInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.terminationPoint.BrdPortSFPInfo_THelper.write(_out, value);
	}
}
