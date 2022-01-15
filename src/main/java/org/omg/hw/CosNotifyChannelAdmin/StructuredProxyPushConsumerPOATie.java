package org.omg.hw.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "StructuredProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class StructuredProxyPushConsumerPOATie
	extends StructuredProxyPushConsumerPOA
{
	private StructuredProxyPushConsumerOperations _delegate;

	private POA _poa;
	public StructuredProxyPushConsumerPOATie(StructuredProxyPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredProxyPushConsumerPOATie(StructuredProxyPushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushConsumer _this()
	{
		return org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushConsumerHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushConsumerHelper.narrow(_this_object(orb));
	}
	public StructuredProxyPushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredProxyPushConsumerOperations delegate)
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
	public org.omg.hw.CosNotifyChannelAdmin.ProxyType MyType()
	{
		return _delegate.MyType();
	}

	public void validate_event_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.validate_event_qos(required_qos,available_qos);
	}

	public org.omg.hw.CosNotification.EventType[] obtain_subscription_types(org.omg.hw.CosNotifyChannelAdmin.ObtainInfoMode mode)
	{
		return _delegate.obtain_subscription_types(mode);
	}

	public int add_filter(org.omg.hw.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public void push_structured_event(org.omg.hw.CosNotification.StructuredEvent notification) throws org.omg.hw.CosEventComm.Disconnected
	{
_delegate.push_structured_event(notification);
	}

	public void disconnect_structured_push_consumer()
	{
_delegate.disconnect_structured_push_consumer();
	}

	public void remove_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public void connect_structured_push_supplier(org.omg.hw.CosNotifyComm.StructuredPushSupplier push_supplier) throws org.omg.hw.CosEventChannelAdmin.AlreadyConnected
	{
_delegate.connect_structured_push_supplier(push_supplier);
	}

	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public void offer_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

	public org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin MyAdmin()
	{
		return _delegate.MyAdmin();
	}

	public org.omg.hw.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public org.omg.hw.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

}
