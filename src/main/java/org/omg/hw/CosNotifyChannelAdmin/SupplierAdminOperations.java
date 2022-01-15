package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SupplierAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface SupplierAdminOperations
	extends org.omg.hw.CosNotification.QoSAdminOperations , org.omg.hw.CosNotifyComm.NotifyPublishOperations , org.omg.hw.CosNotifyFilter.FilterAdminOperations , org.omg.hw.CosEventChannelAdmin.SupplierAdminOperations
{
	/* constants */
	/* operations  */
	int MyID();
	org.omg.hw.CosNotifyChannelAdmin.EventChannel MyChannel();
	org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator();
	int[] pull_consumers();
	int[] push_consumers();
	org.omg.hw.CosNotifyChannelAdmin.ProxyConsumer get_proxy_consumer(int proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.ProxyNotFound;
	org.omg.hw.CosNotifyChannelAdmin.ProxyConsumer obtain_notification_pull_consumer(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded;
	org.omg.hw.CosNotifyChannelAdmin.ProxyConsumer obtain_notification_push_consumer(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded;
	void destroy();
}
