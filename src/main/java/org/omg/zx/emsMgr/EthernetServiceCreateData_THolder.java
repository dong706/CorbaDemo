package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "EthernetServiceCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetServiceCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.EthernetServiceCreateData_T value;

	public EthernetServiceCreateData_THolder ()
	{
	}
	public EthernetServiceCreateData_THolder(final org.omg.zx.emsMgr.EthernetServiceCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.emsMgr.EthernetServiceCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.emsMgr.EthernetServiceCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.emsMgr.EthernetServiceCreateData_THelper.write(_out, value);
	}
}
