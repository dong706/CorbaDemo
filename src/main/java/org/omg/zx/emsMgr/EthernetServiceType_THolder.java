package org.omg.zx.emsMgr;
/**
 *	Generated from IDL definition of enum "EthernetServiceType_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetServiceType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public EthernetServiceType_T value;

	public EthernetServiceType_THolder ()
	{
	}
	public EthernetServiceType_THolder (final EthernetServiceType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetServiceType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetServiceType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetServiceType_THelper.write (out,value);
	}
}
