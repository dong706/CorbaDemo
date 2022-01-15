package org.omg.hw.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EventChannel"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EventChannelPOATie
	extends EventChannelPOA
{
	private EventChannelOperations _delegate;

	private POA _poa;
	public EventChannelPOATie(EventChannelOperations delegate)
	{
		_delegate = delegate;
	}
	public EventChannelPOATie(EventChannelOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosEventChannelAdmin.EventChannel _this()
	{
		return org.omg.hw.CosEventChannelAdmin.EventChannelHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventChannelAdmin.EventChannel _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventChannelAdmin.EventChannelHelper.narrow(_this_object(orb));
	}
	public EventChannelOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventChannelOperations delegate)
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
	public org.omg.hw.CosEventChannelAdmin.ConsumerAdmin for_consumers()
	{
		return _delegate.for_consumers();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.hw.CosEventChannelAdmin.SupplierAdmin for_suppliers()
	{
		return _delegate.for_suppliers();
	}

}
