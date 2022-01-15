package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of union "PhysicalLocationInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class PhysicalLocationInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.omg.hw.equipment.ResourceTypeQualifier_T discriminator;
	private org.omg.hw.equipment.EquipmentRoom_T equipRoom;
	private org.omg.hw.equipment.Cabinet_T cabinet_;
	private org.omg.hw.equipment.Shelf_T shelf_;

	public PhysicalLocationInfo_T ()
	{
	}

	public org.omg.hw.equipment.ResourceTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public org.omg.hw.equipment.EquipmentRoom_T equipRoom ()
	{
		if (discriminator != org.omg.hw.equipment.ResourceTypeQualifier_T.EQTROOM)
			throw new org.omg.CORBA.BAD_OPERATION();
		return equipRoom;
	}

	public void equipRoom (org.omg.hw.equipment.EquipmentRoom_T _x)
	{
		discriminator = org.omg.hw.equipment.ResourceTypeQualifier_T.EQTROOM;
		equipRoom = _x;
	}

	public org.omg.hw.equipment.Cabinet_T cabinet_ ()
	{
		if (discriminator != org.omg.hw.equipment.ResourceTypeQualifier_T.CABINET)
			throw new org.omg.CORBA.BAD_OPERATION();
		return cabinet_;
	}

	public void cabinet_ (org.omg.hw.equipment.Cabinet_T _x)
	{
		discriminator = org.omg.hw.equipment.ResourceTypeQualifier_T.CABINET;
		cabinet_ = _x;
	}

	public org.omg.hw.equipment.Shelf_T shelf_ ()
	{
		if (discriminator != org.omg.hw.equipment.ResourceTypeQualifier_T.SHELF)
			throw new org.omg.CORBA.BAD_OPERATION();
		return shelf_;
	}

	public void shelf_ (org.omg.hw.equipment.Shelf_T _x)
	{
		discriminator = org.omg.hw.equipment.ResourceTypeQualifier_T.SHELF;
		shelf_ = _x;
	}

}
