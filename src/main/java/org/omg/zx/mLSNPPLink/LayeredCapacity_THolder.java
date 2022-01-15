package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL definition of struct "LayeredCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredCapacity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPPLink.LayeredCapacity_T value;

	public LayeredCapacity_THolder ()
	{
	}
	public LayeredCapacity_THolder(final org.omg.zx.mLSNPPLink.LayeredCapacity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.mLSNPPLink.LayeredCapacity_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.mLSNPPLink.LayeredCapacity_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.mLSNPPLink.LayeredCapacity_THelper.write(_out, value);
	}
}
