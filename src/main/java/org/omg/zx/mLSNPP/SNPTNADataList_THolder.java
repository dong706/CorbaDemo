package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of alias "SNPTNADataList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNADataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.mLSNPP.SNPTNAData_T[] value;

	public SNPTNADataList_THolder ()
	{
	}
	public SNPTNADataList_THolder (final org.omg.zx.mLSNPP.SNPTNAData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNPTNADataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNPTNADataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNPTNADataList_THelper.write (out,value);
	}
}
