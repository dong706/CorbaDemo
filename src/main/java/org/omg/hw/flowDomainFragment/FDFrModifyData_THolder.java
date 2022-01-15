package org.omg.hw.flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.flowDomainFragment.FDFrModifyData_T value;

	public FDFrModifyData_THolder ()
	{
	}
	public FDFrModifyData_THolder(final org.omg.hw.flowDomainFragment.FDFrModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.flowDomainFragment.FDFrModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.flowDomainFragment.FDFrModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.flowDomainFragment.FDFrModifyData_THelper.write(_out, value);
	}
}
