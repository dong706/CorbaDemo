package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL interface "RouteAndTopologicalLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class RouteAndTopologicalLinkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public RouteAndTopologicalLinkIterator_I value;
	public RouteAndTopologicalLinkIterator_IHolder()
	{
	}
	public RouteAndTopologicalLinkIterator_IHolder (final RouteAndTopologicalLinkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RouteAndTopologicalLinkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteAndTopologicalLinkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RouteAndTopologicalLinkIterator_IHelper.write (_out,value);
	}
}
