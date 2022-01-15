package org.omg.hw.CosNotifyComm;

/**
 *	Generated from IDL definition of exception "InvalidEventType"
 *	@author JacORB IDL compiler 
 */

public final class InvalidEventType
	extends org.omg.CORBA.UserException
{
	public InvalidEventType()
	{
		super(org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.id());
	}

	public org.omg.hw.CosNotification.EventType type;
	public InvalidEventType(java.lang.String _reason,org.omg.hw.CosNotification.EventType type)
	{
		super(org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.id()+ " " + _reason);
		this.type = type;
	}
	public InvalidEventType(org.omg.hw.CosNotification.EventType type)
	{
		super(org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.id());
		this.type = type;
	}
}
