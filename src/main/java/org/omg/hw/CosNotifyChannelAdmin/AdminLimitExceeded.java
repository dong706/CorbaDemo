package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "AdminLimitExceeded"
 *	@author JacORB IDL compiler 
 */

public final class AdminLimitExceeded
	extends org.omg.CORBA.UserException
{
	public AdminLimitExceeded()
	{
		super(org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.id());
	}

	public org.omg.hw.CosNotifyChannelAdmin.AdminLimit admin_property_err;
	public AdminLimitExceeded(java.lang.String _reason,org.omg.hw.CosNotifyChannelAdmin.AdminLimit admin_property_err)
	{
		super(org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.id()+ " " + _reason);
		this.admin_property_err = admin_property_err;
	}
	public AdminLimitExceeded(org.omg.hw.CosNotifyChannelAdmin.AdminLimit admin_property_err)
	{
		super(org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.id());
		this.admin_property_err = admin_property_err;
	}
}
