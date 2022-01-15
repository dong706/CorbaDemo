package org.omg.hw.globaldefs;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "NamingAttributesIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class NamingAttributesIterator_IPOATie
	extends NamingAttributesIterator_IPOA
{
	private NamingAttributesIterator_IOperations _delegate;

	private POA _poa;
	public NamingAttributesIterator_IPOATie(NamingAttributesIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public NamingAttributesIterator_IPOATie(NamingAttributesIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.globaldefs.NamingAttributesIterator_I _this()
	{
		return org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.globaldefs.NamingAttributesIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.narrow(_this_object(orb));
	}
	public NamingAttributesIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NamingAttributesIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,nameList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
