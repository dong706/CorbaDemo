package org.omg.hw.CosEventComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PullSupplierPOATie
	extends PullSupplierPOA
{
	private PullSupplierOperations _delegate;

	private POA _poa;
	public PullSupplierPOATie(PullSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public PullSupplierPOATie(PullSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosEventComm.PullSupplier _this()
	{
		return org.omg.hw.CosEventComm.PullSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventComm.PullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventComm.PullSupplierHelper.narrow(_this_object(orb));
	}
	public PullSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PullSupplierOperations delegate)
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
	public void disconnect_pull_supplier()
	{
_delegate.disconnect_pull_supplier();
	}

	public org.omg.CORBA.Any pull() throws org.omg.hw.CosEventComm.Disconnected
	{
		return _delegate.pull();
	}

	public org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.hw.CosEventComm.Disconnected
	{
		return _delegate.try_pull(has_event);
	}

}
