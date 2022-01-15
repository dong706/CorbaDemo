package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteDescriptor_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.subnetworkConnection.RouteDescriptor_T value;

	public RouteDescriptor_THolder ()
	{
	}
	public RouteDescriptor_THolder(final org.omg.zx.subnetworkConnection.RouteDescriptor_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.subnetworkConnection.RouteDescriptor_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.subnetworkConnection.RouteDescriptor_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.subnetworkConnection.RouteDescriptor_THelper.write(_out, value);
	}
}
