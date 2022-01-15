package org.omg.hw.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EventChannelFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EventChannelFactoryPOATie
	extends EventChannelFactoryPOA
{
	private EventChannelFactoryOperations _delegate;

	private POA _poa;
	public EventChannelFactoryPOATie(EventChannelFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public EventChannelFactoryPOATie(EventChannelFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyChannelAdmin.EventChannelFactory _this()
	{
		return org.omg.hw.CosNotifyChannelAdmin.EventChannelFactoryHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyChannelAdmin.EventChannelFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyChannelAdmin.EventChannelFactoryHelper.narrow(_this_object(orb));
	}
	public EventChannelFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventChannelFactoryOperations delegate)
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
	public org.omg.hw.CosNotifyChannelAdmin.EventChannel create_channel(org.omg.hw.CosNotification.Property[] initial_qos, org.omg.hw.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.hw.CosNotification.UnsupportedAdmin,org.omg.hw.CosNotification.UnsupportedQoS
	{
		return _delegate.create_channel(initial_qos,initial_admin,id);
	}

	public org.omg.hw.CosNotifyChannelAdmin.EventChannel get_event_channel(int id) throws org.omg.hw.CosNotifyChannelAdmin.ChannelNotFound
	{
		return _delegate.get_event_channel(id);
	}

	public int[] get_all_channels()
	{
		return _delegate.get_all_channels();
	}

}
