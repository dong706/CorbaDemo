package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.subnetworkConnection.RouteCreateData_T value;

	public RouteCreateData_THolder ()
	{
	}
	public RouteCreateData_THolder(final org.omg.zx.subnetworkConnection.RouteCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.subnetworkConnection.RouteCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.subnetworkConnection.RouteCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.subnetworkConnection.RouteCreateData_THelper.write(_out, value);
	}
}
