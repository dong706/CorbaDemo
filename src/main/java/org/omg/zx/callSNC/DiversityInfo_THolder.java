package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "DiversityInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class DiversityInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.callSNC.DiversityInfo_T value;

	public DiversityInfo_THolder ()
	{
	}
	public DiversityInfo_THolder(final org.omg.zx.callSNC.DiversityInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.callSNC.DiversityInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.callSNC.DiversityInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.callSNC.DiversityInfo_THelper.write(_out, value);
	}
}
