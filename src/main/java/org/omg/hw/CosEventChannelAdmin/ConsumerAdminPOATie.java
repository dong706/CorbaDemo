package org.omg.hw.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ConsumerAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ConsumerAdminPOATie
	extends ConsumerAdminPOA
{
	private ConsumerAdminOperations _delegate;

	private POA _poa;
	public ConsumerAdminPOATie(ConsumerAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public ConsumerAdminPOATie(ConsumerAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosEventChannelAdmin.ConsumerAdmin _this()
	{
		return org.omg.hw.CosEventChannelAdmin.ConsumerAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventChannelAdmin.ConsumerAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventChannelAdmin.ConsumerAdminHelper.narrow(_this_object(orb));
	}
	public ConsumerAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConsumerAdminOperations delegate)
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
	public org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		return _delegate.obtain_pull_supplier();
	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		return _delegate.obtain_push_supplier();
	}

}
