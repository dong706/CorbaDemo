package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of alias "VLANList_T"
 *	@author JacORB IDL compiler 
 */

public final class VLANList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.VLAN_T[] value;

	public VLANList_THolder ()
	{
	}
	public VLANList_THolder (final org.omg.zx.emsMgr.VLAN_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VLANList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VLANList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		VLANList_THelper.write (out,value);
	}
}
