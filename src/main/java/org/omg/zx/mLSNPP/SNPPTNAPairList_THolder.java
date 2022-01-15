package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of alias "SNPPTNAPairList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPTNAPairList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.SNPPTNAPair_T[] value;

	public SNPPTNAPairList_THolder ()
	{
	}
	public SNPPTNAPairList_THolder (final org.omg.zx.mLSNPP.SNPPTNAPair_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNPPTNAPairList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNPPTNAPairList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNPPTNAPairList_THelper.write (out,value);
	}
}
