package org.omg.hw.CORBA;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TypeCode"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TypeCodePOATie
	extends TypeCodePOA
{
	private TypeCodeOperations _delegate;

	private POA _poa;
	public TypeCodePOATie(TypeCodeOperations delegate)
	{
		_delegate = delegate;
	}
	public TypeCodePOATie(TypeCodeOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CORBA.TypeCode _this()
	{
		return org.omg.hw.CORBA.TypeCodeHelper.narrow(_this_object());
	}
	public org.omg.hw.CORBA.TypeCode _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CORBA.TypeCodeHelper.narrow(_this_object(orb));
	}
	public TypeCodeOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypeCodeOperations delegate)
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
