package org.omg.hw.flowDomain_cmcc;

/**
 *	Generated from IDL definition of struct "MFDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.flowDomain_cmcc.MFDModifyData_T value;

	public MFDModifyData_THolder ()
	{
	}
	public MFDModifyData_THolder(final org.omg.hw.flowDomain_cmcc.MFDModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.flowDomain_cmcc.MFDModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.flowDomain_cmcc.MFDModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.flowDomain_cmcc.MFDModifyData_THelper.write(_out, value);
	}
}
