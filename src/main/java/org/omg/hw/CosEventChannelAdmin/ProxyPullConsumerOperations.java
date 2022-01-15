package org.omg.hw.CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProxyPullConsumerOperations
	extends org.omg.hw.CosEventComm.PullConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_pull_supplier(org.omg.hw.CosEventComm.PullSupplier pull_supplier) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected;
}
