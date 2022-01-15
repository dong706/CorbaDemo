package org.omg.hw.encapsulationLayerLink;

/**
 *	Generated from IDL definition of struct "ELLinkModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.encapsulationLayerLink.ELLinkModifyData_T value;

	public ELLinkModifyData_THolder ()
	{
	}
	public ELLinkModifyData_THolder(final org.omg.hw.encapsulationLayerLink.ELLinkModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.encapsulationLayerLink.ELLinkModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.encapsulationLayerLink.ELLinkModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.encapsulationLayerLink.ELLinkModifyData_THelper.write(_out, value);
	}
}
