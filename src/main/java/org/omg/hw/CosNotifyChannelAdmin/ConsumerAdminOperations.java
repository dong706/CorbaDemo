package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "ConsumerAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ConsumerAdminOperations
	extends org.omg.hw.CosNotification.QoSAdminOperations , org.omg.hw.CosNotifyComm.NotifySubscribeOperations , org.omg.hw.CosNotifyFilter.FilterAdminOperations , org.omg.hw.CosEventChannelAdmin.ConsumerAdminOperations
{
	/* constants */
	/* operations  */
	int MyID();
	org.omg.hw.CosNotifyChannelAdmin.EventChannel MyChannel();
	org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator();
	org.omg.hw.CosNotifyFilter.MappingFilter priority_filter();
	void priority_filter(org.omg.hw.CosNotifyFilter.MappingFilter arg);
	org.omg.hw.CosNotifyFilter.MappingFilter lifetime_filter();
	void lifetime_filter(org.omg.hw.CosNotifyFilter.MappingFilter arg);
	int[] pull_suppliers();
	int[] push_suppliers();
	org.omg.hw.CosNotifyChannelAdmin.ProxySupplier get_proxy_supplier(int proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.ProxyNotFound;
	org.omg.hw.CosNotifyChannelAdmin.ProxySupplier obtain_notification_pull_supplier(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded;
	org.omg.hw.CosNotifyChannelAdmin.ProxySupplier obtain_notification_push_supplier(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded;
	void destroy();
}
