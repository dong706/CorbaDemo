package org.omg.hw.TopoManagementManager;

/**
 *	Generated from IDL definition of struct "Node_T"
 *	@author JacORB IDL compiler 
 */

public final class Node_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.TopoManagementManager.Node_T value;

	public Node_THolder ()
	{
	}
	public Node_THolder(final org.omg.hw.TopoManagementManager.Node_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.TopoManagementManager.Node_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.TopoManagementManager.Node_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.TopoManagementManager.Node_THelper.write(_out, value);
	}
}
