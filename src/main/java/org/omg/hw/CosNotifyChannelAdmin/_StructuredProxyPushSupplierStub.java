package org.omg.hw.CosNotifyChannelAdmin;


/**
 *	Generated from IDL interface "StructuredProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _StructuredProxyPushSupplierStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushSupplier
{
	private String[] ids = {"IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPushSupplier:1.0","IDL:omg.org/CosNotifyChannelAdmin/ProxySupplier:1.0","IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0","IDL:omg.org/CosNotifyComm/StructuredPushSupplier:1.0","IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0","IDL:omg.org/CosNotification/QoSAdmin:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.CosNotifyChannelAdmin.StructuredProxyPushSupplierOperations.class;
	public int[] get_all_filters()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_all_filters", true);
				_is = _invoke(_os);
				int[] _result = org.omg.hw.CosNotifyFilter.FilterIDSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_filters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			int[] _result;			try
			{
			_result = _localServant.get_all_filters();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosNotification.EventType[] obtain_offered_types(org.omg.hw.CosNotifyChannelAdmin.ObtainInfoMode mode)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_offered_types", true);
				org.omg.hw.CosNotifyChannelAdmin.ObtainInfoModeHelper.write(_os,mode);
				_is = _invoke(_os);
				org.omg.hw.CosNotification.EventType[] _result = org.omg.hw.CosNotification.EventTypeSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_offered_types", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			org.omg.hw.CosNotification.EventType[] _result;			try
			{
			_result = _localServant.obtain_offered_types(mode);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosNotification.Property[] get_qos()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_qos", true);
				_is = _invoke(_os);
				org.omg.hw.CosNotification.Property[] _result = org.omg.hw.CosNotification.PropertySeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			org.omg.hw.CosNotification.Property[] _result;			try
			{
			_result = _localServant.get_qos();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void suspend_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactive
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "suspend_connection", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/NotConnected:1.0"))
				{
					throw org.omg.hw.CosNotifyChannelAdmin.NotConnectedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/ConnectionAlreadyInactive:1.0"))
				{
					throw org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "suspend_connection", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.suspend_connection();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.MappingFilter lifetime_filter()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_lifetime_filter",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyFilter.MappingFilterHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_lifetime_filter", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.MappingFilter _result;
		try
		{
			_result = _localServant.lifetime_filter();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void subscription_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "subscription_change", true);
				org.omg.hw.CosNotification.EventTypeSeqHelper.write(_os,added);
				org.omg.hw.CosNotification.EventTypeSeqHelper.write(_os,removed);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyComm/InvalidEventType:1.0"))
				{
					throw org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "subscription_change", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.subscription_change(added,removed);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxyType MyType()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_MyType",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyChannelAdmin.ProxyTypeHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_MyType", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			org.omg.hw.CosNotifyChannelAdmin.ProxyType _result;
		try
		{
			_result = _localServant.MyType();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.hw.CosNotifyFilter.MappingFilter priority_filter()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_priority_filter",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyFilter.MappingFilterHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_priority_filter", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.MappingFilter _result;
		try
		{
			_result = _localServant.priority_filter();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void disconnect_structured_push_supplier()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disconnect_structured_push_supplier", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disconnect_structured_push_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.disconnect_structured_push_supplier();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "validate_qos", true);
				org.omg.hw.CosNotification.PropertySeqHelper.write(_os,required_qos);
				_is = _invoke(_os);
				available_qos.value = org.omg.hw.CosNotification.NamedPropertyRangeSeqHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
				{
					throw org.omg.hw.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "validate_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.validate_qos(required_qos,available_qos);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_filter", true);
				_os.write_long(filter);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyFilter.Filter _result = org.omg.hw.CosNotifyFilter.FilterHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/FilterNotFound:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.Filter _result;			try
			{
			_result = _localServant.get_filter(filter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void validate_event_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "validate_event_qos", true);
				org.omg.hw.CosNotification.PropertySeqHelper.write(_os,required_qos);
				_is = _invoke(_os);
				available_qos.value = org.omg.hw.CosNotification.NamedPropertyRangeSeqHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
				{
					throw org.omg.hw.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "validate_event_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.validate_event_qos(required_qos,available_qos);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_qos", true);
				org.omg.hw.CosNotification.PropertySeqHelper.write(_os,qos);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
				{
					throw org.omg.hw.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.set_qos(qos);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public int add_filter(org.omg.hw.CosNotifyFilter.Filter new_filter)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "add_filter", true);
				org.omg.hw.CosNotifyFilter.FilterHelper.write(_os,new_filter);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.add_filter(new_filter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void priority_filter(org.omg.hw.CosNotifyFilter.MappingFilter a)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_set_priority_filter",true);
				org.omg.hw.CosNotifyFilter.MappingFilterHelper.write(_os,a);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_set_priority_filter", _opsClass);
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
				try
				{
					_localServant.priority_filter(a);
				}
				finally
				{
					_servant_postinvoke(_so);
				}
				return;
			}
		}

	}

	public void resume_connection() throws org.omg.hw.CosNotifyChannelAdmin.NotConnected,org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActive
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "resume_connection", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/NotConnected:1.0"))
				{
					throw org.omg.hw.CosNotifyChannelAdmin.NotConnectedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/ConnectionAlreadyActive:1.0"))
				{
					throw org.omg.hw.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "resume_connection", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.resume_connection();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void lifetime_filter(org.omg.hw.CosNotifyFilter.MappingFilter a)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_set_lifetime_filter",true);
				org.omg.hw.CosNotifyFilter.MappingFilterHelper.write(_os,a);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_set_lifetime_filter", _opsClass);
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
				try
				{
					_localServant.lifetime_filter(a);
				}
				finally
				{
					_servant_postinvoke(_so);
				}
				return;
			}
		}

	}

	public void remove_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "remove_filter", true);
				_os.write_long(filter);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/FilterNotFound:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.remove_filter(filter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void connect_structured_push_consumer(org.omg.hw.CosNotifyComm.StructuredPushConsumer push_consumer) throws org.omg.hw.CosEventChannelAdmin.TypeError,org.omg.hw.CosEventChannelAdmin.AlreadyConnected
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "connect_structured_push_consumer", true);
				org.omg.hw.CosNotifyComm.StructuredPushConsumerHelper.write(_os,push_consumer);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosEventChannelAdmin/TypeError:1.0"))
				{
					throw org.omg.hw.CosEventChannelAdmin.TypeErrorHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosEventChannelAdmin/AlreadyConnected:1.0"))
				{
					throw org.omg.hw.CosEventChannelAdmin.AlreadyConnectedHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "connect_structured_push_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.connect_structured_push_consumer(push_consumer);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void remove_all_filters()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "remove_all_filters", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_all_filters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			try
			{
			_localServant.remove_all_filters();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin MyAdmin()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_MyAdmin",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyChannelAdmin.ConsumerAdminHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_MyAdmin", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredProxyPushSupplierOperations _localServant = (StructuredProxyPushSupplierOperations)_so.servant;
			org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin _result;
		try
		{
			_result = _localServant.MyAdmin();
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
