package org.omg.hw.multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "RouteAndTopologicalLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class RouteAndTopologicalLinkIterator_IPOATie
	extends RouteAndTopologicalLinkIterator_IPOA
{
	private RouteAndTopologicalLinkIterator_IOperations _delegate;

	private POA _poa;
	public RouteAndTopologicalLinkIterator_IPOATie(RouteAndTopologicalLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public RouteAndTopologicalLinkIterator_IPOATie(RouteAndTopologicalLinkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_I _this()
	{
		return org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHelper.narrow(_this_object(orb));
	}
	public RouteAndTopologicalLinkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RouteAndTopologicalLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder routeAndTlList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,routeAndTlList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
