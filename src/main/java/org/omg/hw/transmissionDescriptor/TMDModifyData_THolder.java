package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TMDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TMDModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.transmissionDescriptor.TMDModifyData_T value;

	public TMDModifyData_THolder ()
	{
	}
	public TMDModifyData_THolder(final org.omg.hw.transmissionDescriptor.TMDModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.transmissionDescriptor.TMDModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.transmissionDescriptor.TMDModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.transmissionDescriptor.TMDModifyData_THelper.write(_out, value);
	}
}
