package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "EthernetService_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetService_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.EthernetService_T value;

	public EthernetService_THolder ()
	{
	}
	public EthernetService_THolder(final org.omg.zx.emsMgr.EthernetService_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.emsMgr.EthernetService_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.emsMgr.EthernetService_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.emsMgr.EthernetService_THelper.write(_out, value);
	}
}
