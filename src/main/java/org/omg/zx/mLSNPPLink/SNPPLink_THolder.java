package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL definition of struct "SNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPPLink.SNPPLink_T value;

	public SNPPLink_THolder ()
	{
	}
	public SNPPLink_THolder(final org.omg.zx.mLSNPPLink.SNPPLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.mLSNPPLink.SNPPLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.mLSNPPLink.SNPPLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.mLSNPPLink.SNPPLink_THelper.write(_out, value);
	}
}
