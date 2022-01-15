package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of alias "BridgeList_T"
 *	@author JacORB IDL compiler 
 */

public final class BridgeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.ipMgr.Bridge_T[] value;

	public BridgeList_THolder ()
	{
	}
	public BridgeList_THolder (final org.omg.hw.ipMgr.Bridge_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BridgeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BridgeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BridgeList_THelper.write (out,value);
	}
}
