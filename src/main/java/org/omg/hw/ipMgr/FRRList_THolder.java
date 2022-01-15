package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of alias "FRRList_T"
 *	@author JacORB IDL compiler 
 */

public final class FRRList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.FRRProtection_T[] value;

	public FRRList_THolder ()
	{
	}
	public FRRList_THolder (final org.omg.hw.ipMgr.FRRProtection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FRRList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FRRList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FRRList_THelper.write (out,value);
	}
}
