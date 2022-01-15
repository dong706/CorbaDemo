package org.omg.hw.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PushSupplierPOATie
	extends PushSupplierPOA
{
	private PushSupplierOperations _delegate;

	private POA _poa;
	public PushSupplierPOATie(PushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public PushSupplierPOATie(PushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyComm.PushSupplier _this()
	{
		return org.omg.hw.CosNotifyComm.PushSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyComm.PushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyComm.PushSupplierHelper.narrow(_this_object(orb));
	}
	public PushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PushSupplierOperations delegate)
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
	public void subscription_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void disconnect_push_supplier()
	{
_delegate.disconnect_push_supplier();
	}

}
