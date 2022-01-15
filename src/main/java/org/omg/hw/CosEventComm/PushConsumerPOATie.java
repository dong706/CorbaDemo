package org.omg.hw.CosEventComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PushConsumerPOATie
	extends PushConsumerPOA
{
	private PushConsumerOperations _delegate;

	private POA _poa;
	public PushConsumerPOATie(PushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public PushConsumerPOATie(PushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosEventComm.PushConsumer _this()
	{
		return org.omg.hw.CosEventComm.PushConsumerHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventComm.PushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventComm.PushConsumerHelper.narrow(_this_object(orb));
	}
	public PushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PushConsumerOperations delegate)
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
	public void disconnect_push_consumer()
	{
_delegate.disconnect_push_consumer();
	}

	public void push(org.omg.CORBA.Any data) throws org.omg.hw.CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}
