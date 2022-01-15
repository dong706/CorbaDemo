package org.omg.hw.CosNotifyComm;

/**
 *	Generated from IDL interface "NotifyPublish"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void offer_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType;
}
