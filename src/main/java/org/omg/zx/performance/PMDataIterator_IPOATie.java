package org.omg.zx.performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PMDataIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PMDataIterator_IPOATie
	extends PMDataIterator_IPOA
{
	private PMDataIterator_IOperations _delegate;

	private POA _poa;
	public PMDataIterator_IPOATie(PMDataIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PMDataIterator_IPOATie(PMDataIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.performance.PMDataIterator_I _this()
	{
		return org.omg.zx.performance.PMDataIterator_IHelper.narrow(_this_object());
	}
	public org.omg.zx.performance.PMDataIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.performance.PMDataIterator_IHelper.narrow(_this_object(orb));
	}
	public PMDataIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PMDataIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.zx.performance.PMDataList_THolder pmDataList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,pmDataList);
	}

	public void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
