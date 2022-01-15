package org.omg.hw.CORBA;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Principal"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PrincipalPOATie
	extends PrincipalPOA
{
	private PrincipalOperations _delegate;

	private POA _poa;
	public PrincipalPOATie(PrincipalOperations delegate)
	{
		_delegate = delegate;
	}
	public PrincipalPOATie(PrincipalOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CORBA.Principal _this()
	{
		return org.omg.hw.CORBA.PrincipalHelper.narrow(_this_object());
	}
	public org.omg.hw.CORBA.Principal _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CORBA.PrincipalHelper.narrow(_this_object(orb));
	}
	public PrincipalOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PrincipalOperations delegate)
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
