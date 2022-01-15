package org.omg.hw.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "StructuredProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class StructuredProxyPushSupplierPOATie
	extends StructuredProxyPushSupplierPOA
{
	private StructuredProxyPushSupplierOperations _delegate;

	private POA _poa;
	public StructuredProxyPushSupplierPOATie(StructuredProxyPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredProxyPushSupplierPOATie(StructuredProxyPushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushSupplier _this()
	{
		return org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.narrow(_this_object(orb));
	}
	public StructuredProxyPushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredProxyPushSupplierOperations delegate)
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
	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public org.omg.hw.CosNotification.EventType[] obtain_offered_types(org.omg.hw.CosNotifyChannelAdmin.ObtainInfoMode mode)
	{
		return _delegate.obtain_offered_types(mode);
	}

	public org.omg.hw.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public void suspend_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactive
	{
_delegate.suspend_connection();
	}

	public org.omg.hw.CosNotifyFilter.MappingFilter lifetime_filter()
	{
		return _delegate.lifetime_filter();
	}

	public void subscription_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxyType MyType()
	{
		return _delegate.MyType();
	}

	public org.omg.hw.CosNotifyFilter.MappingFilter priority_filter()
	{
		return _delegate.priority_filter();
	}

	public void disconnect_structured_push_supplier()
	{
_delegate.disconnect_structured_push_supplier();
	}

	public void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public org.omg.hw.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public void validate_event_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.validate_event_qos(required_qos,available_qos);
	}

	public void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public int add_filter(org.omg.hw.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void priority_filter(org.omg.hw.CosNotifyFilter.MappingFilter a)
	{
		_delegate.priority_filter(a);
	}

	public void resume_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive
	{
_delegate.resume_connection();
	}

	public void lifetime_filter(org.omg.hw.CosNotifyFilter.MappingFilter a)
	{
		_delegate.lifetime_filter(a);
	}

	public void remove_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void connect_structured_push_consumer(org.omg.hw.CosNotifyComm.StructuredPushConsumer push_consumer) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected
	{
_delegate.connect_structured_push_consumer(push_consumer);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin MyAdmin()
	{
		return _delegate.MyAdmin();
	}

}
