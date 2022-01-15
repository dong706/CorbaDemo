package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CreateSharedRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreateSharedRouteData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.subnetworkConnection.CreateSharedRouteData_T value;

	public CreateSharedRouteData_THolder ()
	{
	}
	public CreateSharedRouteData_THolder(final org.omg.hw.subnetworkConnection.CreateSharedRouteData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.subnetworkConnection.CreateSharedRouteData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.subnetworkConnection.CreateSharedRouteData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.subnetworkConnection.CreateSharedRouteData_THelper.write(_out, value);
	}
}
