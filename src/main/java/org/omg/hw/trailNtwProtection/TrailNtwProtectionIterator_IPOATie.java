package org.omg.hw.trailNtwProtection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TrailNtwProtectionIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TrailNtwProtectionIterator_IPOATie
	extends TrailNtwProtectionIterator_IPOA
{
	private TrailNtwProtectionIterator_IOperations _delegate;

	private POA _poa;
	public TrailNtwProtectionIterator_IPOATie(TrailNtwProtectionIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrailNtwProtectionIterator_IPOATie(TrailNtwProtectionIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.trailNtwProtection.TrailNtwProtectionIterator_I _this()
	{
		return org.omg.hw.trailNtwProtection.TrailNtwProtectionIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.trailNtwProtection.TrailNtwProtectionIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.trailNtwProtection.TrailNtwProtectionIterator_IHelper.narrow(_this_object(orb));
	}
	public TrailNtwProtectionIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrailNtwProtectionIterator_IOperations delegate)
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
	public boolean next_n(int how_many, org.omg.hw.trailNtwProtection.TrailNtwProtectionList_THolder tnpList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tnpList);
	}

	public int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
