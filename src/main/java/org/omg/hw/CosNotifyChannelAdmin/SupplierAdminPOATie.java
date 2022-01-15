package org.omg.hw.CosNotifyChannelAdmin;

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
	public org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin _this()
	{
		return org.omg.hw.CosNotifyChannelAdmin.SupplierAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyChannelAdmin.SupplierAdminHelper.narrow(_this_object(orb));
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
	public org.omg.hw.CosNotifyChannelAdmin.ProxyConsumer obtain_notification_push_consumer(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		return _delegate.obtain_notification_push_consumer(ctype,proxy_id);
	}

	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer()
	{
		return _delegate.obtain_pull_consumer();
	}

	public int[] pull_consumers()
	{
		return _delegate.pull_consumers();
	}

	public int MyID()
	{
		return _delegate.MyID();
	}

	public org.omg.hw.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer()
	{
		return _delegate.obtain_push_consumer();
	}

	public void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public org.omg.hw.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public int[] push_consumers()
	{
		return _delegate.push_consumers();
	}

	public org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator()
	{
		return _delegate.MyOperator();
	}

	public void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public int add_filter(org.omg.hw.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxyConsumer get_proxy_consumer(int proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.ProxyNotFound
	{
		return _delegate.get_proxy_consumer(proxy_id);
	}

	public void remove_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void offer_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public org.omg.hw.CosNotifyChannelAdmin.EventChannel MyChannel()
	{
		return _delegate.MyChannel();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxyConsumer obtain_notification_pull_consumer(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		return _delegate.obtain_notification_pull_consumer(ctype,proxy_id);
	}

}
