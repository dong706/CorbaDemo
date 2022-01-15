package org.omg.zx.CosNotification;

/**
 *	Generated from IDL definition of exception "UnsupportedAdmin"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedAdmin
	extends org.omg.CORBA.UserException
{
	public UnsupportedAdmin()
	{
		super(org.omg.zx.CosNotification.UnsupportedAdminHelper.id());
	}

	public org.omg.zx.CosNotification.PropertyError[] admin_err;
	public UnsupportedAdmin(java.lang.String _reason,org.omg.zx.CosNotification.PropertyError[] admin_err)
	{
		super(org.omg.zx.CosNotification.UnsupportedAdminHelper.id()+ " " + _reason);
		this.admin_err = admin_err;
	}
	public UnsupportedAdmin(org.omg.zx.CosNotification.PropertyError[] admin_err)
	{
		super(org.omg.zx.CosNotification.UnsupportedAdminHelper.id());
		this.admin_err = admin_err;
	}
}
