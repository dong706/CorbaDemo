package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL definition of alias "SNPPLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPLinkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPPLink.SNPPLink_T[] value;

	public SNPPLinkList_THolder ()
	{
	}
	public SNPPLinkList_THolder (final org.omg.zx.mLSNPPLink.SNPPLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNPPLinkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNPPLinkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNPPLinkList_THelper.write (out,value);
	}
}
