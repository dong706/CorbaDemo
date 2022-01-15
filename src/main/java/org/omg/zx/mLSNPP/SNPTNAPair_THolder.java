package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPTNAPair_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAPair_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.SNPTNAPair_T value;

	public SNPTNAPair_THolder ()
	{
	}
	public SNPTNAPair_THolder(final org.omg.zx.mLSNPP.SNPTNAPair_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.mLSNPP.SNPTNAPair_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.mLSNPP.SNPTNAPair_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.mLSNPP.SNPTNAPair_THelper.write(_out, value);
	}
}
