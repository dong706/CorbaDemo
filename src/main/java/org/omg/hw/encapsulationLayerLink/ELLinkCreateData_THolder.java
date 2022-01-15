package org.omg.hw.encapsulationLayerLink;

/**
 *	Generated from IDL definition of struct "ELLinkCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.encapsulationLayerLink.ELLinkCreateData_T value;

	public ELLinkCreateData_THolder ()
	{
	}
	public ELLinkCreateData_THolder(final org.omg.hw.encapsulationLayerLink.ELLinkCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.encapsulationLayerLink.ELLinkCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.encapsulationLayerLink.ELLinkCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.encapsulationLayerLink.ELLinkCreateData_THelper.write(_out, value);
	}
}
