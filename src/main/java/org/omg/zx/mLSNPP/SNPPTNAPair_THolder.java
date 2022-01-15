package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPPTNAPair_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPTNAPair_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.SNPPTNAPair_T value;

	public SNPPTNAPair_THolder ()
	{
	}
	public SNPPTNAPair_THolder(final org.omg.zx.mLSNPP.SNPPTNAPair_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.mLSNPP.SNPPTNAPair_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.mLSNPP.SNPPTNAPair_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.mLSNPP.SNPPTNAPair_THelper.write(_out, value);
	}
}
