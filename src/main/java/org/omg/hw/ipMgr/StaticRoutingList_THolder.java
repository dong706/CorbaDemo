package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of alias "StaticRoutingList_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticRoutingList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.StaticRouting_T[] value;

	public StaticRoutingList_THolder ()
	{
	}
	public StaticRoutingList_THolder (final org.omg.hw.ipMgr.StaticRouting_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StaticRoutingList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StaticRoutingList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StaticRoutingList_THelper.write (out,value);
	}
}
