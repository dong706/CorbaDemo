package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL interface "MappingFilter"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MappingFilterOperations
{
	/* constants */
	/* operations  */
	java.lang.String constraint_grammar();
	org.omg.hw.CORBA.TypeCode value_type();
	org.omg.CORBA.Any default_value();
	org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] add_mapping_constraints(org.omg.hw.CosNotifyFilter.MappingConstraintPair[] pair_list) throws org.omg.hw.CosNotifyFilter.InvalidValue,org.omg.hw.CosNotifyFilter.InvalidConstraint;
	void modify_mapping_constraints(int[] del_list, org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] modify_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound,org.omg.hw.CosNotifyFilter.InvalidValue,org.omg.hw.CosNotifyFilter.InvalidConstraint;
	org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] get_mapping_constraints(int[] id_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound;
	org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] get_all_mapping_constraints();
	void remove_all_mapping_constraints();
	void destroy();
	boolean match(org.omg.CORBA.Any filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData;
	boolean match_structured(org.omg.hw.CosNotification.StructuredEvent filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData;
	boolean match_typed(org.omg.hw.CosNotification.Property[] filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData;
}
