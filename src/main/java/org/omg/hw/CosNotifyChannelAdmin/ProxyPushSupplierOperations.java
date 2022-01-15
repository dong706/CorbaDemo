package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProxyPushSupplierOperations
	extends org.omg.hw.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.hw.CosNotifyComm.PushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_any_push_consumer(org.omg.hw.CosEventComm.PushConsumer push_consumer) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected;
	void suspend_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactive;
	void resume_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive;
}
