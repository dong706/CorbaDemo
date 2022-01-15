package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CreatePresetRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreatePresetRouteData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.subnetworkConnection.CreatePresetRouteData_T value;

	public CreatePresetRouteData_THolder ()
	{
	}
	public CreatePresetRouteData_THolder(final org.omg.hw.subnetworkConnection.CreatePresetRouteData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.subnetworkConnection.CreatePresetRouteData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.subnetworkConnection.CreatePresetRouteData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.subnetworkConnection.CreatePresetRouteData_THelper.write(_out, value);
	}
}
