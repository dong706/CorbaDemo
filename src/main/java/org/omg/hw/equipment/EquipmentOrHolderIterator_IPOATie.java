package org.omg.hw.equipment;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EquipmentOrHolderIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EquipmentOrHolderIterator_IPOATie
	extends EquipmentOrHolderIterator_IPOA
{
	private EquipmentOrHolderIterator_IOperations _delegate;

	private POA _poa;
	public EquipmentOrHolderIterator_IPOATie(EquipmentOrHolderIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EquipmentOrHolderIterator_IPOATie(EquipmentOrHolderIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.equipment.EquipmentOrHolderIterator_I _this()
	{
		return org.omg.hw.equipment.EquipmentOrHolderIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.equipment.EquipmentOrHolderIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.equipment.EquipmentOrHolderIterator_IHelper.narrow(_this_object(orb));
	}
	public EquipmentOrHolderIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EquipmentOrHolderIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.omg.hw.equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,equipmentOrHolderList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
