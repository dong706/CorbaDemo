package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL interface "Filter"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface FilterOperations
{
	/* constants */
	/* operations  */
	java.lang.String constraint_grammar();
	org.omg.hw.CosNotifyFilter.ConstraintInfo[] add_constraints(org.omg.hw.CosNotifyFilter.ConstraintExp[] constraint_list) throws org.omg.hw.CosNotifyFilter.InvalidConstraint;
	void modify_constraints(int[] del_list, org.omg.hw.CosNotifyFilter.ConstraintInfo[] modify_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound,org.omg.hw.CosNotifyFilter.InvalidConstraint;
	org.omg.hw.CosNotifyFilter.ConstraintInfo[] get_constraints(int[] id_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound;
	org.omg.hw.CosNotifyFilter.ConstraintInfo[] get_all_constraints();
	void remove_all_constraints();
	void destroy();
	boolean match(org.omg.CORBA.Any filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData;
	boolean match_structured(org.omg.hw.CosNotification.StructuredEvent filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData;
	boolean match_typed(org.omg.hw.CosNotification.Property[] filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData;
	int attach_callback(org.omg.hw.CosNotifyComm.NotifySubscribe callback);
	void detach_callback(int callback) throws org.omg.hw.CosNotifyFilter.CallbackNotFound;
	int[] get_callbacks();
}
