package org.omg.hw.CosNotifyComm;

/**
 *	Generated from IDL interface "SequencePushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface SequencePushConsumerOperations
	extends org.omg.hw.CosNotifyComm.NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void push_structured_events(org.omg.hw.CosNotification.StructuredEvent[] notifications) throws org.omg.hw.CosEventComm.Disconnected;
	void disconnect_sequence_push_consumer();
}
