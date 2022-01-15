package org.omg.zx.topologicalLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TopologicalLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TopologicalLinkIterator_IPOATie
	extends TopologicalLinkIterator_IPOA
{
	private TopologicalLinkIterator_IOperations _delegate;

	private POA _poa;
	public TopologicalLinkIterator_IPOATie(TopologicalLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TopologicalLinkIterator_IPOATie(TopologicalLinkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.topologicalLink.TopologicalLinkIterator_I _this()
	{
		return org.omg.zx.topologicalLink.TopologicalLinkIterator_IHelper.narrow(_this_object());
	}
	public org.omg.zx.topologicalLink.TopologicalLinkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.topologicalLink.TopologicalLinkIterator_IHelper.narrow(_this_object(orb));
	}
	public TopologicalLinkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TopologicalLinkIterator_IOperations delegate)
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
	public boolean next_n(int how_many, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoLinkList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,topoLinkList);
	}

	public int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
