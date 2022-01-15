package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "VRRPProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class VRRPProtection_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.VRRPProtection_T value;

	public VRRPProtection_THolder ()
	{
	}
	public VRRPProtection_THolder(final org.omg.hw.ipMgr.VRRPProtection_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.ipMgr.VRRPProtection_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.ipMgr.VRRPProtection_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.ipMgr.VRRPProtection_THelper.write(_out, value);
	}
}
