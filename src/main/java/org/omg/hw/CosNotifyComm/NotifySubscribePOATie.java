package org.omg.hw.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "NotifySubscribe"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class NotifySubscribePOATie
	extends NotifySubscribePOA
{
	private NotifySubscribeOperations _delegate;

	private POA _poa;
	public NotifySubscribePOATie(NotifySubscribeOperations delegate)
	{
		_delegate = delegate;
	}
	public NotifySubscribePOATie(NotifySubscribeOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyComm.NotifySubscribe _this()
	{
		return org.omg.hw.CosNotifyComm.NotifySubscribeHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyComm.NotifySubscribe _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyComm.NotifySubscribeHelper.narrow(_this_object(orb));
	}
	public NotifySubscribeOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NotifySubscribeOperations delegate)
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
	public void subscription_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

}
