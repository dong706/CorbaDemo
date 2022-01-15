package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "StructuredEvent"
 *	@author JacORB IDL compiler 
 */

public final class StructuredEvent
	implements org.omg.CORBA.portable.IDLEntity
{
	public StructuredEvent(){}
	public org.omg.hw.CosNotification.EventHeader header;
	public org.omg.hw.CosNotification.Property[] filterable_data;
	public org.omg.CORBA.Any remainder_of_body;
	public StructuredEvent(org.omg.hw.CosNotification.EventHeader header, org.omg.hw.CosNotification.Property[] filterable_data, org.omg.CORBA.Any remainder_of_body)
	{
		this.header = header;
		this.filterable_data = filterable_data;
		this.remainder_of_body = remainder_of_body;
	}
}
