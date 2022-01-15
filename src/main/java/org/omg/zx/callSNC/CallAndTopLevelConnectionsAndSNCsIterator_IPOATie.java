package org.omg.zx.callSNC;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "CallAndTopLevelConnectionsAndSNCsIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class CallAndTopLevelConnectionsAndSNCsIterator_IPOATie
	extends CallAndTopLevelConnectionsAndSNCsIterator_IPOA
{
	private CallAndTopLevelConnectionsAndSNCsIterator_IOperations _delegate;

	private POA _poa;
	public CallAndTopLevelConnectionsAndSNCsIterator_IPOATie(CallAndTopLevelConnectionsAndSNCsIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CallAndTopLevelConnectionsAndSNCsIterator_IPOATie(CallAndTopLevelConnectionsAndSNCsIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I _this()
	{
		return org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.narrow(_this_object());
	}
	public org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.narrow(_this_object(orb));
	}
	public CallAndTopLevelConnectionsAndSNCsIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CallAndTopLevelConnectionsAndSNCsIterator_IOperations delegate)
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
	public int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,callAndTopLevelConnectionsAndSNCsList);
	}

	public void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
