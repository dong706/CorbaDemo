package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPTNAData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.SNPTNAData_T value;

	public SNPTNAData_THolder ()
	{
	}
	public SNPTNAData_THolder(final org.omg.zx.mLSNPP.SNPTNAData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.mLSNPP.SNPTNAData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.mLSNPP.SNPTNAData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.mLSNPP.SNPTNAData_THelper.write(_out, value);
	}
}
