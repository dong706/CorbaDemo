package org.omg.zx.performance;

/**
 *	Generated from IDL definition of alias "PMTPParamSelectList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPParamSelectList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMTPParamSelect_T[] value;

	public PMTPParamSelectList_THolder ()
	{
	}
	public PMTPParamSelectList_THolder (final org.omg.zx.performance.PMTPParamSelect_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMTPParamSelectList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMTPParamSelectList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMTPParamSelectList_THelper.write (out,value);
	}
}
