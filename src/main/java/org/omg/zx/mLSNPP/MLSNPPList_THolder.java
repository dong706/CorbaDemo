package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of alias "MLSNPPList_T"
 *	@author JacORB IDL compiler 
 */

public final class MLSNPPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.MultiLayerSNPP_T[] value;

	public MLSNPPList_THolder ()
	{
	}
	public MLSNPPList_THolder (final org.omg.zx.mLSNPP.MultiLayerSNPP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MLSNPPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MLSNPPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MLSNPPList_THelper.write (out,value);
	}
}
