package org.omg.hw.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "StructuredPushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class StructuredPushConsumerPOATie
	extends StructuredPushConsumerPOA
{
	private StructuredPushConsumerOperations _delegate;

	private POA _poa;
	public StructuredPushConsumerPOATie(StructuredPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredPushConsumerPOATie(StructuredPushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyComm.StructuredPushConsumer _this()
	{
		return org.omg.hw.CosNotifyComm.StructuredPushConsumerHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyComm.StructuredPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyComm.StructuredPushConsumerHelper.narrow(_this_object(orb));
	}
	public StructuredPushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredPushConsumerOperations delegate)
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
	public void offer_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

	public void push_structured_event(org.omg.hw.CosNotification.StructuredEvent notification) throws org.omg.hw.CosEventComm.Disconnected
	{
_delegate.push_structured_event(notification);
	}

	public void disconnect_structured_push_consumer()
	{
_delegate.disconnect_structured_push_consumer();
	}

}
