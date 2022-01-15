package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of alias "VRRPList_T"
 *	@author JacORB IDL compiler 
 */

public final class VRRPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.VRRPProtection_T[] value;

	public VRRPList_THolder ()
	{
	}
	public VRRPList_THolder (final org.omg.hw.ipMgr.VRRPProtection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VRRPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VRRPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		VRRPList_THelper.write (out,value);
	}
}
