package org.omg.hw.trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.trafficDescriptor.TDCreateData_T value;

	public TDCreateData_THolder ()
	{
	}
	public TDCreateData_THolder(final org.omg.hw.trafficDescriptor.TDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.trafficDescriptor.TDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.trafficDescriptor.TDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.trafficDescriptor.TDCreateData_THelper.write(_out, value);
	}
}
