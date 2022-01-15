package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "TopologicalSubnetwork_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalSubnetwork_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T value;

	public TopologicalSubnetwork_THolder ()
	{
	}
	public TopologicalSubnetwork_THolder(final org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THelper.write(_out, value);
	}
}
