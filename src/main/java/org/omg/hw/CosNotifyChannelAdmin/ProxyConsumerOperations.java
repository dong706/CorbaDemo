package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "ProxyConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProxyConsumerOperations
	extends org.omg.hw.CosNotification.QoSAdminOperations , org.omg.hw.CosNotifyFilter.FilterAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.hw.CosNotifyChannelAdmin.ProxyType MyType();
	org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin MyAdmin();
	org.omg.hw.CosNotification.EventType[] obtain_subscription_types(org.omg.hw.CosNotifyChannelAdmin.ObtainInfoMode mode);
	void validate_event_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS;
}
