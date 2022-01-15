package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "VB_T"
 *	@author JacORB IDL compiler 
 */

public final class VB_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.VB_T value;

	public VB_THolder ()
	{
	}
	public VB_THolder(final org.omg.zx.emsMgr.VB_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.emsMgr.VB_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.emsMgr.VB_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.emsMgr.VB_THelper.write(_out, value);
	}
}
