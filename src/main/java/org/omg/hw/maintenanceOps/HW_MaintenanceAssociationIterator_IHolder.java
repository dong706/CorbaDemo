package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL interface "HW_MaintenanceAssociationIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class HW_MaintenanceAssociationIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_MaintenanceAssociationIterator_I value;
	public HW_MaintenanceAssociationIterator_IHolder()
	{
	}
	public HW_MaintenanceAssociationIterator_IHolder (final HW_MaintenanceAssociationIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_MaintenanceAssociationIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MaintenanceAssociationIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_MaintenanceAssociationIterator_IHelper.write (_out,value);
	}
}
