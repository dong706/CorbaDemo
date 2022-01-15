package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of exception "UnsupportedQoS"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedQoS
	extends org.omg.CORBA.UserException
{
	public UnsupportedQoS()
	{
		super(org.omg.zx.CosNotification.UnsupportedQoSHelper.id());
	}

	public org.omg.zx.CosNotification.PropertyError[] qos_err;
	public UnsupportedQoS(java.lang.String _reason,org.omg.zx.CosNotification.PropertyError[] qos_err)
	{
		super(org.omg.zx.CosNotification.UnsupportedQoSHelper.id()+ " " + _reason);
		this.qos_err = qos_err;
	}
	public UnsupportedQoS(org.omg.zx.CosNotification.PropertyError[] qos_err)
	{
		super(org.omg.zx.CosNotification.UnsupportedQoSHelper.id());
		this.qos_err = qos_err;
	}
}
