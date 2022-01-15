package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of struct "NamedPropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class NamedPropertyRange
	implements org.omg.CORBA.portable.IDLEntity
{
	public NamedPropertyRange(){}
	public java.lang.String name;
	public org.omg.hw.CosNotification.PropertyRange range;
	public NamedPropertyRange(java.lang.String name, org.omg.hw.CosNotification.PropertyRange range)
	{
		this.name = name;
		this.range = range;
	}
}
