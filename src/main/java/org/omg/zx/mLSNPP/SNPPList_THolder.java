package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of alias "SNPPList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.SNPP_T[] value;

	public SNPPList_THolder ()
	{
	}
	public SNPPList_THolder (final org.omg.zx.mLSNPP.SNPP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNPPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNPPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNPPList_THelper.write (out,value);
	}
}
