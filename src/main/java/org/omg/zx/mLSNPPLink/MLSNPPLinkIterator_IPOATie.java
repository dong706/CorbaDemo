package org.omg.zx.mLSNPPLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MLSNPPLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MLSNPPLinkIterator_IPOATie
	extends MLSNPPLinkIterator_IPOA
{
	private MLSNPPLinkIterator_IOperations _delegate;

	private POA _poa;
	public MLSNPPLinkIterator_IPOATie(MLSNPPLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPLinkIterator_IPOATie(MLSNPPLinkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_I _this()
	{
		return org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.narrow(_this_object());
	}
	public org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPLinkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPLinkIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mLSNPPLinkList);
	}

	public void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
