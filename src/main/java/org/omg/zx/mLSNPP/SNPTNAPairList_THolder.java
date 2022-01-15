package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of alias "SNPTNAPairList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAPairList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.SNPTNAPair_T[] value;

	public SNPTNAPairList_THolder ()
	{
	}
	public SNPTNAPairList_THolder (final org.omg.zx.mLSNPP.SNPTNAPair_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNPTNAPairList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNPTNAPairList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNPTNAPairList_THelper.write (out,value);
	}
}
