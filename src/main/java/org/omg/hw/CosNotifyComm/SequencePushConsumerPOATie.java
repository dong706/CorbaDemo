package org.omg.hw.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SequencePushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class SequencePushConsumerPOATie
	extends SequencePushConsumerPOA
{
	private SequencePushConsumerOperations _delegate;

	private POA _poa;
	public SequencePushConsumerPOATie(SequencePushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePushConsumerPOATie(SequencePushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyComm.SequencePushConsumer _this()
	{
		return org.omg.hw.CosNotifyComm.SequencePushConsumerHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyComm.SequencePushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyComm.SequencePushConsumerHelper.narrow(_this_object(orb));
	}
	public SequencePushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePushConsumerOperations delegate)
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

	public void disconnect_sequence_push_consumer()
	{
_delegate.disconnect_sequence_push_consumer();
	}

	public void push_structured_events(org.omg.hw.CosNotification.StructuredEvent[] notifications) throws org.omg.hw.CosEventComm.Disconnected
	{
_delegate.push_structured_events(notifications);
	}

}
