package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of alias "TopologicalSubnetworkList_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalSubnetworkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T[] value;

	public TopologicalSubnetworkList_THolder ()
	{
	}
	public TopologicalSubnetworkList_THolder (final org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TopologicalSubnetworkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopologicalSubnetworkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TopologicalSubnetworkList_THelper.write (out,value);
	}
}
