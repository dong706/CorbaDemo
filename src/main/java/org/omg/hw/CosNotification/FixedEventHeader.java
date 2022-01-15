package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "FixedEventHeader"
 *	@author JacORB IDL compiler 
 */

public final class FixedEventHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	public FixedEventHeader(){}
	public org.omg.hw.CosNotification.EventType event_type;
	public java.lang.String event_name = "";
	public FixedEventHeader(org.omg.hw.CosNotification.EventType event_type, java.lang.String event_name)
	{
		this.event_type = event_type;
		this.event_name = event_name;
	}
}
