package org.omg.hw.CosNotification;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "QoSAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class QoSAdminPOATie
	extends QoSAdminPOA
{
	private QoSAdminOperations _delegate;

	private POA _poa;
	public QoSAdminPOATie(QoSAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public QoSAdminPOATie(QoSAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotification.QoSAdmin _this()
	{
		return org.omg.hw.CosNotification.QoSAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotification.QoSAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotification.QoSAdminHelper.narrow(_this_object(orb));
	}
	public QoSAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QoSAdminOperations delegate)
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
	public void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public org.omg.hw.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

}
