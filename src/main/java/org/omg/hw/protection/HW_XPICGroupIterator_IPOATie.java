package org.omg.hw.protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_XPICGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_XPICGroupIterator_IPOATie
	extends HW_XPICGroupIterator_IPOA
{
	private HW_XPICGroupIterator_IOperations _delegate;

	private POA _poa;
	public HW_XPICGroupIterator_IPOATie(HW_XPICGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_XPICGroupIterator_IPOATie(HW_XPICGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.protection.HW_XPICGroupIterator_I _this()
	{
		return org.omg.hw.protection.HW_XPICGroupIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.protection.HW_XPICGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.protection.HW_XPICGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_XPICGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_XPICGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.protection.HW_XPICGroupList_THolder xpicGroupList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,xpicGroupList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
