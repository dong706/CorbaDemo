package org.omg.hw.CosNotifyChannelAdmin;

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
	public org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin _this()
	{
		return org.omg.hw.CosNotifyChannelAdmin.ConsumerAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyChannelAdmin.ConsumerAdminHelper.narrow(_this_object(orb));
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
	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		return _delegate.obtain_pull_supplier();
	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxySupplier get_proxy_supplier(int proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.ProxyNotFound
	{
		return _delegate.get_proxy_supplier(proxy_id);
	}

	public int MyID()
	{
		return _delegate.MyID();
	}

	public org.omg.hw.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public org.omg.hw.CosNotifyFilter.MappingFilter lifetime_filter()
	{
		return _delegate.lifetime_filter();
	}

	public void subscription_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public org.omg.hw.CosNotifyFilter.MappingFilter priority_filter()
	{
		return _delegate.priority_filter();
	}

	public void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public org.omg.hw.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxySupplier obtain_notification_pull_supplier(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		return _delegate.obtain_notification_pull_supplier(ctype,proxy_id);
	}

	public org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator()
	{
		return _delegate.MyOperator();
	}

	public int add_filter(org.omg.hw.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public void priority_filter(org.omg.hw.CosNotifyFilter.MappingFilter a)
	{
		_delegate.priority_filter(a);
	}

	public int[] pull_suppliers()
	{
		return _delegate.pull_suppliers();
	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxySupplier obtain_notification_push_supplier(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		return _delegate.obtain_notification_push_supplier(ctype,proxy_id);
	}

	public void lifetime_filter(org.omg.hw.CosNotifyFilter.MappingFilter a)
	{
		_delegate.lifetime_filter(a);
	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		return _delegate.obtain_push_supplier();
	}

	public void remove_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public org.omg.hw.CosNotifyChannelAdmin.EventChannel MyChannel()
	{
		return _delegate.MyChannel();
	}

	public int[] push_suppliers()
	{
		return _delegate.push_suppliers();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
