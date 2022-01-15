package org.omg.hw.CosNotifyComm;

/**
 *	Generated from IDL interface "StructuredPushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface StructuredPushConsumerOperations
	extends org.omg.hw.CosNotifyComm.NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void push_structured_event(org.omg.hw.CosNotification.StructuredEvent notification) throws org.omg.hw.CosEventComm.Disconnected;
	void disconnect_structured_push_consumer();
}
