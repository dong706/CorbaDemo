package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "VLAN_T"
 *	@author JacORB IDL compiler 
 */

public final class VLAN_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.VLAN_T value;

	public VLAN_THolder ()
	{
	}
	public VLAN_THolder(final org.omg.zx.emsMgr.VLAN_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.emsMgr.VLAN_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.emsMgr.VLAN_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.emsMgr.VLAN_THelper.write(_out, value);
	}
}
