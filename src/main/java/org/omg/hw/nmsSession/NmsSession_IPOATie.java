package org.omg.hw.nmsSession;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "NmsSession_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class NmsSession_IPOATie
	extends NmsSession_IPOA
{
	private NmsSession_IOperations _delegate;

	private POA _poa;
	public NmsSession_IPOATie(NmsSession_IOperations delegate)
	{
		_delegate = delegate;
	}
	public NmsSession_IPOATie(NmsSession_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.nmsSession.NmsSession_I _this()
	{
		return org.omg.hw.nmsSession.NmsSession_IHelper.narrow(_this_object());
	}
	public org.omg.hw.nmsSession.NmsSession_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.nmsSession.NmsSession_IHelper.narrow(_this_object(orb));
	}
	public NmsSession_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NmsSession_IOperations delegate)
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
	public org.omg.hw.session.Session_I associatedSession()
	{
		return _delegate.associatedSession();
	}

	public void eventLossOccurred(java.lang.String startTime, java.lang.String notificationId)
	{
_delegate.eventLossOccurred(startTime,notificationId);
	}

	public void ping()
	{
_delegate.ping();
	}

	public void eventLossCleared(java.lang.String endTime)
	{
_delegate.eventLossCleared(endTime);
	}

	public void endSession()
	{
_delegate.endSession();
	}

}
