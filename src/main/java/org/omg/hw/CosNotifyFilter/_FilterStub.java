package org.omg.hw.CosNotifyFilter;


/**
 *	Generated from IDL interface "Filter"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _FilterStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.CosNotifyFilter.Filter
{
	private String[] ids = {"IDL:omg.org/CosNotifyFilter/Filter:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.CosNotifyFilter.FilterOperations.class;
	public boolean match(org.omg.CORBA.Any filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
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
			FilterOperations _localServant = (FilterOperations)_so.servant;
			boolean _result;			try
			{
			_result = _localServant.match(filterable_data);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int[] get_callbacks()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_callbacks", true);
				_is = _invoke(_os);
				int[] _result = org.omg.hw.CosNotifyFilter.CallbackIDSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_callbacks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterOperations _localServant = (FilterOperations)_so.servant;
			int[] _result;			try
			{
			_result = _localServant.get_callbacks();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void detach_callback(int callback) throws org.omg.hw.CosNotifyFilter.CallbackNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "detach_callback", true);
				_os.write_long(callback);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/CallbackNotFound:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.CallbackNotFoundHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "detach_callback", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterOperations _localServant = (FilterOperations)_so.servant;
			try
			{
			_localServant.detach_callback(callback);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public int attach_callback(org.omg.hw.CosNotifyComm.NotifySubscribe callback)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "attach_callback", true);
				org.omg.hw.CosNotifyComm.NotifySubscribeHelper.write(_os,callback);
				_is = _invoke(_os);
				int _result = _is.read_long();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "attach_callback", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterOperations _localServant = (FilterOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.attach_callback(callback);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean match_typed(org.omg.hw.CosNotification.Property[] filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
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
			FilterOperations _localServant = (FilterOperations)_so.servant;
			boolean _result;			try
			{
			_result = _localServant.match_typed(filterable_data);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.ConstraintInfo[] get_all_constraints()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_all_constraints", true);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyFilter.ConstraintInfo[] _result = org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterOperations _localServant = (FilterOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.ConstraintInfo[] _result;			try
			{
			_result = _localServant.get_all_constraints();
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
			FilterOperations _localServant = (FilterOperations)_so.servant;
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

	public void remove_all_constraints()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "remove_all_constraints", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_all_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterOperations _localServant = (FilterOperations)_so.servant;
			try
			{
			_localServant.remove_all_constraints();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean match_structured(org.omg.hw.CosNotification.StructuredEvent filterable_data) throws org.omg.hw.CosNotifyFilter.UnsupportedFilterableData
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
			FilterOperations _localServant = (FilterOperations)_so.servant;
			boolean _result;			try
			{
			_result = _localServant.match_structured(filterable_data);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void modify_constraints(int[] del_list, org.omg.hw.CosNotifyFilter.ConstraintInfo[] modify_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound,org.omg.hw.CosNotifyFilter.InvalidConstraint
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modify_constraints", true);
				org.omg.hw.CosNotifyFilter.ConstraintIDSeqHelper.write(_os,del_list);
				org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.write(_os,modify_list);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modify_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterOperations _localServant = (FilterOperations)_so.servant;
			try
			{
			_localServant.modify_constraints(del_list,modify_list);
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
			FilterOperations _localServant = (FilterOperations)_so.servant;
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

	public org.omg.hw.CosNotifyFilter.ConstraintInfo[] add_constraints(org.omg.hw.CosNotifyFilter.ConstraintExp[] constraint_list) throws org.omg.hw.CosNotifyFilter.InvalidConstraint
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "add_constraints", true);
				org.omg.hw.CosNotifyFilter.ConstraintExpSeqHelper.write(_os,constraint_list);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyFilter.ConstraintInfo[] _result = org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterOperations _localServant = (FilterOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.ConstraintInfo[] _result;			try
			{
			_result = _localServant.add_constraints(constraint_list);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.ConstraintInfo[] get_constraints(int[] id_list) throws org.omg.hw.CosNotifyFilter.ConstraintNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_constraints", true);
				org.omg.hw.CosNotifyFilter.ConstraintIDSeqHelper.write(_os,id_list);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyFilter.ConstraintInfo[] _result = org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_constraints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterOperations _localServant = (FilterOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.ConstraintInfo[] _result;			try
			{
			_result = _localServant.get_constraints(id_list);
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
