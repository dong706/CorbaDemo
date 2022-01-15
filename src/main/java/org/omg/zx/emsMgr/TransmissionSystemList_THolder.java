package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of alias "TransmissionSystemList_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionSystemList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.TransmissionSystem_T[] value;

	public TransmissionSystemList_THolder ()
	{
	}
	public TransmissionSystemList_THolder (final org.omg.zx.emsMgr.TransmissionSystem_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TransmissionSystemList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransmissionSystemList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TransmissionSystemList_THelper.write (out,value);
	}
}
