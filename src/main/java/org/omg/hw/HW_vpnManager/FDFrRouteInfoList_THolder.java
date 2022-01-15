package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of alias "FDFrRouteInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrRouteInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_vpnManager.FDFrRouteInfo_T[] value;

	public FDFrRouteInfoList_THolder ()
	{
	}
	public FDFrRouteInfoList_THolder (final org.omg.hw.HW_vpnManager.FDFrRouteInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FDFrRouteInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDFrRouteInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FDFrRouteInfoList_THelper.write (out,value);
	}
}
