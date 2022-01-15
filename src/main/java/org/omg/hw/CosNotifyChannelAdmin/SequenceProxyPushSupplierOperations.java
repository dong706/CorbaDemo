package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface SequenceProxyPushSupplierOperations
	extends org.omg.hw.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.hw.CosNotifyComm.SequencePushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_push_consumer(org.omg.hw.CosNotifyComm.SequencePushConsumer push_consumer) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected;
	void suspend_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactive;
	void resume_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive;
}
