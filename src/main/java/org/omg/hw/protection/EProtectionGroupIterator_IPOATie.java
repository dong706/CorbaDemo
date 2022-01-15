package org.omg.hw.protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EProtectionGroupIterator_IPOATie
	extends EProtectionGroupIterator_IPOA
{
	private EProtectionGroupIterator_IOperations _delegate;

	private POA _poa;
	public EProtectionGroupIterator_IPOATie(EProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EProtectionGroupIterator_IPOATie(EProtectionGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.protection.EProtectionGroupIterator_I _this()
	{
		return org.omg.hw.protection.EProtectionGroupIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.protection.EProtectionGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.protection.EProtectionGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public EProtectionGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EProtectionGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.protection.EProtectionGroupList_THolder ePGPList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,ePGPList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
