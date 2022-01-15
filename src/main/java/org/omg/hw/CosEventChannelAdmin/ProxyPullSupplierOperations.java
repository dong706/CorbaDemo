package org.omg.hw.CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProxyPullSupplierOperations
	extends org.omg.hw.CosEventComm.PullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_pull_consumer(org.omg.hw.CosEventComm.PullConsumer pull_consumer) throws org.omg.hw.CosEventChannelAdmin.AlreadyConnected;
}
