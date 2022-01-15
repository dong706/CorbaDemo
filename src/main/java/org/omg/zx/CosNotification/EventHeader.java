package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "EventHeader"
 *	@author JacORB IDL compiler 
 */

public final class EventHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	public EventHeader(){}
	public org.omg.zx.CosNotification.FixedEventHeader fixed_header;
	public org.omg.zx.CosNotification.Property[] variable_header;
	public EventHeader(org.omg.zx.CosNotification.FixedEventHeader fixed_header, org.omg.zx.CosNotification.Property[] variable_header)
	{
		this.fixed_header = fixed_header;
		this.variable_header = variable_header;
	}
}
