package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of alias "IPRouteInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class IPRouteInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_vpnManager.IPRouteInfo_T[] value;

	public IPRouteInfoList_THolder ()
	{
	}
	public IPRouteInfoList_THolder (final org.omg.hw.HW_vpnManager.IPRouteInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IPRouteInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPRouteInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IPRouteInfoList_THelper.write (out,value);
	}
}
