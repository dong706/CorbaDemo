package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface SequenceProxyPushConsumerOperations
	extends org.omg.hw.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.hw.CosNotifyComm.SequencePushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_push_supplier(org.omg.hw.CosNotifyComm.SequencePushSupplier push_supplier) throws org.omg.hw.CosEventChannelAdmin.AlreadyConnected;
}
