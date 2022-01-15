package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "RouteAndTopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndTopologicalLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T value;

	public RouteAndTopologicalLink_THolder ()
	{
	}
	public RouteAndTopologicalLink_THolder(final org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLink_THelper.write(_out, value);
	}
}
