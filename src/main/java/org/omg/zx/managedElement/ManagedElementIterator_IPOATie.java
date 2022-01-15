package org.omg.zx.managedElement;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ManagedElementIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ManagedElementIterator_IPOATie
	extends ManagedElementIterator_IPOA
{
	private ManagedElementIterator_IOperations _delegate;

	private POA _poa;
	public ManagedElementIterator_IPOATie(ManagedElementIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ManagedElementIterator_IPOATie(ManagedElementIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.managedElement.ManagedElementIterator_I _this()
	{
		return org.omg.zx.managedElement.ManagedElementIterator_IHelper.narrow(_this_object());
	}
	public org.omg.zx.managedElement.ManagedElementIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.managedElement.ManagedElementIterator_IHelper.narrow(_this_object(orb));
	}
	public ManagedElementIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManagedElementIterator_IOperations delegate)
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

	public void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, org.omg.zx.managedElement.ManagedElementList_THolder meList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,meList);
	}

}
