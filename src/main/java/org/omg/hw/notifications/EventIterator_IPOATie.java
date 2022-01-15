package org.omg.hw.notifications;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EventIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EventIterator_IPOATie
	extends EventIterator_IPOA
{
	private EventIterator_IOperations _delegate;

	private POA _poa;
	public EventIterator_IPOATie(EventIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EventIterator_IPOATie(EventIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.notifications.EventIterator_I _this()
	{
		return org.omg.hw.notifications.EventIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.notifications.EventIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.notifications.EventIterator_IHelper.narrow(_this_object(orb));
	}
	public EventIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventIterator_IOperations delegate)
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
	public int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, org.omg.hw.notifications.EventList_THolder eventList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,eventList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
