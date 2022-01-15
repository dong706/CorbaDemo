package org.omg.hw.flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetOAMOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMOperation_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.flowDomain.EthernetOAMOperation_T value;

	public EthernetOAMOperation_THolder ()
	{
	}
	public EthernetOAMOperation_THolder(final org.omg.hw.flowDomain.EthernetOAMOperation_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.flowDomain.EthernetOAMOperation_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.flowDomain.EthernetOAMOperation_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.flowDomain.EthernetOAMOperation_THelper.write(_out, value);
	}
}
