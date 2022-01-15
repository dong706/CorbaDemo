package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ObtainInfoMode"
 *	@author JacORB IDL compiler 
 */

public final class ObtainInfoModeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ObtainInfoMode value;

	public ObtainInfoModeHolder ()
	{
	}
	public ObtainInfoModeHolder (final ObtainInfoMode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObtainInfoModeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObtainInfoModeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObtainInfoModeHelper.write (out,value);
	}
}
