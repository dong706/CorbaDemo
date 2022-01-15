package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "EventChannel"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EventChannelOperations
	extends org.omg.hw.CosNotification.QoSAdminOperations , org.omg.hw.CosNotification.AdminPropertiesAdminOperations , org.omg.hw.CosEventChannelAdmin.EventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.hw.CosNotifyChannelAdmin.EventChannelFactory MyFactory();
	org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin default_consumer_admin();
	org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin default_supplier_admin();
	org.omg.hw.CosNotifyFilter.FilterFactory default_filter_factory();
	org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin new_for_consumers(org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id);
	org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin new_for_suppliers(org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id);
	org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin get_consumeradmin(int id) throws org.omg.hw.CosNotifyChannelAdmin.AdminNotFound;
	org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin get_supplieradmin(int id) throws org.omg.hw.CosNotifyChannelAdmin.AdminNotFound;
	int[] get_all_consumeradmins();
	int[] get_all_supplieradmins();
}
