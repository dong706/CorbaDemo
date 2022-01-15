package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of alias "RouteAndTopologicalLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndTopologicalLinkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T[] value;

	public RouteAndTopologicalLinkList_THolder ()
	{
	}
	public RouteAndTopologicalLinkList_THolder (final org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteAndTopologicalLinkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteAndTopologicalLinkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteAndTopologicalLinkList_THelper.write (out,value);
	}
}
