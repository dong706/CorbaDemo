package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of union "PhysicalLocationInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class PhysicalLocationInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.equipment.PhysicalLocationInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.equipment.PhysicalLocationInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/PhysicalLocationInfo_T:1.0";
	}
	public static PhysicalLocationInfo_T read (org.omg.CORBA.portable.InputStream in)
	{
		PhysicalLocationInfo_T result = new PhysicalLocationInfo_T ();
		org.omg.hw.equipment.ResourceTypeQualifier_T disc = org.omg.hw.equipment.ResourceTypeQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case org.omg.hw.equipment.ResourceTypeQualifier_T._EQTROOM:
			{
				org.omg.hw.equipment.EquipmentRoom_T _var;
				_var=org.omg.hw.equipment.EquipmentRoom_THelper.read(in);
				result.equipRoom (_var);
				break;
			}
			case org.omg.hw.equipment.ResourceTypeQualifier_T._CABINET:
			{
				org.omg.hw.equipment.Cabinet_T _var;
				_var=org.omg.hw.equipment.Cabinet_THelper.read(in);
				result.cabinet_ (_var);
				break;
			}
			case org.omg.hw.equipment.ResourceTypeQualifier_T._SHELF:
			{
				org.omg.hw.equipment.Shelf_T _var;
				_var=org.omg.hw.equipment.Shelf_THelper.read(in);
				result.shelf_ (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, PhysicalLocationInfo_T s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case org.omg.hw.equipment.ResourceTypeQualifier_T._EQTROOM:
			{
				org.omg.hw.equipment.EquipmentRoom_THelper.write(out,s.equipRoom ());
				break;
			}
			case org.omg.hw.equipment.ResourceTypeQualifier_T._CABINET:
			{
				org.omg.hw.equipment.Cabinet_THelper.write(out,s.cabinet_ ());
				break;
			}
			case org.omg.hw.equipment.ResourceTypeQualifier_T._SHELF:
			{
				org.omg.hw.equipment.Shelf_THelper.write(out,s.shelf_ ());
				break;
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[3];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.hw.equipment.ResourceTypeQualifier_THelper.insert(label_any, org.omg.hw.equipment.ResourceTypeQualifier_T.EQTROOM);
			members[2] = new org.omg.CORBA.UnionMember ("equipRoom", label_any, org.omg.hw.equipment.EquipmentRoom_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.hw.equipment.ResourceTypeQualifier_THelper.insert(label_any, org.omg.hw.equipment.ResourceTypeQualifier_T.CABINET);
			members[1] = new org.omg.CORBA.UnionMember ("cabinet_", label_any, org.omg.hw.equipment.Cabinet_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.hw.equipment.ResourceTypeQualifier_THelper.insert(label_any, org.omg.hw.equipment.ResourceTypeQualifier_T.SHELF);
			members[0] = new org.omg.CORBA.UnionMember ("shelf_", label_any, org.omg.hw.equipment.Shelf_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"PhysicalLocationInfo_T",org.omg.hw.equipment.ResourceTypeQualifier_THelper.type(), members);
		}
		return _type;
	}
}
