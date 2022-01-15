package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of alias "VBList_T"
 *	@author JacORB IDL compiler 
 */

public final class VBList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.VB_T[] value;

	public VBList_THolder ()
	{
	}
	public VBList_THolder (final org.omg.zx.emsMgr.VB_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VBList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VBList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		VBList_THelper.write (out,value);
	}
}
