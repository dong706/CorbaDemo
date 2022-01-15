package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of alias "VRFList_T"
 *	@author JacORB IDL compiler 
 */

public final class VRFList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.VRF_T[] value;

	public VRFList_THolder ()
	{
	}
	public VRFList_THolder (final org.omg.hw.ipMgr.VRF_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VRFList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VRFList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		VRFList_THelper.write (out,value);
	}
}
