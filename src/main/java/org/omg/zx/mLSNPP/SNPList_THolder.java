package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of alias "SNPList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.SNP_T[] value;

	public SNPList_THolder ()
	{
	}
	public SNPList_THolder (final org.omg.zx.mLSNPP.SNP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNPList_THelper.write (out,value);
	}
}
