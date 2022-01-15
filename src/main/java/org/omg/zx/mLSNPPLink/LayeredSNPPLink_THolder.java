package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL definition of struct "LayeredSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPPLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPPLink.LayeredSNPPLink_T value;

	public LayeredSNPPLink_THolder ()
	{
	}
	public LayeredSNPPLink_THolder(final org.omg.zx.mLSNPPLink.LayeredSNPPLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.mLSNPPLink.LayeredSNPPLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.mLSNPPLink.LayeredSNPPLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.mLSNPPLink.LayeredSNPPLink_THelper.write(_out, value);
	}
}
