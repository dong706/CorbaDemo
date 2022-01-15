package org.omg.hw.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SupplierAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class SupplierAdminPOATie
	extends SupplierAdminPOA
{
	private SupplierAdminOperations _delegate;

	private POA _poa;
	public SupplierAdminPOATie(SupplierAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public SupplierAdminPOATie(SupplierAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosEventChannelAdmin.SupplierAdmin _this()
	{
		return org.omg.hw.CosEventChannelAdmin.SupplierAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventChannelAdmin.SupplierAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventChannelAdmin.SupplierAdminHelper.narrow(_this_object(orb));
	}
	public SupplierAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SupplierAdminOperations delegate)
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
	public org.omg.hw.CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer()
	{
		return _delegate.obtain_push_consumer();
	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer()
	{
		return _delegate.obtain_pull_consumer();
	}

}
