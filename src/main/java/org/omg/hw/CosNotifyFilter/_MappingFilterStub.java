package org.omg.hw.CosNotifyFilter;


/**
 *	Generated from IDL interface "MappingFilter"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _MappingFilterStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.CosNotifyFilter.MappingFilter
{
	private String[] ids = {"IDL:omg.org/CosNotifyFilter/MappingFilter:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.CosNotifyFilter.MappingFilterOperations.class;
	public org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] add_mapping_constraints(org.omg.hw.CosNotifyFilter.MappingConstraintPair[] pair_list) throws org.omg.hw.CosNotifyFilter.InvalidValue,org.omg.hw.CosNotifyFilter.InvalidConstraint
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "add_mapping_constraints", true);
				org.omg.hw.CosNotifyFilter.MappingConstraintPairSeqHelper.write(_os,pair_list);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] _result = org.omg.hw.CosNotifyFilter.MappingConstraintInfoSeqHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/InvalidValue:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.InvalidValueHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add_mapping_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] _result;			try
			{
			_result = _localServant.add_mapping_constraints(pair_list);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public java.lang.String constraint_grammar()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_constraint_grammar",true);
				_is = _invoke(_os);
				return _is.read_string();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_constraint_grammar", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			java.lang.String _result;
		try
		{
			_result = _localServant.constraint_grammar();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public boolean match_structured(org.omg.hw.CosNotification.StructuredEvent filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "match_structured", true);
				org.omg.hw.CosNotification.StructuredEventHelper.write(_os,filterable_data);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				result_to_set.value = _is.read_any();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.UnsupportedFilterableDataHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "match_structured", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			boolean _result;			try
			{
			_result = _localServant.match_structured(filterable_data,result_to_set);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CORBA.TypeCode value_type()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_value_type",true);
				_is = _invoke(_os);
				return org.omg.hw.CORBA.TypeCodeHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_value_type", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			org.omg.hw.CORBA.TypeCode _result;
		try
		{
			_result = _localServant.value_type();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CORBA.Any default_value()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_default_value",true);
				_is = _invoke(_os);
				return _is.read_any();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_default_value", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			org.omg.CORBA.Any _result;
		try
		{
			_result = _localServant.default_value();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void remove_all_mapping_constraints()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "remove_all_mapping_constraints", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_all_mapping_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			try
			{
			_localServant.remove_all_mapping_constraints();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void destroy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "destroy", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "destroy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			try
			{
			_localServant.destroy();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] get_mapping_constraints(int[] id_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_mapping_constraints", true);
				org.omg.hw.CosNotifyFilter.ConstraintIDSeqHelper.write(_os,id_list);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] _result = org.omg.hw.CosNotifyFilter.MappingConstraintInfoSeqHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_mapping_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] _result;			try
			{
			_result = _localServant.get_mapping_constraints(id_list);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean match_typed(org.omg.hw.CosNotification.Property[] filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "match_typed", true);
				org.omg.hw.CosNotification.PropertySeqHelper.write(_os,filterable_data);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				result_to_set.value = _is.read_any();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.UnsupportedFilterableDataHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "match_typed", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			boolean _result;			try
			{
			_result = _localServant.match_typed(filterable_data,result_to_set);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void modify_mapping_constraints(int[] del_list, org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] modify_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound,org.omg.hw.CosNotifyFilter.InvalidValue,org.omg.hw.CosNotifyFilter.InvalidConstraint
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modify_mapping_constraints", true);
				org.omg.hw.CosNotifyFilter.ConstraintIDSeqHelper.write(_os,del_list);
				org.omg.hw.CosNotifyFilter.MappingConstraintInfoSeqHelper.write(_os,modify_list);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNotifyFilter/InvalidValue:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.InvalidValueHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modify_mapping_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			try
			{
			_localServant.modify_mapping_constraints(del_list,modify_list);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] get_all_mapping_constraints()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_all_mapping_constraints", true);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] _result = org.omg.hw.CosNotifyFilter.MappingConstraintInfoSeqHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_mapping_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.MappingConstraintInfo[] _result;			try
			{
			_result = _localServant.get_all_mapping_constraints();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean match(org.omg.CORBA.Any filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "match", true);
				_os.write_any(filterable_data);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				result_to_set.value = _is.read_any();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.UnsupportedFilterableDataHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "match", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MappingFilterOperations _localServant = (MappingFilterOperations)_so.servant;
			boolean _result;			try
			{
			_result = _localServant.match(filterable_data,result_to_set);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

}
