package org.omg.hw.CosNotification;

/**
 *	Generated from IDL definition of exception "UnsupportedQoS"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedQoS
	extends org.omg.CORBA.UserException
{
	public UnsupportedQoS()
	{
		super(org.omg.hw.CosNotification.UnsupportedQoSHelper.id());
	}

	public org.omg.hw.CosNotification.PropertyError[] qos_err;
	public UnsupportedQoS(java.lang.String _reason,org.omg.hw.CosNotification.PropertyError[] qos_err)
	{
		super(org.omg.hw.CosNotification.UnsupportedQoSHelper.id()+ " " + _reason);
		this.qos_err = qos_err;
	}
	public UnsupportedQoS(org.omg.hw.CosNotification.PropertyError[] qos_err)
	{
		super(org.omg.hw.CosNotification.UnsupportedQoSHelper.id());
		this.qos_err = qos_err;
	}
}
