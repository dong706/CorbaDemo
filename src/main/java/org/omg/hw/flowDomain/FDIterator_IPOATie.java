package org.omg.hw.flowDomain;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "FDIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class FDIterator_IPOATie
	extends FDIterator_IPOA
{
	private FDIterator_IOperations _delegate;

	private POA _poa;
	public FDIterator_IPOATie(FDIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FDIterator_IPOATie(FDIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.flowDomain.FDIterator_I _this()
	{
		return org.omg.hw.flowDomain.FDIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.flowDomain.FDIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.flowDomain.FDIterator_IHelper.narrow(_this_object(orb));
	}
	public FDIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FDIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.flowDomain.FDList_THolder fdList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,fdList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
