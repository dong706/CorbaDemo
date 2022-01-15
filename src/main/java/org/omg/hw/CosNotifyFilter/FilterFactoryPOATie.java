package org.omg.hw.CosNotifyFilter;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "FilterFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class FilterFactoryPOATie
	extends FilterFactoryPOA
{
	private FilterFactoryOperations _delegate;

	private POA _poa;
	public FilterFactoryPOATie(FilterFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public FilterFactoryPOATie(FilterFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyFilter.FilterFactory _this()
	{
		return org.omg.hw.CosNotifyFilter.FilterFactoryHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyFilter.FilterFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyFilter.FilterFactoryHelper.narrow(_this_object(orb));
	}
	public FilterFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FilterFactoryOperations delegate)
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
	public org.omg.hw.CosNotifyFilter.MappingFilter create_mapping_filter(java.lang.String constraint_grammar, org.omg.CORBA.Any default_value) throws org.omg.hw.CosNotifyFilter.InvalidGrammar
	{
		return _delegate.create_mapping_filter(constraint_grammar,default_value);
	}

	public org.omg.hw.CosNotifyFilter.Filter create_filter(java.lang.String constraint_grammar) throws org.omg.hw.CosNotifyFilter.InvalidGrammar
	{
		return _delegate.create_filter(constraint_grammar);
	}

}
