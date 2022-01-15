package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "StructuredProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface StructuredProxyPushSupplierOperations
	extends org.omg.hw.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.hw.CosNotifyComm.StructuredPushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_structured_push_consumer(org.omg.hw.CosNotifyComm.StructuredPushConsumer push_consumer) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected;
	void suspend_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactive;
	void resume_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive;
}
