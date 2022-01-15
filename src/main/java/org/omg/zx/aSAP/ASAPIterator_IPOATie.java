package org.omg.zx.aSAP;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ASAPIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ASAPIterator_IPOATie
	extends ASAPIterator_IPOA
{
	private ASAPIterator_IOperations _delegate;

	private POA _poa;
	public ASAPIterator_IPOATie(ASAPIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ASAPIterator_IPOATie(ASAPIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.aSAP.ASAPIterator_I _this()
	{
		return org.omg.zx.aSAP.ASAPIterator_IHelper.narrow(_this_object());
	}
	public org.omg.zx.aSAP.ASAPIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.aSAP.ASAPIterator_IHelper.narrow(_this_object(orb));
	}
	public ASAPIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ASAPIterator_IOperations delegate)
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

	public void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, org.omg.zx.aSAP.ASAPList_THolder aSAPList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,aSAPList);
	}

}
