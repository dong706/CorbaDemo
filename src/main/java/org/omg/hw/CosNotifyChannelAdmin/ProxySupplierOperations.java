package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "ProxySupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProxySupplierOperations
	extends org.omg.hw.CosNotification.QoSAdminOperations , org.omg.hw.CosNotifyFilter.FilterAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.hw.CosNotifyChannelAdmin.ProxyType MyType();
	org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin MyAdmin();
	org.omg.hw.CosNotifyFilter.MappingFilter priority_filter();
	void priority_filter(org.omg.hw.CosNotifyFilter.MappingFilter arg);
	org.omg.hw.CosNotifyFilter.MappingFilter lifetime_filter();
	void lifetime_filter(org.omg.hw.CosNotifyFilter.MappingFilter arg);
	org.omg.hw.CosNotification.EventType[] obtain_offered_types(org.omg.hw.CosNotifyChannelAdmin.ObtainInfoMode mode);
	void validate_event_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS;
}
