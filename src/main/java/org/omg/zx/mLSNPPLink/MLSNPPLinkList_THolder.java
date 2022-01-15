package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL definition of alias "MLSNPPLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class MLSNPPLinkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T[] value;

	public MLSNPPLinkList_THolder ()
	{
	}
	public MLSNPPLinkList_THolder (final org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MLSNPPLinkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MLSNPPLinkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MLSNPPLinkList_THelper.write (out,value);
	}
}
