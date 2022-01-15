package org.omg.hw.CORBA;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "NamedValue"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class NamedValuePOATie
	extends NamedValuePOA
{
	private NamedValueOperations _delegate;

	private POA _poa;
	public NamedValuePOATie(NamedValueOperations delegate)
	{
		_delegate = delegate;
	}
	public NamedValuePOATie(NamedValueOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CORBA.NamedValue _this()
	{
		return org.omg.hw.CORBA.NamedValueHelper.narrow(_this_object());
	}
	public org.omg.hw.CORBA.NamedValue _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CORBA.NamedValueHelper.narrow(_this_object(orb));
	}
	public NamedValueOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NamedValueOperations delegate)
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
}
