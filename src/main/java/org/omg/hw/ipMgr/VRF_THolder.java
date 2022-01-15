package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "VRF_T"
 *	@author JacORB IDL compiler 
 */

public final class VRF_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.VRF_T value;

	public VRF_THolder ()
	{
	}
	public VRF_THolder(final org.omg.hw.ipMgr.VRF_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.ipMgr.VRF_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.ipMgr.VRF_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.ipMgr.VRF_THelper.write(_out, value);
	}
}
