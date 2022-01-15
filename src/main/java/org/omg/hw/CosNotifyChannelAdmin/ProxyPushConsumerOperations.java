package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProxyPushConsumerOperations
	extends org.omg.hw.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.hw.CosNotifyComm.PushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_any_push_supplier(org.omg.hw.CosEventComm.PushSupplier push_supplier) throws org.omg.hw.CosEventChannelAdmin.AlreadyConnected;
}
