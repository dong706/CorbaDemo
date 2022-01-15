package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of alias "LayeredSNPPList_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.LayeredSNPP_T[] value;

	public LayeredSNPPList_THolder ()
	{
	}
	public LayeredSNPPList_THolder (final org.omg.zx.mLSNPP.LayeredSNPP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LayeredSNPPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LayeredSNPPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LayeredSNPPList_THelper.write (out,value);
	}
}
