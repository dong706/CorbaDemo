package org.omg.hw.flowDomainFragment_cmcc;

/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_T value;

	public FlowDomainFragment_THolder ()
	{
	}
	public FlowDomainFragment_THolder(final org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out, value);
	}
}
