package org.omg.hw.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SequencePushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class SequencePushSupplierPOATie
	extends SequencePushSupplierPOA
{
	private SequencePushSupplierOperations _delegate;

	private POA _poa;
	public SequencePushSupplierPOATie(SequencePushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePushSupplierPOATie(SequencePushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyComm.SequencePushSupplier _this()
	{
		return org.omg.hw.CosNotifyComm.SequencePushSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyComm.SequencePushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyComm.SequencePushSupplierHelper.narrow(_this_object(orb));
	}
	public SequencePushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePushSupplierOperations delegate)
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

	public void disconnect_sequence_push_supplier()
	{
_delegate.disconnect_sequence_push_supplier();
	}

}
