package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL interface "FilterAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface FilterAdminOperations
{
	/* constants */
	/* operations  */
	int add_filter(org.omg.hw.CosNotifyFilter.Filter new_filter);
	void remove_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound;
	org.omg.hw.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound;
	int[] get_all_filters();
	void remove_all_filters();
}
