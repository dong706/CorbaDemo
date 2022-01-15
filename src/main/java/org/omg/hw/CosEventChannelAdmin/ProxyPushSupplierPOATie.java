package org.omg.hw.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ProxyPushSupplierPOATie
	extends ProxyPushSupplierPOA
{
	private ProxyPushSupplierOperations _delegate;

	private POA _poa;
	public ProxyPushSupplierPOATie(ProxyPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPushSupplierPOATie(ProxyPushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier _this()
	{
		return org.omg.hw.CosEventChannelAdmin.ProxyPushSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventChannelAdmin.ProxyPushSupplierHelper.narrow(_this_object(orb));
	}
	public ProxyPushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPushSupplierOperations delegate)
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
	public void connect_push_consumer(org.omg.hw.CosEventComm.PushConsumer push_consumer) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected
	{
_delegate.connect_push_consumer(push_consumer);
	}

	public void disconnect_push_supplier()
	{
_delegate.disconnect_push_supplier();
	}

}
