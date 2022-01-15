package org.omg.zx.aSAP;

/**
 *	Generated from IDL definition of alias "ASAPList_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.aSAP.ASAP_T[] value;

	public ASAPList_THolder ()
	{
	}
	public ASAPList_THolder (final org.omg.zx.aSAP.ASAP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ASAPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ASAPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ASAPList_THelper.write (out,value);
	}
}
