package org.omg.hw.HW_mstpInventory;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_MSTPEndPointIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_MSTPEndPointIterator_IPOATie
	extends HW_MSTPEndPointIterator_IPOA
{
	private HW_MSTPEndPointIterator_IOperations _delegate;

	private POA _poa;
	public HW_MSTPEndPointIterator_IPOATie(HW_MSTPEndPointIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPEndPointIterator_IPOATie(HW_MSTPEndPointIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_mstpInventory.HW_MSTPEndPointIterator_I _this()
	{
		return org.omg.hw.HW_mstpInventory.HW_MSTPEndPointIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_mstpInventory.HW_MSTPEndPointIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_mstpInventory.HW_MSTPEndPointIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_MSTPEndPointIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPEndPointIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointList_THolder endPointList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,endPointList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
