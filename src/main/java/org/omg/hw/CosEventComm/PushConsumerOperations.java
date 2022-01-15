package org.omg.hw.CosEventComm;

/**
 *	Generated from IDL interface "PushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface PushConsumerOperations
{
	/* constants */
	/* operations  */
	void push(org.omg.CORBA.Any data) throws org.omg.hw.CosEventComm.Disconnected;
	void disconnect_push_consumer();
}
