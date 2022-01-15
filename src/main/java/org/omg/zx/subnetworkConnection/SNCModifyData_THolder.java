package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.subnetworkConnection.SNCModifyData_T value;

	public SNCModifyData_THolder ()
	{
	}
	public SNCModifyData_THolder(final org.omg.zx.subnetworkConnection.SNCModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.subnetworkConnection.SNCModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.subnetworkConnection.SNCModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.subnetworkConnection.SNCModifyData_THelper.write(_out, value);
	}
}
