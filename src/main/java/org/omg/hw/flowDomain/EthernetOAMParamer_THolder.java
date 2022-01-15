package org.omg.hw.flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetOAMParamer_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMParamer_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.flowDomain.EthernetOAMParamer_T value;

	public EthernetOAMParamer_THolder ()
	{
	}
	public EthernetOAMParamer_THolder(final org.omg.hw.flowDomain.EthernetOAMParamer_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.flowDomain.EthernetOAMParamer_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.flowDomain.EthernetOAMParamer_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.flowDomain.EthernetOAMParamer_THelper.write(_out, value);
	}
}
