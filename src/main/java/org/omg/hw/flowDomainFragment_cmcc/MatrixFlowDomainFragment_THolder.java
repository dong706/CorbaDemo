package org.omg.hw.flowDomainFragment_cmcc;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T value;

	public MatrixFlowDomainFragment_THolder ()
	{
	}
	public MatrixFlowDomainFragment_THolder(final org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragment_THelper.write(_out, value);
	}
}
