package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of alias "RPRNodeStatusList_T"
 *	@author JacORB IDL compiler 
 */

public final class RPRNodeStatusList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.RPRNodeStatus_T[] value;

	public RPRNodeStatusList_THolder ()
	{
	}
	public RPRNodeStatusList_THolder (final org.omg.zx.emsMgr.RPRNodeStatus_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RPRNodeStatusList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RPRNodeStatusList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RPRNodeStatusList_THelper.write (out,value);
	}
}
