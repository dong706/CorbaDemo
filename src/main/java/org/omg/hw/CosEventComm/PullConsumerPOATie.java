package org.omg.hw.CosEventComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PullConsumerPOATie
	extends PullConsumerPOA
{
	private PullConsumerOperations _delegate;

	private POA _poa;
	public PullConsumerPOATie(PullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public PullConsumerPOATie(PullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosEventComm.PullConsumer _this()
	{
		return org.omg.hw.CosEventComm.PullConsumerHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventComm.PullConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventComm.PullConsumerHelper.narrow(_this_object(orb));
	}
	public PullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PullConsumerOperations delegate)
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
	public void disconnect_pull_consumer()
	{
_delegate.disconnect_pull_consumer();
	}

}
