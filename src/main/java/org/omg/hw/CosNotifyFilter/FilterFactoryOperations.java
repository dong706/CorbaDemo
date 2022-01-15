package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL interface "FilterFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface FilterFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.hw.CosNotifyFilter.Filter create_filter(java.lang.String constraint_grammar) throws org.omg.hw.CosNotifyFilter.InvalidGrammar;
	org.omg.hw.CosNotifyFilter.MappingFilter create_mapping_filter(java.lang.String constraint_grammar, org.omg.CORBA.Any default_value) throws org.omg.hw.CosNotifyFilter.InvalidGrammar;
}
