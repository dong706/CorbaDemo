package org.omg.hw.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EventChannel"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EventChannelPOATie
	extends EventChannelPOA
{
	private EventChannelOperations _delegate;

	private POA _poa;
	public EventChannelPOATie(EventChannelOperations delegate)
	{
		_delegate = delegate;
	}
	public EventChannelPOATie(EventChannelOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyChannelAdmin.EventChannel _this()
	{
		return org.omg.hw.CosNotifyChannelAdmin.EventChannelHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyChannelAdmin.EventChannel _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyChannelAdmin.EventChannelHelper.narrow(_this_object(orb));
	}
	public EventChannelOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventChannelOperations delegate)
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
	public org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin new_for_consumers(org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id)
	{
		return _delegate.new_for_consumers(op,id);
	}

	public org.omg.hw.CosEventChannelAdmin.ConsumerAdmin for_consumers()
	{
		return _delegate.for_consumers();
	}

	public int[] get_all_consumeradmins()
	{
		return _delegate.get_all_consumeradmins();
	}

	public int[] get_all_supplieradmins()
	{
		return _delegate.get_all_supplieradmins();
	}

	public org.omg.hw.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public org.omg.hw.CosNotifyChannelAdmin.EventChannelFactory MyFactory()
	{
		return _delegate.MyFactory();
	}

	public org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin default_consumer_admin()
	{
		return _delegate.default_consumer_admin();
	}

	public org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin default_supplier_admin()
	{
		return _delegate.default_supplier_admin();
	}

	public org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin get_supplieradmin(int id) throws org.omg.hw.CosNotifyChannelAdmin.AdminNotFound
	{
		return _delegate.get_supplieradmin(id);
	}

	public void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public org.omg.hw.CosEventChannelAdmin.SupplierAdmin for_suppliers()
	{
		return _delegate.for_suppliers();
	}

	public void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public org.omg.hw.CosNotifyFilter.FilterFactory default_filter_factory()
	{
		return _delegate.default_filter_factory();
	}

	public void set_admin(org.omg.hw.CosNotification.Property[] admin) throws org.omg.hw.CosNotification.UnsupportedAdmin
	{
_delegate.set_admin(admin);
	}

	public org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin new_for_suppliers(org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id)
	{
		return _delegate.new_for_suppliers(op,id);
	}

	public org.omg.hw.CosNotification.Property[] get_admin()
	{
		return _delegate.get_admin();
	}

	public org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin get_consumeradmin(int id) throws org.omg.hw.CosNotifyChannelAdmin.AdminNotFound
	{
		return _delegate.get_consumeradmin(id);
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
