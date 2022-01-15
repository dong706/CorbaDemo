package org.omg.hw.CosNotifyFilter;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MappingFilter"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MappingFilterPOATie
	extends MappingFilterPOA
{
	private MappingFilterOperations _delegate;

	private POA _poa;
	public MappingFilterPOATie(MappingFilterOperations delegate)
	{
		_delegate = delegate;
	}
	public MappingFilterPOATie(MappingFilterOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyFilter.MappingFilter _this()
	{
		return org.omg.hw.CosNotifyFilter.MappingFilterHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyFilter.MappingFilter _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyFilter.MappingFilterHelper.narrow(_this_object(orb));
	}
	public MappingFilterOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MappingFilterOperations delegate)
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
	public org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] add_mapping_constraints(org.omg.hw.CosNotifyFilter.MappingConstraintPair[] pair_list) throws org.omg.hw.CosNotifyFilter.InvalidValue,org.omg.hw.CosNotifyFilter.InvalidConstraint
	{
		return _delegate.add_mapping_constraints(pair_list);
	}

	public java.lang.String constraint_grammar()
	{
		return _delegate.constraint_grammar();
	}

	public boolean match_structured(org.omg.hw.CosNotification.StructuredEvent filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match_structured(filterable_data,result_to_set);
	}

	public org.omg.hw.CORBA.TypeCode value_type()
	{
		return _delegate.value_type();
	}

	public org.omg.CORBA.Any default_value()
	{
		return _delegate.default_value();
	}

	public void remove_all_mapping_constraints()
	{
_delegate.remove_all_mapping_constraints();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] get_mapping_constraints(int[] id_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound
	{
		return _delegate.get_mapping_constraints(id_list);
	}

	public boolean match_typed(org.omg.hw.CosNotification.Property[] filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match_typed(filterable_data,result_to_set);
	}

	public void modify_mapping_constraints(int[] del_list, org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] modify_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound,org.omg.hw.CosNotifyFilter.InvalidValue,org.omg.hw.CosNotifyFilter.InvalidConstraint
	{
_delegate.modify_mapping_constraints(del_list,modify_list);
	}

	public org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] get_all_mapping_constraints()
	{
		return _delegate.get_all_mapping_constraints();
	}

	public boolean match(org.omg.CORBA.Any filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match(filterable_data,result_to_set);
	}

}
