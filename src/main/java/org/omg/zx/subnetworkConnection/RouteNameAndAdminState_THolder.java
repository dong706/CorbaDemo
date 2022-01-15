package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteNameAndAdminState_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteNameAndAdminState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.subnetworkConnection.RouteNameAndAdminState_T value;

	public RouteNameAndAdminState_THolder ()
	{
	}
	public RouteNameAndAdminState_THolder(final org.omg.zx.subnetworkConnection.RouteNameAndAdminState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.subnetworkConnection.RouteNameAndAdminState_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.subnetworkConnection.RouteNameAndAdminState_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.subnetworkConnection.RouteNameAndAdminState_THelper.write(_out, value);
	}
}
