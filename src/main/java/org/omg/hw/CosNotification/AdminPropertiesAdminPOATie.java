package org.omg.hw.CosNotification;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "AdminPropertiesAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class AdminPropertiesAdminPOATie
	extends AdminPropertiesAdminPOA
{
	private AdminPropertiesAdminOperations _delegate;

	private POA _poa;
	public AdminPropertiesAdminPOATie(AdminPropertiesAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public AdminPropertiesAdminPOATie(AdminPropertiesAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotification.AdminPropertiesAdmin _this()
	{
		return org.omg.hw.CosNotification.AdminPropertiesAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotification.AdminPropertiesAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotification.AdminPropertiesAdminHelper.narrow(_this_object(orb));
	}
	public AdminPropertiesAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AdminPropertiesAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void set_admin(org.omg.hw.CosNotification.Property[] admin) throws org.omg.hw.CosNotification.UnsupportedAdmin
	{
_delegate.set_admin(admin);
	}

	public org.omg.hw.CosNotification.Property[] get_admin()
	{
		return _delegate.get_admin();
	}

}
