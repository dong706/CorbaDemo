package org.omg.hw.subnetworkConnection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SNCIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class SNCIterator_IPOATie
	extends SNCIterator_IPOA
{
	private SNCIterator_IOperations _delegate;

	private POA _poa;
	public SNCIterator_IPOATie(SNCIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public SNCIterator_IPOATie(SNCIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.subnetworkConnection.SNCIterator_I _this()
	{
		return org.omg.hw.subnetworkConnection.SNCIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.subnetworkConnection.SNCIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.subnetworkConnection.SNCIterator_IHelper.narrow(_this_object(orb));
	}
	public SNCIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SNCIterator_IOperations delegate)
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

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,sncList);
	}

}
