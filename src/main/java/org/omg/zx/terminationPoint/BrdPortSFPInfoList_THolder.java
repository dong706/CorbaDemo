package org.omg.zx.terminationPoint;

/**
 *	Generated from IDL definition of alias "BrdPortSFPInfoList_T"
 *	@author JacORB IDL compiler 
 */

public final class BrdPortSFPInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.terminationPoint.BrdPortSFPInfo_T[] value;

	public BrdPortSFPInfoList_THolder ()
	{
	}
	public BrdPortSFPInfoList_THolder (final org.omg.zx.terminationPoint.BrdPortSFPInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BrdPortSFPInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BrdPortSFPInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BrdPortSFPInfoList_THelper.write (out,value);
	}
}
