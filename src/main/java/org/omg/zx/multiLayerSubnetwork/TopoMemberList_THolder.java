package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of alias "TopoMemberList_T"
 *	@author JacORB IDL compiler 
 */

public final class TopoMemberList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.multiLayerSubnetwork.TopoMember_T[] value;

	public TopoMemberList_THolder ()
	{
	}
	public TopoMemberList_THolder (final org.omg.zx.multiLayerSubnetwork.TopoMember_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TopoMemberList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopoMemberList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TopoMemberList_THelper.write (out,value);
	}
}
