package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "TestDuration_T"
 *	@author JacORB IDL compiler 
 */

public final class TestDuration_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.maintenanceOps.TestDuration_T value;

	public TestDuration_THolder ()
	{
	}
	public TestDuration_THolder(final org.omg.hw.maintenanceOps.TestDuration_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.maintenanceOps.TestDuration_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.maintenanceOps.TestDuration_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.maintenanceOps.TestDuration_THelper.write(_out, value);
	}
}
