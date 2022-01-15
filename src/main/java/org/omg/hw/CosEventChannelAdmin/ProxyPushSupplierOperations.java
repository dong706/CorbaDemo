package org.omg.hw.CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProxyPushSupplierOperations
	extends org.omg.hw.CosEventComm.PushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_push_consumer(org.omg.hw.CosEventComm.PushConsumer push_consumer) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected;
}
