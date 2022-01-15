package org.omg.hw.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ProxyPullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ProxyPullConsumerPOATie
	extends ProxyPullConsumerPOA
{
	private ProxyPullConsumerOperations _delegate;

	private POA _poa;
	public ProxyPullConsumerPOATie(ProxyPullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPullConsumerPOATie(ProxyPullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosEventChannelAdmin.ProxyPullConsumer _this()
	{
		return org.omg.hw.CosEventChannelAdmin.ProxyPullConsumerHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventChannelAdmin.ProxyPullConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventChannelAdmin.ProxyPullConsumerHelper.narrow(_this_object(orb));
	}
	public ProxyPullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPullConsumerOperations delegate)
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
	public void connect_pull_supplier(org.omg.hw.CosEventComm.PullSupplier pull_supplier) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected
	{
_delegate.connect_pull_supplier(pull_supplier);
	}

	public void disconnect_pull_consumer()
	{
_delegate.disconnect_pull_consumer();
	}

}
