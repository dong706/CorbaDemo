package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL definition of alias "AvailableCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class AvailableCapacity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPPLink.LayeredCapacity_T[] value;

	public AvailableCapacity_THolder ()
	{
	}
	public AvailableCapacity_THolder (final org.omg.zx.mLSNPPLink.LayeredCapacity_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AvailableCapacity_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AvailableCapacity_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AvailableCapacity_THelper.write (out,value);
	}
}
