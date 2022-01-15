package org.omg.hw.flowDomain_cmcc;

/**
 *	Generated from IDL definition of struct "FTPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.flowDomain_cmcc.FTPCreateData_T value;

	public FTPCreateData_THolder ()
	{
	}
	public FTPCreateData_THolder(final org.omg.hw.flowDomain_cmcc.FTPCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.flowDomain_cmcc.FTPCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.flowDomain_cmcc.FTPCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.flowDomain_cmcc.FTPCreateData_THelper.write(_out, value);
	}
}
