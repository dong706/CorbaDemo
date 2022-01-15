package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of alias "EthernetServiceList_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetServiceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.EthernetService_T[] value;

	public EthernetServiceList_THolder ()
	{
	}
	public EthernetServiceList_THolder (final org.omg.zx.emsMgr.EthernetService_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetServiceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetServiceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetServiceList_THelper.write (out,value);
	}
}
