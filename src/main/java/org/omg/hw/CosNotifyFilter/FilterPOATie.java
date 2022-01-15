package org.omg.hw.CosNotifyFilter;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Filter"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class FilterPOATie
	extends FilterPOA
{
	private FilterOperations _delegate;

	private POA _poa;
	public FilterPOATie(FilterOperations delegate)
	{
		_delegate = delegate;
	}
	public FilterPOATie(FilterOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.CosNotifyFilter.Filter _this()
	{
		return org.omg.hw.CosNotifyFilter.FilterHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyFilter.Filter _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyFilter.FilterHelper.narrow(_this_object(orb));
	}
	public FilterOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FilterOperations delegate)
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
	public boolean match(org.omg.CORBA.Any filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match(filterable_data);
	}

	public int[] get_callbacks()
	{
		return _delegate.get_callbacks();
	}

	public void detach_callback(int callback) throws org.omg.hw.CosNotifyFilter.CallbackNotFound
	{
_delegate.detach_callback(callback);
	}

	public int attach_callback(org.omg.hw.CosNotifyComm.NotifySubscribe callback)
	{
		return _delegate.attach_callback(callback);
	}

	public boolean match_typed(org.omg.hw.CosNotification.Property[] filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match_typed(filterable_data);
	}

	public org.omg.hw.CosNotifyFilter.ConstraintInfo[] get_all_constraints()
	{
		return _delegate.get_all_constraints();
	}

	public java.lang.String constraint_grammar()
	{
		return _delegate.constraint_grammar();
	}

	public void remove_all_constraints()
	{
_delegate.remove_all_constraints();
	}

	public boolean match_structured(org.omg.hw.CosNotification.StructuredEvent filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match_structured(filterable_data);
	}

	public void modify_constraints(int[] del_list, org.omg.hw.CosNotifyFilter.ConstraintInfo[] modify_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound,org.omg.hw.CosNotifyFilter.InvalidConstraint
	{
_delegate.modify_constraints(del_list,modify_list);
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.hw.CosNotifyFilter.ConstraintInfo[] add_constraints(org.omg.hw.CosNotifyFilter.ConstraintExp[] constraint_list) throws org.omg.hw.CosNotifyFilter.InvalidConstraint
	{
		return _delegate.add_constraints(constraint_list);
	}

	public org.omg.hw.CosNotifyFilter.ConstraintInfo[] get_constraints(int[] id_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound
	{
		return _delegate.get_constraints(id_list);
	}

}
