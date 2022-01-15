package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of struct "EMS_T"
 *	@author JacORB IDL compiler 
 */

public final class EMS_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.emsMgr.EMS_T value;

	public EMS_THolder ()
	{
	}
	public EMS_THolder(final org.omg.hw.emsMgr.EMS_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.emsMgr.EMS_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.emsMgr.EMS_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.emsMgr.EMS_THelper.write(_out, value);
	}
}
