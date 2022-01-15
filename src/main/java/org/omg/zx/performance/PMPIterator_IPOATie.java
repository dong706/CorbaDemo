package org.omg.zx.performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PMPIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PMPIterator_IPOATie
	extends PMPIterator_IPOA
{
	private PMPIterator_IOperations _delegate;

	private POA _poa;
	public PMPIterator_IPOATie(PMPIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PMPIterator_IPOATie(PMPIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.performance.PMPIterator_I _this()
	{
		return org.omg.zx.performance.PMPIterator_IHelper.narrow(_this_object());
	}
	public org.omg.zx.performance.PMPIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.performance.PMPIterator_IHelper.narrow(_this_object(orb));
	}
	public PMPIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PMPIterator_IOperations delegate)
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
	public boolean next_n(int how_many, org.omg.zx.performance.PMPList_THolder pmpList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,pmpList);
	}

	public int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
