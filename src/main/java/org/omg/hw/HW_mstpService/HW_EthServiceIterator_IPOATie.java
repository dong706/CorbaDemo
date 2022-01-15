package org.omg.hw.HW_mstpService;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_EthServiceIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_EthServiceIterator_IPOATie
	extends HW_EthServiceIterator_IPOA
{
	private HW_EthServiceIterator_IOperations _delegate;

	private POA _poa;
	public HW_EthServiceIterator_IPOATie(HW_EthServiceIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_EthServiceIterator_IPOATie(HW_EthServiceIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_mstpService.HW_EthServiceIterator_I _this()
	{
		return org.omg.hw.HW_mstpService.HW_EthServiceIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_mstpService.HW_EthServiceIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_mstpService.HW_EthServiceIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_EthServiceIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_EthServiceIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.HW_mstpService.HW_EthServiceList_THolder serviceList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,serviceList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
