package org.omg.hw.protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ProtectionGroupIterator_IPOATie
	extends ProtectionGroupIterator_IPOA
{
	private ProtectionGroupIterator_IOperations _delegate;

	private POA _poa;
	public ProtectionGroupIterator_IPOATie(ProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtectionGroupIterator_IPOATie(ProtectionGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.protection.ProtectionGroupIterator_I _this()
	{
		return org.omg.hw.protection.ProtectionGroupIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.protection.ProtectionGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.protection.ProtectionGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public ProtectionGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtectionGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.protection.ProtectionGroupList_THolder pgpList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,pgpList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
