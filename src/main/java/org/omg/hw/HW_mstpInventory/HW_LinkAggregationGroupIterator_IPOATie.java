package org.omg.hw.HW_mstpInventory;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_LinkAggregationGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_LinkAggregationGroupIterator_IPOATie
	extends HW_LinkAggregationGroupIterator_IPOA
{
	private HW_LinkAggregationGroupIterator_IOperations _delegate;

	private POA _poa;
	public HW_LinkAggregationGroupIterator_IPOATie(HW_LinkAggregationGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_LinkAggregationGroupIterator_IPOATie(HW_LinkAggregationGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupIterator_I _this()
	{
		return org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_LinkAggregationGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_LinkAggregationGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupList_THolder lagList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,lagList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
