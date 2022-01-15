package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of alias "SNCAndRouteList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRouteList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.callSNC.SNCAndRoute_T[] value;

	public SNCAndRouteList_THolder ()
	{
	}
	public SNCAndRouteList_THolder (final org.omg.zx.callSNC.SNCAndRoute_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCAndRouteList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCAndRouteList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCAndRouteList_THelper.write (out,value);
	}
}
