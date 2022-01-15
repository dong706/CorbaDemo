package org.omg.hw.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "StructuredPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class StructuredPushSupplierPOATie
	extends StructuredPushSupplierPOA
{
	private StructuredPushSupplierOperations _delegate;

	private POA _poa;
	public StructuredPushSupplierPOATie(StructuredPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredPushSupplierPOATie(StructuredPushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyComm.StructuredPushSupplier _this()
	{
		return org.omg.hw.CosNotifyComm.StructuredPushSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyComm.StructuredPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyComm.StructuredPushSupplierHelper.narrow(_this_object(orb));
	}
	public StructuredPushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredPushSupplierOperations delegate)
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
	public void disconnect_structured_push_supplier()
	{
_delegate.disconnect_structured_push_supplier();
	}

	public void subscription_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

}
