package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of alias "DiversityInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class DiversityInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.callSNC.DiversityInfo_T[] value;

	public DiversityInfoList_THolder ()
	{
	}
	public DiversityInfoList_THolder (final org.omg.zx.callSNC.DiversityInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DiversityInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DiversityInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DiversityInfoList_THelper.write (out,value);
	}
}
