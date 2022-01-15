package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of union "EquipmentOrHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentOrHolder_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.omg.hw.equipment.EquipmentTypeQualifier_T discriminator;
	private org.omg.hw.equipment.Equipment_T equip;
	private org.omg.hw.equipment.EquipmentHolder_T holder;

	public EquipmentOrHolder_T ()
	{
	}

	public org.omg.hw.equipment.EquipmentTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public org.omg.hw.equipment.Equipment_T equip ()
	{
		if (discriminator != org.omg.hw.equipment.EquipmentTypeQualifier_T.EQT)
			throw new org.omg.CORBA.BAD_OPERATION();
		return equip;
	}

	public void equip (org.omg.hw.equipment.Equipment_T _x)
	{
		discriminator = org.omg.hw.equipment.EquipmentTypeQualifier_T.EQT;
		equip = _x;
	}

	public org.omg.hw.equipment.EquipmentHolder_T holder ()
	{
		if (discriminator != org.omg.hw.equipment.EquipmentTypeQualifier_T.EQT_HOLDER)
			throw new org.omg.CORBA.BAD_OPERATION();
		return holder;
	}

	public void holder (org.omg.hw.equipment.EquipmentHolder_T _x)
	{
		discriminator = org.omg.hw.equipment.EquipmentTypeQualifier_T.EQT_HOLDER;
		holder = _x;
	}

}
