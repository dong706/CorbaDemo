package org.omg.hw.HW_mstpProtection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_RPRLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_RPRLinkIterator_IPOATie
	extends HW_RPRLinkIterator_IPOA
{
	private HW_RPRLinkIterator_IOperations _delegate;

	private POA _poa;
	public HW_RPRLinkIterator_IPOATie(HW_RPRLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_RPRLinkIterator_IPOATie(HW_RPRLinkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_mstpProtection.HW_RPRLinkIterator_I _this()
	{
		return org.omg.hw.HW_mstpProtection.HW_RPRLinkIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_mstpProtection.HW_RPRLinkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_mstpProtection.HW_RPRLinkIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_RPRLinkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_RPRLinkIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.HW_mstpProtection.HW_RPRLinkInfoList_THolder rprLinkList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,rprLinkList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
