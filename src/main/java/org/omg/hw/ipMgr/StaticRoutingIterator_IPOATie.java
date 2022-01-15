package org.omg.hw.ipMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "StaticRoutingIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class StaticRoutingIterator_IPOATie
	extends StaticRoutingIterator_IPOA
{
	private StaticRoutingIterator_IOperations _delegate;

	private POA _poa;
	public StaticRoutingIterator_IPOATie(StaticRoutingIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public StaticRoutingIterator_IPOATie(StaticRoutingIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.ipMgr.StaticRoutingIterator_I _this()
	{
		return org.omg.hw.ipMgr.StaticRoutingIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.ipMgr.StaticRoutingIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.ipMgr.StaticRoutingIterator_IHelper.narrow(_this_object(orb));
	}
	public StaticRoutingIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StaticRoutingIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.ipMgr.StaticRoutingList_THolder srList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,srList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
