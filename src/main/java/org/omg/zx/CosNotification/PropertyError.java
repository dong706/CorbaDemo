package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of struct "PropertyError"
 *	@author JacORB IDL compiler 
 */

public final class PropertyError
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropertyError(){}
	public org.omg.zx.CosNotification.QoSError_code code;
	public java.lang.String name;
	public org.omg.zx.CosNotification.PropertyRange available_range;
	public PropertyError(org.omg.zx.CosNotification.QoSError_code code, java.lang.String name, org.omg.zx.CosNotification.PropertyRange available_range)
	{
		this.code = code;
		this.name = name;
		this.available_range = available_range;
	}
}
